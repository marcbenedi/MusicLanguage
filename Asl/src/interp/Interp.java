/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package interp;

import ML.ML;
import MusicalComponents.Voice;
import org.jfugue.midi.MidiFileManager;
import org.jfugue.pattern.Pattern;
import parser.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import org.jfugue.player.Player;

/** Class that implements the interpreter of the language. */

public class Interp {

    /** Memory of the virtual machine. */
    private Stack Stack;

    /**
     * Map between function names (keys) and ASTs (values).
     * Each entry of the map stores the root of the AST
     * correponding to the function.
     */
    private HashMap<String, MLTree> FuncName2Tree;
    private HashMap<String, MLTree> Piezzo2Tree;

    /** Standard input of the interpreter (System.in). */
    private Scanner stdin;

    /**
     * Stores the line number of the current statement.
     * The line number is used to report runtime errors.
     */
    private int linenumber = -1;

    /** File to write the trace of function calls. */
    private PrintWriter trace = null;

    /** Nested levels of function calls. */
    private int function_nesting = -1;

    /**
     * Constructor of the interpreter. It prepares the main
     * data structures for the execution of the main program.
     */
    public Interp(MLTree T, String tracefile) {
        assert T != null;
        MapFunctionsAndPiezzos(T);  // Creates the table to map function names into AST nodes
        PreProcessAST(T); // Some internal pre-processing ot the AST
        Stack = new Stack(); // Creates the memory of the virtual machine
        // Initializes the standard input of the program
        stdin = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
        if (tracefile != null) {
            try {
                trace = new PrintWriter(new FileWriter(tracefile));
            } catch (IOException e) {
                System.err.println(e);
                System.exit(1);
            }
        }
        function_nesting = -1;
    }

    /** Runs the program by calling the main function without parameters. */
    public void Run() {
        executeFunction ("main", null);
    }

    /** Returns the contents of the stack trace */
    public String getStackTrace() {
        return Stack.getStackTrace(lineNumber());
    }

    /** Returns a summarized contents of the stack trace */
    public String getStackTrace(int nitems) {
        return Stack.getStackTrace(lineNumber(), nitems);
    }

    /**
     * Gathers information from the AST and creates the map from
     * function names to the corresponding AST nodes.
     */
    private void MapFunctionsAndPiezzos(MLTree T) {
        assert T != null && T.getType() == MLLexer.LIST_FUNCTIONS;
        FuncName2Tree = new HashMap<String, MLTree> ();
        Piezzo2Tree = new HashMap<String, MLTree> ();
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) {
            MLTree f = T.getChild(i);
            String fname = f.getChild(0).getText();
            if (FuncName2Tree.containsKey(fname) ||  Piezzo2Tree.containsKey(fname)) {
                throw new RuntimeException("Multiple definitions of function " + fname);
            }
            if (f.getType() == MLLexer.FUNC) {
                FuncName2Tree.put(fname, f);
            } else if (f.getType() == MLLexer.PIEZZO) {
                Piezzo2Tree.put(fname, f);
            } else {
              assert false;
            }
        }
    }

    /**
     * Performs some pre-processing on the AST. Basically, it
     * calculates the value of the literals and stores a simpler
     * representation. See MLTree.java for details.
     */
    private void PreProcessAST(MLTree T) {
        if (T == null) return;
        switch(T.getType()) {
            case MLLexer.INT: T.setIntValue(); break;
            case MLLexer.STRING: T.setStringValue(); break;
            case MLLexer.BOOLEAN: T.setBooleanValue(); break;
            default: break;
        }
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) PreProcessAST(T.getChild(i));
    }

    /**
     * Gets the current line number. In case of a runtime error,
     * it returns the line number of the statement causing the
     * error.
     */
    public int lineNumber() { return linenumber; }

    /** Defines the current line number associated to an AST node. */
    private void setLineNumber(MLTree t) { linenumber = t.getLine();}

    /** Defines the current line number with a specific value */
    private void setLineNumber(int l) { linenumber = l;}

    private String getStandard(String n){
        String res = null;
        switch (n){
            case "Do":
                res = "C";
                break;
            case "Re":
                res = "D";
                break;
            case "Mi":
                res = "E";
                break;
            case "Fa":
                res = "F";
                break;
            case "Sol":
                res = "G";
                break;
            case "La":
                res = "A";
                break;
            case "Si":
                res = "B";
                break;
            case "Silenci":
                res = "R";
                break;
            default:
                res = n;
        }
        return res;
    }

    private int getTempo(String n){
        int res = 0;
        switch (n){
            case "Lento":
                res = 50;
                break;
            case "Adagio":
                res = 71;
                break;
            case "Moderato":
                res = 91;
                break;
            case "Allegro":
                res = 130;
                break;
            case "Presto":
                res = 185;
                break;
            default:
                res = 60;
        }
        return res;
    }

    private double figuraToDouble(MLTree nota){
        double t = 0.25;
        for (int i = 0; i < nota.getChildCount(); ++i){
            //System.out.println("nova iteracio");
            MLTree mod = nota.getChild(i);
            //System.out.println(mod.getText());

            if(mod.getType() == MLLexer.FIGURA){
                t = figureToDouble(mod.getText());
            }
            if(mod.getType() == MLLexer.PUNTET){
                t *=1.5;
            }
        }
        return t;
    }

    private double figureToDouble(String mod){
        double figure = 0.25;

                    switch (mod){
                        case "n":
                            figure = 0.25;
                            break;
                        case "b":
                            figure = 0.5;
                            break;
                        case "c":
                            figure = 0.125;
                            break;
                        case "sc":
                            figure = 0.0625;
                            break;
                        case "f":
                            figure = 0.03125;
                            break;
                        case "sf":
                            figure = 0.015625;
                            break;
                        case "r":
                            figure = 1.0;
                            break;
                    }

        return figure;

    }

    private String tocarNota(MLTree mods, MLTree nota){

        //System.out.println("Entrant a tocar nota");

        String premod = "";
        String oct = "";
        double figure = 0.25;

        for (int i = 0; i < nota.getChildCount(); ++i){
            //System.out.println("nova iteracio");
            MLTree mod = nota.getChild(i);
            //System.out.println(mod.getText());

            switch (mod.getType()){
                case MLLexer.PREMOD:
                        premod = mod.getText().equals("bm") ? "b" : "#";
                    break;
                case MLLexer.INT:
                        if (mod.getIntValue() < 0 || mod.getIntValue() > 10) throw new IllegalArgumentException("La octava no es correcte");
                        oct = String.valueOf(mod.getIntValue());
                    break;
                case MLLexer.FIGURA:
                        figure = figureToDouble(mod.getText());

                    break;
                case MLLexer.PUNTET:
                    //System.out.println("puntet");
                    figure*=1.5;
                    break;
            }

        }
        return getStandard(nota.getText())+premod+oct+"/"+String.valueOf(figure);

    }

    private String tocarCompas(MLTree mods, MLTree notes_acords,double beat){

        int num_notes_o_acords = notes_acords.getChildCount();
        String res = "";

        double figures_compas = 0.0;

        for (int i = 0; i < num_notes_o_acords; ++i){
            //System.out.println("Una altra iteracio");
            MLTree nota_o_acord = notes_acords.getChild(i);
            String nota_o_acord_text = nota_o_acord.getText();

            if(nota_o_acord_text.equals("ACORD")){

                //System.out.println("Toquem un acord");
                int num_notes = nota_o_acord.getChildCount();
                String converted_acord = tocarNota(mods,nota_o_acord.getChild(0));
                figures_compas += figuraToDouble(nota_o_acord.getChild(0));

                //TODO: Modificacions nota son modificacions acord
                for (int j = 1; j < num_notes; ++j){
                    converted_acord+="+"+tocarNota(mods,nota_o_acord.getChild(j));

                }

                res+=" "+converted_acord+" ";
            }
            else{
                //System.out.println("Toquem una nota");
                String trans_nota = tocarNota(mods,nota_o_acord);
                res+=" "+trans_nota+" ";
                //System.out.println(figuraToDouble(nota_o_acord));
                figures_compas += figuraToDouble(nota_o_acord);

            }
        }

        //System.out.println(figures_compas +" "+ beat);
        if(figures_compas != beat) throw new IllegalArgumentException("One of the compas has wrong compas");
        //System.out.println("Acabem de tocar el compas");
        return res;
    }

    private Voice tocarVeu(MLTree veu,double beat){

        Voice v = new Voice(Voice.avaiable_id);
        int num_comp = veu.getChildCount();

        for (int i= 1; i < num_comp; ++i) {
            //System.out.println("Estem tocant un compas");

            MLTree comp_o_rep = veu.getChild(i);
            String c = "";

            switch (comp_o_rep.getType()){
                case MLLexer.COMPAS:

                    int son = comp_o_rep.getChildCount();
                    MLTree mods_comp = null;
                    MLTree notes_acords = null;

                    if(son == 1) {
                        //No tenim mods
                        notes_acords = comp_o_rep.getChild(0);
                    }
                    else {
                        //Tenim mods
                        mods_comp = comp_o_rep.getChild(0);
                        notes_acords = comp_o_rep.getChild(1);
                    }

                    c= tocarCompas(mods_comp,notes_acords,beat);
                    v.addCompas(c);
                    break;

                case MLLexer.REP_COMPAS:

                    int reps = comp_o_rep.getChild(0).getIntValue();
                    //System.out.println(reps);
                    //El 0 és el número de repeticions
                    for (int j = 0; j < reps; ++j){

                        //Per cada repetició tocarem els compassos
                        int num_comps_en_repeticio = comp_o_rep.getChildCount();

                        for (int k = 1; k < num_comps_en_repeticio; ++k){//-1 perque el primer fill es el num_reps
                            //System.out.println("estem a la repetició "+j+" tocant el compas "+k);
                            MLTree comp_intern_repe = comp_o_rep.getChild(k);

                            int son_comp_repe = comp_intern_repe.getChildCount();
                            MLTree mods_comp_repe = null;
                            MLTree notes_acords_comp_repe = null;

                            boolean repe_time = true; //Aixi ens assegurem de que si no hi ha restricció ens tocaran

                            if(son_comp_repe == 1) {
                                //No tenim mods
                                notes_acords_comp_repe = comp_intern_repe.getChild(0);
                            }
                            else {
                                //Tenim mods
                                mods_comp_repe = comp_intern_repe.getChild(0);
                                notes_acords_comp_repe = comp_intern_repe.getChild(1);



                                for (int n = 0; n < mods_comp_repe.getChildCount(); ++n){

                                    MLTree mod = mods_comp_repe.getChild(n);

                                    switch (mod.getType()){
                                        case MLLexer.EXPR_TIME:
                                            Stack.defineVariable("TIME", new Data(j));
                                            boolean expr_value = evaluateExpression(mod.getChild(0)).getBooleanValue();

                                            repe_time = expr_value;
                                            break;
                                        case MLLexer.PARAULA_TEMPO:
                                            break;
                                        case MLLexer.PARAULA_INTENSITAT:
                                            break;

                                    }

                                }
                            }
                            if(repe_time){
                                c= tocarCompas(mods_comp_repe,notes_acords_comp_repe,beat);
                                //System.out.println("Repetico "+j+" Tocant el compas "+k);
                                v.addCompas(c);
                            }

                        }

                    }
                    break;
            }

        }
        v.addInstrument(veu.getChild(0).getText());
        return v;
    }

    private void executePiezzo(MLTree partitura){

        MLTree mods = partitura.getChild(0);
        MLTree veus = partitura.getChild(1);

        int tempo = 60;
        double beat_eq = 1;
        //TODO: Beat
        if(mods != null){
            //Hi ha modificacions de tempo i beat
            MLTree tempo_tree = mods.getChild(0);
            switch (tempo_tree.getType()){
                case MLLexer.FIGURA_TEMPO:
                    tempo = 60;
                    String nota = tempo_tree.getChild(0).getText();
                    switch (nota){
                        case "n":
                            tempo = evaluateExpression(tempo_tree.getChild(1)).getIntegerValue();
                            break;
                        case "b":
                            tempo = evaluateExpression(tempo_tree.getChild(1)).getIntegerValue()*2;
                            break;
                        case "c":
                            tempo = evaluateExpression(tempo_tree.getChild(1)).getIntegerValue()/2;
                            break;
                        case "sc":
                            tempo = evaluateExpression(tempo_tree.getChild(1)).getIntegerValue()/4;
                            break;
                        case "f":
                            tempo = evaluateExpression(tempo_tree.getChild(1)).getIntegerValue()/8;
                            break;
                        case "sf":
                            tempo = evaluateExpression(tempo_tree.getChild(1)).getIntegerValue()/16;
                            break;
                        case "r":
                            tempo = evaluateExpression(tempo_tree.getChild(1)).getIntegerValue()*4;
                            break;
                    }
                    break;
                case MLLexer.PARAULA_TEMPO:
                    tempo = getTempo(tempo_tree.getText());
                    break;
            }
            MLTree beat = mods.getChild(1);
            //TODO: Fer eval expression abans f'agafar una cosa perque poden ser variables. repassar el codi
            MLTree numerador = beat.getChild(0);
            MLTree denominador = beat.getChild(1);

            int num = evaluateExpression(numerador).getIntegerValue();
            int den = evaluateExpression(denominador).getIntegerValue();

//            Cifra 1: es la redonda, la figura mayor.
//            Cifra 2: indica la blanca, mitad de la redonda.
//            Cifra 4: indica la negra, un cuarto de la redonda.
//            Cifra 8: indica la corchea, un octavo de la redonda.

            double base = 0;

            switch (den) {
                case 1:
                    base = 1;
                    break;
                case 2:
                    base = 0.5;
                    break;
                case 4:
                    base = 0.25;
                    break;
                case 8:
                    base = 0.125;
                    break;
                default:
                    throw new IllegalArgumentException("The figure of the compass is not correct");
            }

            beat_eq = num * base;

        }

        Pattern pattern = new Pattern();
        pattern.setTempo(tempo);

        int num_veus = veus.getChildCount();
        for(int i = 0; i < num_veus; ++i){
            //System.out.println("Estem tocant la veu "+i);
            MLTree veu = veus.getChild(i);
            Voice v = tocarVeu(veu,beat_eq);
            //System.out.println(v.getString());
            pattern.add(v.getString());
        }
        //System.out.println("Ja hem acabat de tocar totes les veus");
        Player p = new Player();
        p.play(pattern);


        if (ML.midi)
            try {
                //p.saveMidi(pattern, new File("music-file.mid"));
                String name = ML.infile.substring(0, ML.infile.length()-3)+".mid";
                System.out.println("Program formatted to midi - "+name);
                MidiFileManager.savePatternToMidi(pattern, new File(name));
            } catch (IOException e) {
                // Handle the exception
            }


    }

    /**
     * Executes a function.
     * @param funcname The name of the function.
     * @param args The AST node representing the list of arguments of the caller.
     * @return The data returned by the function.
     */
    private Data executeFunction (String funcname, MLTree args) {
        Boolean piezzo = false;
        // Get the AST of the function
        MLTree f = FuncName2Tree.get(funcname);
        if (f == null) {
          f = Piezzo2Tree.get(funcname);
          if (f == null) {
            throw new RuntimeException(" function/piezzo  " + funcname + " not declared");
          }
          else {
            piezzo = true;
          }
        }
        // Gather the list of arguments of the caller. This function
        // performs all the checks required for the compatibility of
        // parameters.
        ArrayList<Data> Arg_values = listArguments(f, args);

        // Dumps trace information (function call and arguments)
        if (trace != null) traceFunctionCall(f, Arg_values);

        // List of parameters of the callee
        MLTree p = f.getChild(1);
        int nparam = p.getChildCount(); // Number of parameters

        // Create the activation record in memory
        Stack.pushActivationRecord(funcname, lineNumber());

        // Track line number
        setLineNumber(f);

        // Copy the parameters to the current activation record
        for (int i = 0; i < nparam; ++i) {
            String param_name = p.getChild(i).getText();
            Stack.defineVariable(param_name, Arg_values.get(i));
        }

        Data result = null;
        if(piezzo){
            executePiezzo(f.getChild(2));

        }
        else{
            // Execute the instructions
            result = executeListInstructions (f.getChild(2));
        }


        // If the result is null, then the function returns void
        if (result == null) result = new Data();

        // Dumps trace information
        if (trace != null) traceReturn(f, result, Arg_values);

        // Destroy the activation record
        Stack.popActivationRecord();

        return result;
    }

    /**
     * Executes a block of instructions. The block is terminated
     * as soon as an instruction returns a non-null result.
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the block of instructions.
     * @return The data returned by the instructions (null if no return
     * statement has been executed).
     */
    private Data executeListInstructions (MLTree t) {
        assert t != null;
        Data result = null;
        int ninstr = t.getChildCount();
        for (int i = 0; i < ninstr; ++i) {
            result = executeInstruction (t.getChild(i));
            if (result != null) return result;
        }
        return null;
    }

    /**
     * Executes an instruction.
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the instruction.
     * @return The data returned by the instruction. The data will be
     * non-null only if a return statement is executed or a block
     * of instructions executing a return.
     */
    private Data executeInstruction (MLTree t) {
        assert t != null;

        setLineNumber(t);
        Data value; // The returned value

        // A big switch for all type of instructions
        switch (t.getType()) {

            // Assignment
            case MLLexer.ASSIGN:
                value = evaluateExpression(t.getChild(1));
                Stack.defineVariable (t.getChild(0).getText(), value);
                return null;

            // If-then-else
            case MLLexer.IF:
                value = evaluateExpression(t.getChild(0));
                checkBoolean(value);
                if (value.getBooleanValue()) return executeListInstructions(t.getChild(1));
                // Is there else statement ?
                if (t.getChildCount() == 3) return executeListInstructions(t.getChild(2));
                return null;

            // While
            case MLLexer.WHILE:
                while (true) {
                    value = evaluateExpression(t.getChild(0));
                    checkBoolean(value);
                    if (!value.getBooleanValue()) return null;
                    Data r = executeListInstructions(t.getChild(1));
                    if (r != null) return r;
                }

            // Return
            case MLLexer.RETURN:
                if (t.getChildCount() != 0) {
                    return evaluateExpression(t.getChild(0));
                }
                return new Data(); // No expression: returns void data

            // Read statement: reads a variable and raises an exception
            // in case of a format error.
            case MLLexer.READ:
                String token = null;
                Data val = new Data(0);;
                try {
                    token = stdin.next();
                    val.setValue(Integer.parseInt(token));
                } catch (NumberFormatException ex) {
                    throw new RuntimeException ("Format error when reading a number: " + token);
                }
                Stack.defineVariable (t.getChild(0).getText(), val);
                return null;

            // Write statement: it can write an expression or a string.
            case MLLexer.WRITE:
                MLTree v = t.getChild(0);
                // Special case for strings
                if (v.getType() == MLLexer.STRING) {
                    System.out.format(v.getStringValue());
                    return null;
                }

                // Write an expression
                System.out.print(evaluateExpression(v).toString());
                return null;

            // Function call
            case MLLexer.FUNCALL:
                executeFunction(t.getChild(0).getText(), t.getChild(1));
                return null;

            default: assert false; // Should never happen
        }

        // All possible instructions should have been treated.
        assert false;
        return null;
    }

    /**
     * Evaluates the expression represented in the AST t.
     * @param t The AST of the expression
     * @return The value of the expression.
     */

    private Data evaluateExpression(MLTree t) {
        assert t != null;

        int previous_line = lineNumber();
        setLineNumber(t);
        int type = t.getType();

        Data value = null;
        // Atoms
        switch (type) {
            // A variable
            case MLLexer.ID:
                value = new Data(Stack.getVariable(t.getText()));
                break;
            // An integer literal
            case MLLexer.INT:
                value = new Data(t.getIntValue());
                break;
            // A Boolean literal
            case MLLexer.BOOLEAN:
                value = new Data(t.getBooleanValue());
                break;
            // A function call. Checks that the function returns a result.
            case MLLexer.FUNCALL:
                value = executeFunction(t.getChild(0).getText(), t.getChild(1));
                assert value != null;
                if (value.isVoid()) {
                    throw new RuntimeException ("function expected to return a value");
                }
                break;
            default: break;
        }

        // Retrieve the original line and return
        if (value != null) {
            setLineNumber(previous_line);
            return value;
        }

        // Unary operators
        value = evaluateExpression(t.getChild(0));
        if (t.getChildCount() == 1) {
            switch (type) {
                case MLLexer.PLUS:
                    checkInteger(value);
                    break;
                case MLLexer.MINUS:
                    checkInteger(value);
                    value.setValue(-value.getIntegerValue());
                    break;
                case MLLexer.NOT:
                    checkBoolean(value);
                    value.setValue(!value.getBooleanValue());
                    break;
                default: assert false; // Should never happen
            }
            setLineNumber(previous_line);
            return value;
        }

        // Two operands
        Data value2;
        switch (type) {
            // Relational operators
            case MLLexer.EQUAL:
            case MLLexer.NOT_EQUAL:
            case MLLexer.LT:
            case MLLexer.LE:
            case MLLexer.GT:
            case MLLexer.GE:
                value2 = evaluateExpression(t.getChild(1));
                if (value.getType() != value2.getType()) {
                  throw new RuntimeException ("Incompatible types in relational expression");
                }
                value = value.evaluateRelational(type, value2);
                break;

            // Arithmetic operators
            case MLLexer.PLUS:
            case MLLexer.MINUS:
            case MLLexer.MUL:
            case MLLexer.DIV:
            case MLLexer.MOD:
                value2 = evaluateExpression(t.getChild(1));
                checkInteger(value); checkInteger(value2);
                value.evaluateArithmetic(type, value2);
                break;

            // Boolean operators
            case MLLexer.AND:
            case MLLexer.OR:
                // The first operand is evaluated, but the second
                // is deferred (lazy, short-circuit evaluation).
                checkBoolean(value);
                value = evaluateBoolean(type, value, t.getChild(1));
                break;

            default: assert false; // Should never happen
        }

        setLineNumber(previous_line);
        return value;
    }

    /**
     * Evaluation of Boolean expressions. This function implements
     * a short-circuit evaluation. The second operand is still a tree
     * and is only evaluated if the value of the expression cannot be
     * determined by the first operand.
     * @param type Type of operator (token).
     * @param v First operand.
     * @param t AST node of the second operand.
     * @return An Boolean data with the value of the expression.
     */
    private Data evaluateBoolean (int type, Data v, MLTree t) {
        // Boolean evaluation with short-circuit

        switch (type) {
            case MLLexer.AND:
                // Short circuit if v is false
                if (!v.getBooleanValue()) return v;
                break;

            case MLLexer.OR:
                // Short circuit if v is true
                if (v.getBooleanValue()) return v;
                break;

            default: assert false;
        }

        // Return the value of the second expression
        v = evaluateExpression(t);
        checkBoolean(v);
        return v;
    }

    /** Checks that the data is Boolean and raises an exception if it is not. */
    private void checkBoolean (Data b) {
        if (!b.isBoolean()) {
            throw new RuntimeException ("Expecting Boolean expression");
        }
    }

    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkInteger (Data b) {
        if (!b.isInteger()) {
            throw new RuntimeException ("Expecting numerical expression");
        }
    }

    /**
     * Gathers the list of arguments of a function call. It also checks
     * that the arguments are compatible with the parameters. In particular,
     * it checks that the number of parameters is the same and that no
     * expressions are passed as parametres by reference.
     * @param AstF The AST of the callee.
     * @param args The AST of the list of arguments passed by the caller.
     * @return The list of evaluated arguments.
     */

    private ArrayList<Data> listArguments (MLTree AstF, MLTree args) {
        if (args != null) setLineNumber(args);
        MLTree pars = AstF.getChild(1);   // Parameters of the function

        // Create the list of parameters
        ArrayList<Data> Params = new ArrayList<Data> ();
        int n = pars.getChildCount();

        // Check that the number of parameters is the same
        int nargs = (args == null) ? 0 : args.getChildCount();
        if (n != nargs) {
            throw new RuntimeException ("Incorrect number of parameters calling function " +
                                        AstF.getChild(0).getText());
        }

        // Checks the compatibility of the parameters passed by
        // reference and calculates the values and references of
        // the parameters.
        for (int i = 0; i < n; ++i) {
            MLTree p = pars.getChild(i); // Parameters of the callee
            MLTree a = args.getChild(i); // Arguments passed by the caller
            setLineNumber(a);
            if (p.getType() == MLLexer.PVALUE) {
                // Pass by value: evaluate the expression
                Params.add(i,evaluateExpression(a));
            } else {
                // Pass by reference: check that it is a variable
                if (a.getType() != MLLexer.ID) {
                    throw new RuntimeException("Wrong argument for pass by reference");
                }
                // Find the variable and pass the reference
                Data v = Stack.getVariable(a.getText());
                Params.add(i,v);
            }
        }
        return Params;
    }

    /**
     * Writes trace information of a function call in the trace file.
     * The information is the name of the function, the value of the
     * parameters and the line number where the function call is produced.
     * @param f AST of the function
     * @param arg_values Values of the parameters passed to the function
     */
    private void traceFunctionCall(MLTree f, ArrayList<Data> arg_values) {
        function_nesting++;
        MLTree params = f.getChild(1);
        int nargs = params.getChildCount();

        for (int i=0; i < function_nesting; ++i) trace.print("|   ");

        // Print function name and parameters
        trace.print(f.getChild(0) + "(");
        for (int i = 0; i < nargs; ++i) {
            if (i > 0) trace.print(", ");
            MLTree p = params.getChild(i);
            if (p.getType() == MLLexer.PREF) trace.print("&");
            trace.print(p.getText() + "=" + arg_values.get(i));
        }
        trace.print(") ");

        if (function_nesting == 0) trace.println("<entry point>");
        else trace.println("<line " + lineNumber() + ">");
    }

    /**
     * Writes the trace information about the return of a function.
     * The information is the value of the returned value and of the
     * variables passed by reference. It also reports the line number
     * of the return.
     * @param f AST of the function
     * @param result The value of the result
     * @param arg_values The value of the parameters passed to the function
     */
    private void traceReturn(MLTree f, Data result, ArrayList<Data> arg_values) {
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");
        function_nesting--;
        trace.print("return");
        if (!result.isVoid()) trace.print(" " + result);

        // Print the value of arguments passed by reference
        MLTree params = f.getChild(1);
        int nargs = params.getChildCount();
        for (int i = 0; i < nargs; ++i) {
            MLTree p = params.getChild(i);
            if (p.getType() == MLLexer.PVALUE) continue;
            trace.print(", &" + p.getText() + "=" + arg_values.get(i));
        }

        trace.println(" <line " + lineNumber() + ">");
        if (function_nesting < 0) trace.close();
    }
}
