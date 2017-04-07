// $ANTLR 3.4 /home/marcbenedi/Programs/Asl/src/parser/Asl.g 2017-04-06 21:13:50

package parser;
import interp.AslTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


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
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACORD", "AND", "ARGLIST", "ARMADURA", "ASSIGN", "BEAT", "BOOLEAN", "COMMENT", "COMPAS", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDPIEZZO", "ENDWHILE", "EQUAL", "ESC_SEQ", "EXPR_TIME", "FALSE", "FIGURA", "FIGURA_TEMPO", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MODS", "MUL", "NOT", "NOTA_MUSICAL", "NOTES_ACORDS", "NOT_EQUAL", "OR", "PARAMS", "PARAULA_INTENSITAT", "PARAULA_TEMPO", "PARTITURA", "PIEZZO", "PLUS", "PREF", "PREMOD", "PUNTET", "PVALUE", "READ", "REPETICIO", "REP_COMPAS", "REP_OBRIR", "RETURN", "SEPARADOR_COMPAS", "SILENCI", "STRING", "TEMPO", "THEN", "TRUE", "VEGADA", "VEUS", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "'.'", "':'", "';'", "'Voice'", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int ACORD=4;
    public static final int AND=5;
    public static final int ARGLIST=6;
    public static final int ARMADURA=7;
    public static final int ASSIGN=8;
    public static final int BEAT=9;
    public static final int BOOLEAN=10;
    public static final int COMMENT=11;
    public static final int COMPAS=12;
    public static final int DIV=13;
    public static final int DO=14;
    public static final int ELSE=15;
    public static final int ENDFUNC=16;
    public static final int ENDIF=17;
    public static final int ENDPIEZZO=18;
    public static final int ENDWHILE=19;
    public static final int EQUAL=20;
    public static final int ESC_SEQ=21;
    public static final int EXPR_TIME=22;
    public static final int FALSE=23;
    public static final int FIGURA=24;
    public static final int FIGURA_TEMPO=25;
    public static final int FUNC=26;
    public static final int FUNCALL=27;
    public static final int GE=28;
    public static final int GT=29;
    public static final int ID=30;
    public static final int IF=31;
    public static final int INT=32;
    public static final int LE=33;
    public static final int LIST_FUNCTIONS=34;
    public static final int LIST_INSTR=35;
    public static final int LT=36;
    public static final int MINUS=37;
    public static final int MOD=38;
    public static final int MODS=39;
    public static final int MUL=40;
    public static final int NOT=41;
    public static final int NOTA_MUSICAL=42;
    public static final int NOTES_ACORDS=43;
    public static final int NOT_EQUAL=44;
    public static final int OR=45;
    public static final int PARAMS=46;
    public static final int PARAULA_INTENSITAT=47;
    public static final int PARAULA_TEMPO=48;
    public static final int PARTITURA=49;
    public static final int PIEZZO=50;
    public static final int PLUS=51;
    public static final int PREF=52;
    public static final int PREMOD=53;
    public static final int PUNTET=54;
    public static final int PVALUE=55;
    public static final int READ=56;
    public static final int REPETICIO=57;
    public static final int REP_COMPAS=58;
    public static final int REP_OBRIR=59;
    public static final int RETURN=60;
    public static final int SEPARADOR_COMPAS=61;
    public static final int SILENCI=62;
    public static final int STRING=63;
    public static final int TEMPO=64;
    public static final int THEN=65;
    public static final int TRUE=66;
    public static final int VEGADA=67;
    public static final int VEUS=68;
    public static final int WHILE=69;
    public static final int WRITE=70;
    public static final int WS=71;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AslParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AslParser.tokenNames; }
    public String getGrammarFileName() { return "/home/marcbenedi/Programs/Asl/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:69:1: prog : ( func_o_piezzo )+ EOF -> ^( LIST_FUNCTIONS ( func_o_piezzo )+ ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF2=null;
        AslParser.func_o_piezzo_return func_o_piezzo1 =null;


        AslTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func_o_piezzo=new RewriteRuleSubtreeStream(adaptor,"rule func_o_piezzo");
        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:69:6: ( ( func_o_piezzo )+ EOF -> ^( LIST_FUNCTIONS ( func_o_piezzo )+ ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:69:9: ( func_o_piezzo )+ EOF
            {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:69:9: ( func_o_piezzo )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC||LA1_0==PIEZZO) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:69:9: func_o_piezzo
            	    {
            	    pushFollow(FOLLOW_func_o_piezzo_in_prog227);
            	    func_o_piezzo1=func_o_piezzo();

            	    state._fsp--;

            	    stream_func_o_piezzo.add(func_o_piezzo1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog230);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: func_o_piezzo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 69:28: -> ^( LIST_FUNCTIONS ( func_o_piezzo )+ )
            {
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:69:31: ^( LIST_FUNCTIONS ( func_o_piezzo )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_func_o_piezzo.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_func_o_piezzo.hasNext() ) {
                    adaptor.addChild(root_1, stream_func_o_piezzo.nextTree());

                }
                stream_func_o_piezzo.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class func_o_piezzo_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_o_piezzo"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:72:1: func_o_piezzo : ( func | piezzo );
    public final AslParser.func_o_piezzo_return func_o_piezzo() throws RecognitionException {
        AslParser.func_o_piezzo_return retval = new AslParser.func_o_piezzo_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.func_return func3 =null;

        AslParser.piezzo_return piezzo4 =null;



        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:72:14: ( func | piezzo )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FUNC) ) {
                alt2=1;
            }
            else if ( (LA2_0==PIEZZO) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:72:16: func
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_func_in_func_o_piezzo255);
                    func3=func();

                    state._fsp--;

                    adaptor.addChild(root_0, func3.getTree());

                    }
                    break;
                case 2 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:72:23: piezzo
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_piezzo_in_func_o_piezzo259);
                    piezzo4=piezzo();

                    state._fsp--;

                    adaptor.addChild(root_0, piezzo4.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func_o_piezzo"


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:75:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC5=null;
        Token ID6=null;
        Token ENDFUNC9=null;
        AslParser.params_return params7 =null;

        AslParser.block_instructions_return block_instructions8 =null;


        AslTree FUNC5_tree=null;
        AslTree ID6_tree=null;
        AslTree ENDFUNC9_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:75:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:75:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC5=(Token)match(input,FUNC,FOLLOW_FUNC_in_func269); 
            FUNC5_tree = 
            (AslTree)adaptor.create(FUNC5)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC5_tree, root_0);


            ID6=(Token)match(input,ID,FOLLOW_ID_in_func272); 
            ID6_tree = 
            (AslTree)adaptor.create(ID6)
            ;
            adaptor.addChild(root_0, ID6_tree);


            pushFollow(FOLLOW_params_in_func274);
            params7=params();

            state._fsp--;

            adaptor.addChild(root_0, params7.getTree());

            pushFollow(FOLLOW_block_instructions_in_func276);
            block_instructions8=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions8.getTree());

            ENDFUNC9=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func278); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:79:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        AslParser.paramlist_return paramlist11 =null;


        AslTree char_literal10_tree=null;
        AslTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:79:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:79:10: '(' ( paramlist )? ')'
            {
            char_literal10=(Token)match(input,73,FOLLOW_73_in_params297);  
            stream_73.add(char_literal10);


            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:79:14: ( paramlist )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==72) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:79:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params299);
                    paramlist11=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist11.getTree());

                    }
                    break;

            }


            char_literal12=(Token)match(input,74,FOLLOW_74_in_params302);  
            stream_74.add(char_literal12);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 79:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:79:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:79:41: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:83:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal14=null;
        AslParser.param_return param13 =null;

        AslParser.param_return param15 =null;


        AslTree char_literal14_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:83:10: ( param ( ',' ! param )* )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:83:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist328);
            param13=param();

            state._fsp--;

            adaptor.addChild(root_0, param13.getTree());

            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:83:18: ( ',' ! param )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==75) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:83:19: ',' ! param
            	    {
            	    char_literal14=(Token)match(input,75,FOLLOW_75_in_paramlist331); 

            	    pushFollow(FOLLOW_param_in_paramlist334);
            	    param15=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param15.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:88:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal16=null;

        AslTree id_tree=null;
        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:88:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==72) ) {
                alt5=1;
            }
            else if ( (LA5_0==ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:88:13: '&' id= ID
                    {
                    char_literal16=(Token)match(input,72,FOLLOW_72_in_param359);  
                    stream_72.add(char_literal16);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param363);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 88:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:88:26: ^( PREF[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:89:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param386);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 89:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:89:22: ^( PVALUE[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class block_instructions_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:93:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal18=null;
        AslParser.instruction_return instruction17 =null;

        AslParser.instruction_return instruction19 =null;


        AslTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:94:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:94:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions420);
            instruction17=instruction();

            state._fsp--;

            stream_instruction.add(instruction17.getTree());

            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:94:24: ( ';' instruction )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==78) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:94:25: ';' instruction
            	    {
            	    char_literal18=(Token)match(input,78,FOLLOW_78_in_block_instructions423);  
            	    stream_78.add(char_literal18);


            	    pushFollow(FOLLOW_instruction_in_block_instructions425);
            	    instruction19=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction19.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 95:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:95:16: ^( LIST_INSTR ( instruction )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:99:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign20 =null;

        AslParser.ite_stmt_return ite_stmt21 =null;

        AslParser.while_stmt_return while_stmt22 =null;

        AslParser.funcall_return funcall23 =null;

        AslParser.return_stmt_return return_stmt24 =null;

        AslParser.read_return read25 =null;

        AslParser.write_return write26 =null;



        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:100:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
            int alt7=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EQUAL) ) {
                    alt7=1;
                }
                else if ( (LA7_1==73) ) {
                    alt7=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt7=2;
                }
                break;
            case WHILE:
                {
                alt7=3;
                }
                break;
            case RETURN:
                {
                alt7=5;
                }
                break;
            case READ:
                {
                alt7=6;
                }
                break;
            case WRITE:
                {
                alt7=7;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 78:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:100:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction474);
                    assign20=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign20.getTree());

                    }
                    break;
                case 2 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:101:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction496);
                    ite_stmt21=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt21.getTree());

                    }
                    break;
                case 3 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:102:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction516);
                    while_stmt22=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt22.getTree());

                    }
                    break;
                case 4 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:103:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction536);
                    funcall23=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall23.getTree());

                    }
                    break;
                case 5 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:104:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction557);
                    return_stmt24=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt24.getTree());

                    }
                    break;
                case 6 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:105:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction574);
                    read25=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read25.getTree());

                    }
                    break;
                case 7 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:106:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction599);
                    write26=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write26.getTree());

                    }
                    break;
                case 8 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:108:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:111:1: assign : ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID27=null;
        AslParser.expr_return expr28 =null;


        AslTree eq_tree=null;
        AslTree ID27_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:111:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:111:10: ID eq= EQUAL expr
            {
            ID27=(Token)match(input,ID,FOLLOW_ID_in_assign657);  
            stream_ID.add(ID27);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign661);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign663);
            expr28=expr();

            state._fsp--;

            stream_expr.add(expr28.getTree());

            // AST REWRITE
            // elements: expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 111:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:111:30: ^( ASSIGN[$eq,\":=\"] ID expr )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:115:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF29=null;
        Token THEN31=null;
        Token ELSE33=null;
        Token ENDIF35=null;
        AslParser.expr_return expr30 =null;

        AslParser.block_instructions_return block_instructions32 =null;

        AslParser.block_instructions_return block_instructions34 =null;


        AslTree IF29_tree=null;
        AslTree THEN31_tree=null;
        AslTree ELSE33_tree=null;
        AslTree ENDIF35_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:115:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:115:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF29=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt692); 
            IF29_tree = 
            (AslTree)adaptor.create(IF29)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF29_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt695);
            expr30=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr30.getTree());

            THEN31=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt697); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt700);
            block_instructions32=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions32.getTree());

            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:115:46: ( ELSE ! block_instructions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:115:47: ELSE ! block_instructions
                    {
                    ELSE33=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt703); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt706);
                    block_instructions34=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions34.getTree());

                    }
                    break;

            }


            ENDIF35=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt710); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:119:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE36=null;
        Token DO38=null;
        Token ENDWHILE40=null;
        AslParser.expr_return expr37 =null;

        AslParser.block_instructions_return block_instructions39 =null;


        AslTree WHILE36_tree=null;
        AslTree DO38_tree=null;
        AslTree ENDWHILE40_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:119:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:119:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE36=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt733); 
            WHILE36_tree = 
            (AslTree)adaptor.create(WHILE36)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE36_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt736);
            expr37=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr37.getTree());

            DO38=(Token)match(input,DO,FOLLOW_DO_in_while_stmt738); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt741);
            block_instructions39=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions39.getTree());

            ENDWHILE40=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt743); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:123:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN41=null;
        AslParser.expr_return expr42 =null;


        AslTree RETURN41_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:123:13: ( RETURN ^ ( expr )? )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:123:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN41=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt766); 
            RETURN41_tree = 
            (AslTree)adaptor.create(RETURN41)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN41_tree, root_0);


            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:123:23: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==73) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:123:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt769);
                    expr42=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr42.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class read_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:127:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ43=null;
        Token ID44=null;

        AslTree READ43_tree=null;
        AslTree ID44_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:127:6: ( READ ^ ID )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:127:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ43=(Token)match(input,READ,FOLLOW_READ_in_read788); 
            READ43_tree = 
            (AslTree)adaptor.create(READ43)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ43_tree, root_0);


            ID44=(Token)match(input,ID,FOLLOW_ID_in_read791); 
            ID44_tree = 
            (AslTree)adaptor.create(ID44)
            ;
            adaptor.addChild(root_0, ID44_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read"


    public static class write_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:131:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE45=null;
        Token STRING47=null;
        AslParser.expr_return expr46 =null;


        AslTree WRITE45_tree=null;
        AslTree STRING47_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:131:7: ( WRITE ^ ( expr | STRING ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:131:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE45=(Token)match(input,WRITE,FOLLOW_WRITE_in_write811); 
            WRITE45_tree = 
            (AslTree)adaptor.create(WRITE45)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE45_tree, root_0);


            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:131:18: ( expr | STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FALSE||LA10_0==ID||LA10_0==INT||LA10_0==MINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==TRUE||LA10_0==73) ) {
                alt10=1;
            }
            else if ( (LA10_0==STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:131:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write815);
                    expr46=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr46.getTree());

                    }
                    break;
                case 2 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:131:26: STRING
                    {
                    STRING47=(Token)match(input,STRING,FOLLOW_STRING_in_write819); 
                    STRING47_tree = 
                    (AslTree)adaptor.create(STRING47)
                    ;
                    adaptor.addChild(root_0, STRING47_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:135:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR49=null;
        AslParser.boolterm_return boolterm48 =null;

        AslParser.boolterm_return boolterm50 =null;


        AslTree OR49_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:135:9: ( boolterm ( OR ^ boolterm )* )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:135:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr844);
            boolterm48=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm48.getTree());

            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:135:22: ( OR ^ boolterm )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:135:23: OR ^ boolterm
            	    {
            	    OR49=(Token)match(input,OR,FOLLOW_OR_in_expr847); 
            	    OR49_tree = 
            	    (AslTree)adaptor.create(OR49)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR49_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr850);
            	    boolterm50=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm50.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:138:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND52=null;
        AslParser.boolfact_return boolfact51 =null;

        AslParser.boolfact_return boolfact53 =null;


        AslTree AND52_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:138:9: ( boolfact ( AND ^ boolfact )* )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:138:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm870);
            boolfact51=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact51.getTree());

            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:138:22: ( AND ^ boolfact )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:138:23: AND ^ boolfact
            	    {
            	    AND52=(Token)match(input,AND,FOLLOW_AND_in_boolterm873); 
            	    AND52_tree = 
            	    (AslTree)adaptor.create(AND52)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND52_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm876);
            	    boolfact53=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact53.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:141:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL55=null;
        Token NOT_EQUAL56=null;
        Token LT57=null;
        Token LE58=null;
        Token GT59=null;
        Token GE60=null;
        AslParser.num_expr_return num_expr54 =null;

        AslParser.num_expr_return num_expr61 =null;


        AslTree EQUAL55_tree=null;
        AslTree NOT_EQUAL56_tree=null;
        AslTree LT57_tree=null;
        AslTree LE58_tree=null;
        AslTree GT59_tree=null;
        AslTree GE60_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:141:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:141:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact896);
            num_expr54=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr54.getTree());

            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:141:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQUAL||(LA14_0 >= GE && LA14_0 <= GT)||LA14_0==LE||LA14_0==LT||LA14_0==NOT_EQUAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:141:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:141:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt13=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt13=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt13=2;
                        }
                        break;
                    case LT:
                        {
                        alt13=3;
                        }
                        break;
                    case LE:
                        {
                        alt13=4;
                        }
                        break;
                    case GT:
                        {
                        alt13=5;
                        }
                        break;
                    case GE:
                        {
                        alt13=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;

                    }

                    switch (alt13) {
                        case 1 :
                            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:141:24: EQUAL ^
                            {
                            EQUAL55=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact900); 
                            EQUAL55_tree = 
                            (AslTree)adaptor.create(EQUAL55)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL55_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:141:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL56=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact905); 
                            NOT_EQUAL56_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL56)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL56_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:141:46: LT ^
                            {
                            LT57=(Token)match(input,LT,FOLLOW_LT_in_boolfact910); 
                            LT57_tree = 
                            (AslTree)adaptor.create(LT57)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT57_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:141:52: LE ^
                            {
                            LE58=(Token)match(input,LE,FOLLOW_LE_in_boolfact915); 
                            LE58_tree = 
                            (AslTree)adaptor.create(LE58)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE58_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:141:58: GT ^
                            {
                            GT59=(Token)match(input,GT,FOLLOW_GT_in_boolfact920); 
                            GT59_tree = 
                            (AslTree)adaptor.create(GT59)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT59_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:141:64: GE ^
                            {
                            GE60=(Token)match(input,GE,FOLLOW_GE_in_boolfact925); 
                            GE60_tree = 
                            (AslTree)adaptor.create(GE60)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE60_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact929);
                    num_expr61=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr61.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:144:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS63=null;
        Token MINUS64=null;
        AslParser.term_return term62 =null;

        AslParser.term_return term65 =null;


        AslTree PLUS63_tree=null;
        AslTree MINUS64_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:144:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:144:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr949);
            term62=term();

            state._fsp--;

            adaptor.addChild(root_0, term62.getTree());

            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:144:18: ( ( PLUS ^| MINUS ^) term )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MINUS||LA16_0==PLUS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:144:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:144:20: ( PLUS ^| MINUS ^)
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==PLUS) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==MINUS) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:144:21: PLUS ^
            	            {
            	            PLUS63=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr954); 
            	            PLUS63_tree = 
            	            (AslTree)adaptor.create(PLUS63)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS63_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:144:29: MINUS ^
            	            {
            	            MINUS64=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr959); 
            	            MINUS64_tree = 
            	            (AslTree)adaptor.create(MINUS64)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS64_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr963);
            	    term65=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term65.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:147:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL67=null;
        Token DIV68=null;
        Token MOD69=null;
        AslParser.factor_return factor66 =null;

        AslParser.factor_return factor70 =null;


        AslTree MUL67_tree=null;
        AslTree DIV68_tree=null;
        AslTree MOD69_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:147:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:147:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term987);
            factor66=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor66.getTree());

            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:147:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==DIV||LA18_0==MOD||LA18_0==MUL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:147:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:147:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:147:23: MUL ^
            	            {
            	            MUL67=(Token)match(input,MUL,FOLLOW_MUL_in_term992); 
            	            MUL67_tree = 
            	            (AslTree)adaptor.create(MUL67)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL67_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:147:30: DIV ^
            	            {
            	            DIV68=(Token)match(input,DIV,FOLLOW_DIV_in_term997); 
            	            DIV68_tree = 
            	            (AslTree)adaptor.create(DIV68)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV68_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:147:37: MOD ^
            	            {
            	            MOD69=(Token)match(input,MOD,FOLLOW_MOD_in_term1002); 
            	            MOD69_tree = 
            	            (AslTree)adaptor.create(MOD69)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD69_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1006);
            	    factor70=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor70.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:150:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT71=null;
        Token PLUS72=null;
        Token MINUS73=null;
        AslParser.atom_return atom74 =null;


        AslTree NOT71_tree=null;
        AslTree PLUS72_tree=null;
        AslTree MINUS73_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:150:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:150:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:150:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt19=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt19=1;
                    }
                    break;
                case PLUS:
                    {
                    alt19=2;
                    }
                    break;
                case MINUS:
                    {
                    alt19=3;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:150:14: NOT ^
                    {
                    NOT71=(Token)match(input,NOT,FOLLOW_NOT_in_factor1029); 
                    NOT71_tree = 
                    (AslTree)adaptor.create(NOT71)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT71_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:150:21: PLUS ^
                    {
                    PLUS72=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1034); 
                    PLUS72_tree = 
                    (AslTree)adaptor.create(PLUS72)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS72_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:150:29: MINUS ^
                    {
                    MINUS73=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1039); 
                    MINUS73_tree = 
                    (AslTree)adaptor.create(MINUS73)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS73_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1044);
            atom74=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom74.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:156:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID75=null;
        Token INT76=null;
        Token char_literal78=null;
        Token char_literal80=null;
        AslParser.funcall_return funcall77 =null;

        AslParser.expr_return expr79 =null;


        AslTree b_tree=null;
        AslTree ID75_tree=null;
        AslTree INT76_tree=null;
        AslTree char_literal78_tree=null;
        AslTree char_literal80_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:156:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt21=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==73) ) {
                    alt21=4;
                }
                else if ( (LA21_1==AND||(LA21_1 >= DIV && LA21_1 <= ENDIF)||(LA21_1 >= ENDWHILE && LA21_1 <= EQUAL)||(LA21_1 >= GE && LA21_1 <= GT)||LA21_1==LE||(LA21_1 >= LT && LA21_1 <= MOD)||LA21_1==MUL||(LA21_1 >= NOT_EQUAL && LA21_1 <= OR)||LA21_1==PLUS||LA21_1==THEN||(LA21_1 >= 74 && LA21_1 <= 75)||LA21_1==78||LA21_1==83) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt21=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt21=3;
                }
                break;
            case 73:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:156:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID75=(Token)match(input,ID,FOLLOW_ID_in_atom1069); 
                    ID75_tree = 
                    (AslTree)adaptor.create(ID75)
                    ;
                    adaptor.addChild(root_0, ID75_tree);


                    }
                    break;
                case 2 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:157:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT76=(Token)match(input,INT,FOLLOW_INT_in_atom1083); 
                    INT76_tree = 
                    (AslTree)adaptor.create(INT76)
                    ;
                    adaptor.addChild(root_0, INT76_tree);


                    }
                    break;
                case 3 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:158:13: (b= TRUE |b= FALSE )
                    {
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:158:13: (b= TRUE |b= FALSE )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==TRUE) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==FALSE) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }
                    switch (alt20) {
                        case 1 :
                            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:158:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1100);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:158:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1106);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 158:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:158:36: ^( BOOLEAN[$b,$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:159:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1129);
                    funcall77=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall77.getTree());

                    }
                    break;
                case 5 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:160:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal78=(Token)match(input,73,FOLLOW_73_in_atom1143); 

                    pushFollow(FOLLOW_expr_in_atom1146);
                    expr79=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr79.getTree());

                    char_literal80=(Token)match(input,74,FOLLOW_74_in_atom1148); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:164:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID81=null;
        Token char_literal82=null;
        Token char_literal84=null;
        AslParser.expr_list_return expr_list83 =null;


        AslTree ID81_tree=null;
        AslTree char_literal82_tree=null;
        AslTree char_literal84_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:164:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:164:13: ID '(' ( expr_list )? ')'
            {
            ID81=(Token)match(input,ID,FOLLOW_ID_in_funcall1169);  
            stream_ID.add(ID81);


            char_literal82=(Token)match(input,73,FOLLOW_73_in_funcall1171);  
            stream_73.add(char_literal82);


            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:164:20: ( expr_list )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==FALSE||LA22_0==ID||LA22_0==INT||LA22_0==MINUS||LA22_0==NOT||LA22_0==PLUS||LA22_0==TRUE||LA22_0==73) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:164:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1173);
                    expr_list83=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list83.getTree());

                    }
                    break;

            }


            char_literal84=(Token)match(input,74,FOLLOW_74_in_funcall1176);  
            stream_74.add(char_literal84);


            // AST REWRITE
            // elements: ID, expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 164:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:164:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:164:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:164:61: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:168:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal86=null;
        AslParser.expr_return expr85 =null;

        AslParser.expr_return expr87 =null;


        AslTree char_literal86_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:168:10: ( expr ( ',' ! expr )* )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:168:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1209);
            expr85=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr85.getTree());

            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:168:18: ( ',' ! expr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==75) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:168:19: ',' ! expr
            	    {
            	    char_literal86=(Token)match(input,75,FOLLOW_75_in_expr_list1212); 

            	    pushFollow(FOLLOW_expr_in_expr_list1215);
            	    expr87=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr87.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"


    public static class piezzo_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "piezzo"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:190:1: piezzo : PIEZZO ^ ID params partitura ENDPIEZZO !;
    public final AslParser.piezzo_return piezzo() throws RecognitionException {
        AslParser.piezzo_return retval = new AslParser.piezzo_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PIEZZO88=null;
        Token ID89=null;
        Token ENDPIEZZO92=null;
        AslParser.params_return params90 =null;

        AslParser.partitura_return partitura91 =null;


        AslTree PIEZZO88_tree=null;
        AslTree ID89_tree=null;
        AslTree ENDPIEZZO92_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:190:8: ( PIEZZO ^ ID params partitura ENDPIEZZO !)
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:190:10: PIEZZO ^ ID params partitura ENDPIEZZO !
            {
            root_0 = (AslTree)adaptor.nil();


            PIEZZO88=(Token)match(input,PIEZZO,FOLLOW_PIEZZO_in_piezzo1239); 
            PIEZZO88_tree = 
            (AslTree)adaptor.create(PIEZZO88)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(PIEZZO88_tree, root_0);


            ID89=(Token)match(input,ID,FOLLOW_ID_in_piezzo1242); 
            ID89_tree = 
            (AslTree)adaptor.create(ID89)
            ;
            adaptor.addChild(root_0, ID89_tree);


            pushFollow(FOLLOW_params_in_piezzo1244);
            params90=params();

            state._fsp--;

            adaptor.addChild(root_0, params90.getTree());

            pushFollow(FOLLOW_partitura_in_piezzo1246);
            partitura91=partitura();

            state._fsp--;

            adaptor.addChild(root_0, partitura91.getTree());

            ENDPIEZZO92=(Token)match(input,ENDPIEZZO,FOLLOW_ENDPIEZZO_in_piezzo1249); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "piezzo"


    public static class nota_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nota"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:193:1: nota : ( ( ( PREMOD '.' )? ( INT )? NOTA_MUSICAL ( '.' FIGURA )? ( PUNTET )? ) -> ^( NOTA_MUSICAL ( PREMOD )? ( INT )? ( FIGURA )? ( PUNTET )? ) | SILENCI ( '.' FIGURA )? ( PUNTET )? ) ;
    public final AslParser.nota_return nota() throws RecognitionException {
        AslParser.nota_return retval = new AslParser.nota_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PREMOD93=null;
        Token char_literal94=null;
        Token INT95=null;
        Token NOTA_MUSICAL96=null;
        Token char_literal97=null;
        Token FIGURA98=null;
        Token PUNTET99=null;
        Token SILENCI100=null;
        Token char_literal101=null;
        Token FIGURA102=null;
        Token PUNTET103=null;

        AslTree PREMOD93_tree=null;
        AslTree char_literal94_tree=null;
        AslTree INT95_tree=null;
        AslTree NOTA_MUSICAL96_tree=null;
        AslTree char_literal97_tree=null;
        AslTree FIGURA98_tree=null;
        AslTree PUNTET99_tree=null;
        AslTree SILENCI100_tree=null;
        AslTree char_literal101_tree=null;
        AslTree FIGURA102_tree=null;
        AslTree PUNTET103_tree=null;
        RewriteRuleTokenStream stream_NOTA_MUSICAL=new RewriteRuleTokenStream(adaptor,"token NOTA_MUSICAL");
        RewriteRuleTokenStream stream_SILENCI=new RewriteRuleTokenStream(adaptor,"token SILENCI");
        RewriteRuleTokenStream stream_PREMOD=new RewriteRuleTokenStream(adaptor,"token PREMOD");
        RewriteRuleTokenStream stream_FIGURA=new RewriteRuleTokenStream(adaptor,"token FIGURA");
        RewriteRuleTokenStream stream_PUNTET=new RewriteRuleTokenStream(adaptor,"token PUNTET");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:193:5: ( ( ( ( PREMOD '.' )? ( INT )? NOTA_MUSICAL ( '.' FIGURA )? ( PUNTET )? ) -> ^( NOTA_MUSICAL ( PREMOD )? ( INT )? ( FIGURA )? ( PUNTET )? ) | SILENCI ( '.' FIGURA )? ( PUNTET )? ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:193:7: ( ( ( PREMOD '.' )? ( INT )? NOTA_MUSICAL ( '.' FIGURA )? ( PUNTET )? ) -> ^( NOTA_MUSICAL ( PREMOD )? ( INT )? ( FIGURA )? ( PUNTET )? ) | SILENCI ( '.' FIGURA )? ( PUNTET )? )
            {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:193:7: ( ( ( PREMOD '.' )? ( INT )? NOTA_MUSICAL ( '.' FIGURA )? ( PUNTET )? ) -> ^( NOTA_MUSICAL ( PREMOD )? ( INT )? ( FIGURA )? ( PUNTET )? ) | SILENCI ( '.' FIGURA )? ( PUNTET )? )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==INT||LA30_0==NOTA_MUSICAL||LA30_0==PREMOD) ) {
                alt30=1;
            }
            else if ( (LA30_0==SILENCI) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:7: ( ( PREMOD '.' )? ( INT )? NOTA_MUSICAL ( '.' FIGURA )? ( PUNTET )? )
                    {
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:7: ( ( PREMOD '.' )? ( INT )? NOTA_MUSICAL ( '.' FIGURA )? ( PUNTET )? )
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:8: ( PREMOD '.' )? ( INT )? NOTA_MUSICAL ( '.' FIGURA )? ( PUNTET )?
                    {
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:8: ( PREMOD '.' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==PREMOD) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:9: PREMOD '.'
                            {
                            PREMOD93=(Token)match(input,PREMOD,FOLLOW_PREMOD_in_nota1276);  
                            stream_PREMOD.add(PREMOD93);


                            char_literal94=(Token)match(input,76,FOLLOW_76_in_nota1277);  
                            stream_76.add(char_literal94);


                            }
                            break;

                    }


                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:21: ( INT )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==INT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:21: INT
                            {
                            INT95=(Token)match(input,INT,FOLLOW_INT_in_nota1281);  
                            stream_INT.add(INT95);


                            }
                            break;

                    }


                    NOTA_MUSICAL96=(Token)match(input,NOTA_MUSICAL,FOLLOW_NOTA_MUSICAL_in_nota1284);  
                    stream_NOTA_MUSICAL.add(NOTA_MUSICAL96);


                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:51: ( '.' FIGURA )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==76) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:52: '.' FIGURA
                            {
                            char_literal97=(Token)match(input,76,FOLLOW_76_in_nota1289);  
                            stream_76.add(char_literal97);


                            FIGURA98=(Token)match(input,FIGURA,FOLLOW_FIGURA_in_nota1291);  
                            stream_FIGURA.add(FIGURA98);


                            }
                            break;

                    }


                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:65: ( PUNTET )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==PUNTET) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:65: PUNTET
                            {
                            PUNTET99=(Token)match(input,PUNTET,FOLLOW_PUNTET_in_nota1295);  
                            stream_PUNTET.add(PUNTET99);


                            }
                            break;

                    }


                    }


                    // AST REWRITE
                    // elements: FIGURA, PREMOD, INT, PUNTET, NOTA_MUSICAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 194:74: -> ^( NOTA_MUSICAL ( PREMOD )? ( INT )? ( FIGURA )? ( PUNTET )? )
                    {
                        // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:77: ^( NOTA_MUSICAL ( PREMOD )? ( INT )? ( FIGURA )? ( PUNTET )? )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        stream_NOTA_MUSICAL.nextNode()
                        , root_1);

                        // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:92: ( PREMOD )?
                        if ( stream_PREMOD.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_PREMOD.nextNode()
                            );

                        }
                        stream_PREMOD.reset();

                        // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:100: ( INT )?
                        if ( stream_INT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_INT.nextNode()
                            );

                        }
                        stream_INT.reset();

                        // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:105: ( FIGURA )?
                        if ( stream_FIGURA.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_FIGURA.nextNode()
                            );

                        }
                        stream_FIGURA.reset();

                        // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:194:113: ( PUNTET )?
                        if ( stream_PUNTET.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_PUNTET.nextNode()
                            );

                        }
                        stream_PUNTET.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:195:9: SILENCI ( '.' FIGURA )? ( PUNTET )?
                    {
                    SILENCI100=(Token)match(input,SILENCI,FOLLOW_SILENCI_in_nota1325);  
                    stream_SILENCI.add(SILENCI100);


                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:195:17: ( '.' FIGURA )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==76) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:195:18: '.' FIGURA
                            {
                            char_literal101=(Token)match(input,76,FOLLOW_76_in_nota1328);  
                            stream_76.add(char_literal101);


                            FIGURA102=(Token)match(input,FIGURA,FOLLOW_FIGURA_in_nota1329);  
                            stream_FIGURA.add(FIGURA102);


                            }
                            break;

                    }


                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:195:30: ( PUNTET )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==PUNTET) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:195:30: PUNTET
                            {
                            PUNTET103=(Token)match(input,PUNTET,FOLLOW_PUNTET_in_nota1333);  
                            stream_PUNTET.add(PUNTET103);


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nota"


    public static class acord_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "acord"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:199:1: acord : '[' nota ( ',' nota )+ ']' -> ^( ACORD nota ( nota )+ ) ;
    public final AslParser.acord_return acord() throws RecognitionException {
        AslParser.acord_return retval = new AslParser.acord_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal104=null;
        Token char_literal106=null;
        Token char_literal108=null;
        AslParser.nota_return nota105 =null;

        AslParser.nota_return nota107 =null;


        AslTree char_literal104_tree=null;
        AslTree char_literal106_tree=null;
        AslTree char_literal108_tree=null;
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_nota=new RewriteRuleSubtreeStream(adaptor,"rule nota");
        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:199:6: ( '[' nota ( ',' nota )+ ']' -> ^( ACORD nota ( nota )+ ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:199:8: '[' nota ( ',' nota )+ ']'
            {
            char_literal104=(Token)match(input,80,FOLLOW_80_in_acord1356);  
            stream_80.add(char_literal104);


            pushFollow(FOLLOW_nota_in_acord1358);
            nota105=nota();

            state._fsp--;

            stream_nota.add(nota105.getTree());

            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:199:17: ( ',' nota )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==75) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:199:18: ',' nota
            	    {
            	    char_literal106=(Token)match(input,75,FOLLOW_75_in_acord1361);  
            	    stream_75.add(char_literal106);


            	    pushFollow(FOLLOW_nota_in_acord1363);
            	    nota107=nota();

            	    state._fsp--;

            	    stream_nota.add(nota107.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            char_literal108=(Token)match(input,81,FOLLOW_81_in_acord1367);  
            stream_81.add(char_literal108);


            // AST REWRITE
            // elements: nota, nota
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 199:33: -> ^( ACORD nota ( nota )+ )
            {
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:199:36: ^( ACORD nota ( nota )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ACORD, "ACORD")
                , root_1);

                adaptor.addChild(root_1, stream_nota.nextTree());

                if ( !(stream_nota.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_nota.hasNext() ) {
                    adaptor.addChild(root_1, stream_nota.nextTree());

                }
                stream_nota.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "acord"


    public static class partitura_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitura"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:202:1: partitura : PARTITURA ^ '{' ! optionsPart veus '}' !;
    public final AslParser.partitura_return partitura() throws RecognitionException {
        AslParser.partitura_return retval = new AslParser.partitura_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PARTITURA109=null;
        Token char_literal110=null;
        Token char_literal113=null;
        AslParser.optionsPart_return optionsPart111 =null;

        AslParser.veus_return veus112 =null;


        AslTree PARTITURA109_tree=null;
        AslTree char_literal110_tree=null;
        AslTree char_literal113_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:202:10: ( PARTITURA ^ '{' ! optionsPart veus '}' !)
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:202:12: PARTITURA ^ '{' ! optionsPart veus '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            PARTITURA109=(Token)match(input,PARTITURA,FOLLOW_PARTITURA_in_partitura1391); 
            PARTITURA109_tree = 
            (AslTree)adaptor.create(PARTITURA109)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(PARTITURA109_tree, root_0);


            char_literal110=(Token)match(input,82,FOLLOW_82_in_partitura1394); 

            pushFollow(FOLLOW_optionsPart_in_partitura1397);
            optionsPart111=optionsPart();

            state._fsp--;

            adaptor.addChild(root_0, optionsPart111.getTree());

            pushFollow(FOLLOW_veus_in_partitura1399);
            veus112=veus();

            state._fsp--;

            adaptor.addChild(root_0, veus112.getTree());

            char_literal113=(Token)match(input,83,FOLLOW_83_in_partitura1401); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "partitura"


    public static class optionsPart_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optionsPart"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:204:1: optionsPart : tempo compas_beat -> ^( MODS tempo compas_beat ) ;
    public final AslParser.optionsPart_return optionsPart() throws RecognitionException {
        AslParser.optionsPart_return retval = new AslParser.optionsPart_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.tempo_return tempo114 =null;

        AslParser.compas_beat_return compas_beat115 =null;


        RewriteRuleSubtreeStream stream_compas_beat=new RewriteRuleSubtreeStream(adaptor,"rule compas_beat");
        RewriteRuleSubtreeStream stream_tempo=new RewriteRuleSubtreeStream(adaptor,"rule tempo");
        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:204:12: ( tempo compas_beat -> ^( MODS tempo compas_beat ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:204:14: tempo compas_beat
            {
            pushFollow(FOLLOW_tempo_in_optionsPart1418);
            tempo114=tempo();

            state._fsp--;

            stream_tempo.add(tempo114.getTree());

            pushFollow(FOLLOW_compas_beat_in_optionsPart1420);
            compas_beat115=compas_beat();

            state._fsp--;

            stream_compas_beat.add(compas_beat115.getTree());

            // AST REWRITE
            // elements: tempo, compas_beat
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 204:32: -> ^( MODS tempo compas_beat )
            {
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:204:35: ^( MODS tempo compas_beat )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(MODS, "MODS")
                , root_1);

                adaptor.addChild(root_1, stream_tempo.nextTree());

                adaptor.addChild(root_1, stream_compas_beat.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "optionsPart"


    public static class veus_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "veus"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:207:1: veus : ( veu )+ -> ^( VEUS ( veu )+ ) ;
    public final AslParser.veus_return veus() throws RecognitionException {
        AslParser.veus_return retval = new AslParser.veus_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.veu_return veu116 =null;


        RewriteRuleSubtreeStream stream_veu=new RewriteRuleSubtreeStream(adaptor,"rule veu");
        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:207:5: ( ( veu )+ -> ^( VEUS ( veu )+ ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:207:7: ( veu )+
            {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:207:7: ( veu )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==79) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:207:7: veu
            	    {
            	    pushFollow(FOLLOW_veu_in_veus1449);
            	    veu116=veu();

            	    state._fsp--;

            	    stream_veu.add(veu116.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            // AST REWRITE
            // elements: veu
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 207:12: -> ^( VEUS ( veu )+ )
            {
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:207:15: ^( VEUS ( veu )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(VEUS, "VEUS")
                , root_1);

                if ( !(stream_veu.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_veu.hasNext() ) {
                    adaptor.addChild(root_1, stream_veu.nextTree());

                }
                stream_veu.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "veus"


    public static class tempo_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tempo"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:210:1: tempo : TEMPO ( ( PARAULA_TEMPO -> ^( PARAULA_TEMPO ) ) | ( FIGURA '=' INT -> ^( FIGURA_TEMPO FIGURA INT ) ) ) ;
    public final AslParser.tempo_return tempo() throws RecognitionException {
        AslParser.tempo_return retval = new AslParser.tempo_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token TEMPO117=null;
        Token PARAULA_TEMPO118=null;
        Token FIGURA119=null;
        Token char_literal120=null;
        Token INT121=null;

        AslTree TEMPO117_tree=null;
        AslTree PARAULA_TEMPO118_tree=null;
        AslTree FIGURA119_tree=null;
        AslTree char_literal120_tree=null;
        AslTree INT121_tree=null;
        RewriteRuleTokenStream stream_PARAULA_TEMPO=new RewriteRuleTokenStream(adaptor,"token PARAULA_TEMPO");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_FIGURA=new RewriteRuleTokenStream(adaptor,"token FIGURA");
        RewriteRuleTokenStream stream_TEMPO=new RewriteRuleTokenStream(adaptor,"token TEMPO");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:210:6: ( TEMPO ( ( PARAULA_TEMPO -> ^( PARAULA_TEMPO ) ) | ( FIGURA '=' INT -> ^( FIGURA_TEMPO FIGURA INT ) ) ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:210:8: TEMPO ( ( PARAULA_TEMPO -> ^( PARAULA_TEMPO ) ) | ( FIGURA '=' INT -> ^( FIGURA_TEMPO FIGURA INT ) ) )
            {
            TEMPO117=(Token)match(input,TEMPO,FOLLOW_TEMPO_in_tempo1471);  
            stream_TEMPO.add(TEMPO117);


            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:210:14: ( ( PARAULA_TEMPO -> ^( PARAULA_TEMPO ) ) | ( FIGURA '=' INT -> ^( FIGURA_TEMPO FIGURA INT ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==PARAULA_TEMPO) ) {
                alt33=1;
            }
            else if ( (LA33_0==FIGURA) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:210:16: ( PARAULA_TEMPO -> ^( PARAULA_TEMPO ) )
                    {
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:210:16: ( PARAULA_TEMPO -> ^( PARAULA_TEMPO ) )
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:210:17: PARAULA_TEMPO
                    {
                    PARAULA_TEMPO118=(Token)match(input,PARAULA_TEMPO,FOLLOW_PARAULA_TEMPO_in_tempo1476);  
                    stream_PARAULA_TEMPO.add(PARAULA_TEMPO118);


                    // AST REWRITE
                    // elements: PARAULA_TEMPO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 210:31: -> ^( PARAULA_TEMPO )
                    {
                        // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:210:34: ^( PARAULA_TEMPO )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        stream_PARAULA_TEMPO.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 2 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:211:17: ( FIGURA '=' INT -> ^( FIGURA_TEMPO FIGURA INT ) )
                    {
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:211:17: ( FIGURA '=' INT -> ^( FIGURA_TEMPO FIGURA INT ) )
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:211:18: FIGURA '=' INT
                    {
                    FIGURA119=(Token)match(input,FIGURA,FOLLOW_FIGURA_in_tempo1503);  
                    stream_FIGURA.add(FIGURA119);


                    char_literal120=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_tempo1505);  
                    stream_EQUAL.add(char_literal120);


                    INT121=(Token)match(input,INT,FOLLOW_INT_in_tempo1507);  
                    stream_INT.add(INT121);


                    // AST REWRITE
                    // elements: FIGURA, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 211:33: -> ^( FIGURA_TEMPO FIGURA INT )
                    {
                        // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:211:36: ^( FIGURA_TEMPO FIGURA INT )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(FIGURA_TEMPO, "FIGURA_TEMPO")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_FIGURA.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tempo"


    public static class compas_beat_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas_beat"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:215:1: compas_beat : INT ':' INT -> ^( BEAT INT INT ) ;
    public final AslParser.compas_beat_return compas_beat() throws RecognitionException {
        AslParser.compas_beat_return retval = new AslParser.compas_beat_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token INT122=null;
        Token char_literal123=null;
        Token INT124=null;

        AslTree INT122_tree=null;
        AslTree char_literal123_tree=null;
        AslTree INT124_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:215:12: ( INT ':' INT -> ^( BEAT INT INT ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:215:14: INT ':' INT
            {
            INT122=(Token)match(input,INT,FOLLOW_INT_in_compas_beat1547);  
            stream_INT.add(INT122);


            char_literal123=(Token)match(input,77,FOLLOW_77_in_compas_beat1549);  
            stream_77.add(char_literal123);


            INT124=(Token)match(input,INT,FOLLOW_INT_in_compas_beat1551);  
            stream_INT.add(INT124);


            // AST REWRITE
            // elements: INT, INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 215:44: -> ^( BEAT INT INT )
            {
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:215:47: ^( BEAT INT INT )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(BEAT, "BEAT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_INT.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INT.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compas_beat"


    public static class veu_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "veu"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:218:1: veu : 'Voice' ^ ID SEPARADOR_COMPAS ! grup_compases SEPARADOR_COMPAS ! SEPARADOR_COMPAS !;
    public final AslParser.veu_return veu() throws RecognitionException {
        AslParser.veu_return retval = new AslParser.veu_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token string_literal125=null;
        Token ID126=null;
        Token SEPARADOR_COMPAS127=null;
        Token SEPARADOR_COMPAS129=null;
        Token SEPARADOR_COMPAS130=null;
        AslParser.grup_compases_return grup_compases128 =null;


        AslTree string_literal125_tree=null;
        AslTree ID126_tree=null;
        AslTree SEPARADOR_COMPAS127_tree=null;
        AslTree SEPARADOR_COMPAS129_tree=null;
        AslTree SEPARADOR_COMPAS130_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:218:4: ( 'Voice' ^ ID SEPARADOR_COMPAS ! grup_compases SEPARADOR_COMPAS ! SEPARADOR_COMPAS !)
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:218:6: 'Voice' ^ ID SEPARADOR_COMPAS ! grup_compases SEPARADOR_COMPAS ! SEPARADOR_COMPAS !
            {
            root_0 = (AslTree)adaptor.nil();


            string_literal125=(Token)match(input,79,FOLLOW_79_in_veu1581); 
            string_literal125_tree = 
            (AslTree)adaptor.create(string_literal125)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(string_literal125_tree, root_0);


            ID126=(Token)match(input,ID,FOLLOW_ID_in_veu1584); 
            ID126_tree = 
            (AslTree)adaptor.create(ID126)
            ;
            adaptor.addChild(root_0, ID126_tree);


            SEPARADOR_COMPAS127=(Token)match(input,SEPARADOR_COMPAS,FOLLOW_SEPARADOR_COMPAS_in_veu1587); 

            pushFollow(FOLLOW_grup_compases_in_veu1590);
            grup_compases128=grup_compases();

            state._fsp--;

            adaptor.addChild(root_0, grup_compases128.getTree());

            SEPARADOR_COMPAS129=(Token)match(input,SEPARADOR_COMPAS,FOLLOW_SEPARADOR_COMPAS_in_veu1592); 

            SEPARADOR_COMPAS130=(Token)match(input,SEPARADOR_COMPAS,FOLLOW_SEPARADOR_COMPAS_in_veu1595); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "veu"


    public static class grup_compases_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "grup_compases"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:221:1: grup_compases : ( repeticion_compases | '|' ! compas )+ ;
    public final AslParser.grup_compases_return grup_compases() throws RecognitionException {
        AslParser.grup_compases_return retval = new AslParser.grup_compases_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal132=null;
        AslParser.repeticion_compases_return repeticion_compases131 =null;

        AslParser.compas_return compas133 =null;


        AslTree char_literal132_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:221:14: ( ( repeticion_compases | '|' ! compas )+ )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:221:16: ( repeticion_compases | '|' ! compas )+
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:221:16: ( repeticion_compases | '|' ! compas )+
            int cnt34=0;
            loop34:
            do {
                int alt34=3;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==SEPARADOR_COMPAS) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==INT||LA34_1==NOTA_MUSICAL||LA34_1==PREMOD||LA34_1==SILENCI||LA34_1==80||LA34_1==82) ) {
                        alt34=2;
                    }


                }
                else if ( (LA34_0==REP_OBRIR) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:221:17: repeticion_compases
            	    {
            	    pushFollow(FOLLOW_repeticion_compases_in_grup_compases1608);
            	    repeticion_compases131=repeticion_compases();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repeticion_compases131.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:221:39: '|' ! compas
            	    {
            	    char_literal132=(Token)match(input,SEPARADOR_COMPAS,FOLLOW_SEPARADOR_COMPAS_in_grup_compases1612); 

            	    pushFollow(FOLLOW_compas_in_grup_compases1615);
            	    compas133=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas133.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "grup_compases"


    public static class repeticion_compases_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "repeticion_compases"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:224:1: repeticion_compases : REP_OBRIR dentro_repeticio rep_tancar -> ^( REP_COMPAS rep_tancar dentro_repeticio ) ;
    public final AslParser.repeticion_compases_return repeticion_compases() throws RecognitionException {
        AslParser.repeticion_compases_return retval = new AslParser.repeticion_compases_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token REP_OBRIR134=null;
        AslParser.dentro_repeticio_return dentro_repeticio135 =null;

        AslParser.rep_tancar_return rep_tancar136 =null;


        AslTree REP_OBRIR134_tree=null;
        RewriteRuleTokenStream stream_REP_OBRIR=new RewriteRuleTokenStream(adaptor,"token REP_OBRIR");
        RewriteRuleSubtreeStream stream_rep_tancar=new RewriteRuleSubtreeStream(adaptor,"rule rep_tancar");
        RewriteRuleSubtreeStream stream_dentro_repeticio=new RewriteRuleSubtreeStream(adaptor,"rule dentro_repeticio");
        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:224:20: ( REP_OBRIR dentro_repeticio rep_tancar -> ^( REP_COMPAS rep_tancar dentro_repeticio ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:224:22: REP_OBRIR dentro_repeticio rep_tancar
            {
            REP_OBRIR134=(Token)match(input,REP_OBRIR,FOLLOW_REP_OBRIR_in_repeticion_compases1639);  
            stream_REP_OBRIR.add(REP_OBRIR134);


            pushFollow(FOLLOW_dentro_repeticio_in_repeticion_compases1642);
            dentro_repeticio135=dentro_repeticio();

            state._fsp--;

            stream_dentro_repeticio.add(dentro_repeticio135.getTree());

            pushFollow(FOLLOW_rep_tancar_in_repeticion_compases1644);
            rep_tancar136=rep_tancar();

            state._fsp--;

            stream_rep_tancar.add(rep_tancar136.getTree());

            // AST REWRITE
            // elements: rep_tancar, dentro_repeticio
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 224:61: -> ^( REP_COMPAS rep_tancar dentro_repeticio )
            {
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:224:64: ^( REP_COMPAS rep_tancar dentro_repeticio )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(REP_COMPAS, "REP_COMPAS")
                , root_1);

                adaptor.addChild(root_1, stream_rep_tancar.nextTree());

                adaptor.addChild(root_1, stream_dentro_repeticio.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "repeticion_compases"


    public static class dentro_repeticio_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dentro_repeticio"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:227:1: dentro_repeticio : compas ( repeticion_compases | '|' ! compas )* ;
    public final AslParser.dentro_repeticio_return dentro_repeticio() throws RecognitionException {
        AslParser.dentro_repeticio_return retval = new AslParser.dentro_repeticio_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal139=null;
        AslParser.compas_return compas137 =null;

        AslParser.repeticion_compases_return repeticion_compases138 =null;

        AslParser.compas_return compas140 =null;


        AslTree char_literal139_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:227:17: ( compas ( repeticion_compases | '|' ! compas )* )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:227:19: compas ( repeticion_compases | '|' ! compas )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_compas_in_dentro_repeticio1682);
            compas137=compas();

            state._fsp--;

            adaptor.addChild(root_0, compas137.getTree());

            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:227:26: ( repeticion_compases | '|' ! compas )*
            loop35:
            do {
                int alt35=3;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==REP_OBRIR) ) {
                    alt35=1;
                }
                else if ( (LA35_0==SEPARADOR_COMPAS) ) {
                    alt35=2;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:227:27: repeticion_compases
            	    {
            	    pushFollow(FOLLOW_repeticion_compases_in_dentro_repeticio1685);
            	    repeticion_compases138=repeticion_compases();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repeticion_compases138.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:227:49: '|' ! compas
            	    {
            	    char_literal139=(Token)match(input,SEPARADOR_COMPAS,FOLLOW_SEPARADOR_COMPAS_in_dentro_repeticio1689); 

            	    pushFollow(FOLLOW_compas_in_dentro_repeticio1692);
            	    compas140=compas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compas140.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dentro_repeticio"


    public static class rep_tancar_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rep_tancar"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:229:1: rep_tancar : ':' ! INT '|' !;
    public final AslParser.rep_tancar_return rep_tancar() throws RecognitionException {
        AslParser.rep_tancar_return retval = new AslParser.rep_tancar_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal141=null;
        Token INT142=null;
        Token char_literal143=null;

        AslTree char_literal141_tree=null;
        AslTree INT142_tree=null;
        AslTree char_literal143_tree=null;

        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:229:11: ( ':' ! INT '|' !)
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:229:13: ':' ! INT '|' !
            {
            root_0 = (AslTree)adaptor.nil();


            char_literal141=(Token)match(input,77,FOLLOW_77_in_rep_tancar1720); 

            INT142=(Token)match(input,INT,FOLLOW_INT_in_rep_tancar1723); 
            INT142_tree = 
            (AslTree)adaptor.create(INT142)
            ;
            adaptor.addChild(root_0, INT142_tree);


            char_literal143=(Token)match(input,SEPARADOR_COMPAS,FOLLOW_SEPARADOR_COMPAS_in_rep_tancar1725); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rep_tancar"


    public static class compas_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compas"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:232:1: compas : ( optionsCompas )? notes_o_acords -> ^( COMPAS ( optionsCompas )? ^( NOTES_ACORDS notes_o_acords ) ) ;
    public final AslParser.compas_return compas() throws RecognitionException {
        AslParser.compas_return retval = new AslParser.compas_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.optionsCompas_return optionsCompas144 =null;

        AslParser.notes_o_acords_return notes_o_acords145 =null;


        RewriteRuleSubtreeStream stream_optionsCompas=new RewriteRuleSubtreeStream(adaptor,"rule optionsCompas");
        RewriteRuleSubtreeStream stream_notes_o_acords=new RewriteRuleSubtreeStream(adaptor,"rule notes_o_acords");
        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:232:7: ( ( optionsCompas )? notes_o_acords -> ^( COMPAS ( optionsCompas )? ^( NOTES_ACORDS notes_o_acords ) ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:232:9: ( optionsCompas )? notes_o_acords
            {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:232:9: ( optionsCompas )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==82) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:232:9: optionsCompas
                    {
                    pushFollow(FOLLOW_optionsCompas_in_compas1744);
                    optionsCompas144=optionsCompas();

                    state._fsp--;

                    stream_optionsCompas.add(optionsCompas144.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_notes_o_acords_in_compas1747);
            notes_o_acords145=notes_o_acords();

            state._fsp--;

            stream_notes_o_acords.add(notes_o_acords145.getTree());

            // AST REWRITE
            // elements: optionsCompas, notes_o_acords
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 232:39: -> ^( COMPAS ( optionsCompas )? ^( NOTES_ACORDS notes_o_acords ) )
            {
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:232:42: ^( COMPAS ( optionsCompas )? ^( NOTES_ACORDS notes_o_acords ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(COMPAS, "COMPAS")
                , root_1);

                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:232:51: ( optionsCompas )?
                if ( stream_optionsCompas.hasNext() ) {
                    adaptor.addChild(root_1, stream_optionsCompas.nextTree());

                }
                stream_optionsCompas.reset();

                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:232:66: ^( NOTES_ACORDS notes_o_acords )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(NOTES_ACORDS, "NOTES_ACORDS")
                , root_2);

                adaptor.addChild(root_2, stream_notes_o_acords.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compas"


    public static class notes_o_acords_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notes_o_acords"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:235:1: notes_o_acords : ( nota | acord )+ ;
    public final AslParser.notes_o_acords_return notes_o_acords() throws RecognitionException {
        AslParser.notes_o_acords_return retval = new AslParser.notes_o_acords_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.nota_return nota146 =null;

        AslParser.acord_return acord147 =null;



        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:235:15: ( ( nota | acord )+ )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:235:17: ( nota | acord )+
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:235:17: ( nota | acord )+
            int cnt37=0;
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==INT||LA37_0==NOTA_MUSICAL||LA37_0==PREMOD||LA37_0==SILENCI) ) {
                    alt37=1;
                }
                else if ( (LA37_0==80) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:235:18: nota
            	    {
            	    pushFollow(FOLLOW_nota_in_notes_o_acords1777);
            	    nota146=nota();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nota146.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:235:25: acord
            	    {
            	    pushFollow(FOLLOW_acord_in_notes_o_acords1781);
            	    acord147=acord();

            	    state._fsp--;

            	    adaptor.addChild(root_0, acord147.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notes_o_acords"


    public static class optionsCompas_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optionsCompas"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:238:1: optionsCompas : '{' optionCompas ( ',' optionCompas )* '}' -> ^( MODS ( optionCompas )+ ) ;
    public final AslParser.optionsCompas_return optionsCompas() throws RecognitionException {
        AslParser.optionsCompas_return retval = new AslParser.optionsCompas_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal148=null;
        Token char_literal150=null;
        Token char_literal152=null;
        AslParser.optionCompas_return optionCompas149 =null;

        AslParser.optionCompas_return optionCompas151 =null;


        AslTree char_literal148_tree=null;
        AslTree char_literal150_tree=null;
        AslTree char_literal152_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_optionCompas=new RewriteRuleSubtreeStream(adaptor,"rule optionCompas");
        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:238:14: ( '{' optionCompas ( ',' optionCompas )* '}' -> ^( MODS ( optionCompas )+ ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:238:17: '{' optionCompas ( ',' optionCompas )* '}'
            {
            char_literal148=(Token)match(input,82,FOLLOW_82_in_optionsCompas1806);  
            stream_82.add(char_literal148);


            pushFollow(FOLLOW_optionCompas_in_optionsCompas1808);
            optionCompas149=optionCompas();

            state._fsp--;

            stream_optionCompas.add(optionCompas149.getTree());

            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:238:34: ( ',' optionCompas )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==75) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:238:35: ',' optionCompas
            	    {
            	    char_literal150=(Token)match(input,75,FOLLOW_75_in_optionsCompas1811);  
            	    stream_75.add(char_literal150);


            	    pushFollow(FOLLOW_optionCompas_in_optionsCompas1813);
            	    optionCompas151=optionCompas();

            	    state._fsp--;

            	    stream_optionCompas.add(optionCompas151.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            char_literal152=(Token)match(input,83,FOLLOW_83_in_optionsCompas1817);  
            stream_83.add(char_literal152);


            // AST REWRITE
            // elements: optionCompas
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 238:58: -> ^( MODS ( optionCompas )+ )
            {
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:238:61: ^( MODS ( optionCompas )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(MODS, "MODS")
                , root_1);

                if ( !(stream_optionCompas.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_optionCompas.hasNext() ) {
                    adaptor.addChild(root_1, stream_optionCompas.nextTree());

                }
                stream_optionCompas.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "optionsCompas"


    public static class optionCompas_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optionCompas"
    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:240:1: optionCompas : ( ( expr -> ^( EXPR_TIME expr ) ) | PARAULA_TEMPO | PARAULA_INTENSITAT );
    public final AslParser.optionCompas_return optionCompas() throws RecognitionException {
        AslParser.optionCompas_return retval = new AslParser.optionCompas_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PARAULA_TEMPO154=null;
        Token PARAULA_INTENSITAT155=null;
        AslParser.expr_return expr153 =null;


        AslTree PARAULA_TEMPO154_tree=null;
        AslTree PARAULA_INTENSITAT155_tree=null;
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:240:13: ( ( expr -> ^( EXPR_TIME expr ) ) | PARAULA_TEMPO | PARAULA_INTENSITAT )
            int alt39=3;
            switch ( input.LA(1) ) {
            case FALSE:
            case ID:
            case INT:
            case MINUS:
            case NOT:
            case PLUS:
            case TRUE:
            case 73:
                {
                alt39=1;
                }
                break;
            case PARAULA_TEMPO:
                {
                alt39=2;
                }
                break;
            case PARAULA_INTENSITAT:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:240:15: ( expr -> ^( EXPR_TIME expr ) )
                    {
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:240:15: ( expr -> ^( EXPR_TIME expr ) )
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:240:16: expr
                    {
                    pushFollow(FOLLOW_expr_in_optionCompas1847);
                    expr153=expr();

                    state._fsp--;

                    stream_expr.add(expr153.getTree());

                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 240:21: -> ^( EXPR_TIME expr )
                    {
                        // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:240:24: ^( EXPR_TIME expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(EXPR_TIME, "EXPR_TIME")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 2 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:240:45: PARAULA_TEMPO
                    {
                    root_0 = (AslTree)adaptor.nil();


                    PARAULA_TEMPO154=(Token)match(input,PARAULA_TEMPO,FOLLOW_PARAULA_TEMPO_in_optionCompas1860); 
                    PARAULA_TEMPO154_tree = 
                    (AslTree)adaptor.create(PARAULA_TEMPO154)
                    ;
                    adaptor.addChild(root_0, PARAULA_TEMPO154_tree);


                    }
                    break;
                case 3 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:240:61: PARAULA_INTENSITAT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    PARAULA_INTENSITAT155=(Token)match(input,PARAULA_INTENSITAT,FOLLOW_PARAULA_INTENSITAT_in_optionCompas1864); 
                    PARAULA_INTENSITAT155_tree = 
                    (AslTree)adaptor.create(PARAULA_INTENSITAT155)
                    ;
                    adaptor.addChild(root_0, PARAULA_INTENSITAT155_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "optionCompas"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_o_piezzo_in_prog227 = new BitSet(new long[]{0x0004000004000000L});
    public static final BitSet FOLLOW_EOF_in_prog230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_func_o_piezzo255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_piezzo_in_func_o_piezzo259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func269 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_func272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_params_in_func274 = new BitSet(new long[]{0x11000000C0000000L,0x0000000000004060L});
    public static final BitSet FOLLOW_block_instructions_in_func276 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_params297 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000500L});
    public static final BitSet FOLLOW_paramlist_in_params299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_params302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist328 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_paramlist331 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_param_in_paramlist334 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_72_in_param359 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_param363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions420 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_block_instructions423 = new BitSet(new long[]{0x11000000C0000000L,0x0000000000004060L});
    public static final BitSet FOLLOW_instruction_in_block_instructions425 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_assign_in_instruction474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign657 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_EQUAL_in_assign661 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_expr_in_assign663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt692 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_expr_in_ite_stmt695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt697 = new BitSet(new long[]{0x11000000C0000000L,0x0000000000004060L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt700 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt703 = new BitSet(new long[]{0x11000000C0000000L,0x0000000000004060L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt706 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt733 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_expr_in_while_stmt736 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DO_in_while_stmt738 = new BitSet(new long[]{0x11000000C0000000L,0x0000000000004060L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt741 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt766 = new BitSet(new long[]{0x0008022140800002L,0x0000000000000204L});
    public static final BitSet FOLLOW_expr_in_return_stmt769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read788 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_read791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write811 = new BitSet(new long[]{0x8008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_expr_in_write815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr844 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_OR_in_expr847 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_boolterm_in_expr850 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm870 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm873 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_boolfact_in_boolterm876 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact896 = new BitSet(new long[]{0x0000101230100002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact900 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact905 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_LT_in_boolfact910 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_LE_in_boolfact915 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_GT_in_boolfact920 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_GE_in_boolfact925 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_num_expr_in_boolfact929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr949 = new BitSet(new long[]{0x0008002000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr954 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_MINUS_in_num_expr959 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_term_in_num_expr963 = new BitSet(new long[]{0x0008002000000002L});
    public static final BitSet FOLLOW_factor_in_term987 = new BitSet(new long[]{0x0000014000002002L});
    public static final BitSet FOLLOW_MUL_in_term992 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_DIV_in_term997 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_MOD_in_term1002 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_factor_in_term1006 = new BitSet(new long[]{0x0000014000002002L});
    public static final BitSet FOLLOW_NOT_in_factor1029 = new BitSet(new long[]{0x0000000140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_PLUS_in_factor1034 = new BitSet(new long[]{0x0000000140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_MINUS_in_factor1039 = new BitSet(new long[]{0x0000000140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_atom_in_factor1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_atom1143 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_expr_in_atom1146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_atom1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_funcall1171 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000604L});
    public static final BitSet FOLLOW_expr_list_in_funcall1173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_funcall1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1209 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_expr_list1212 = new BitSet(new long[]{0x0008022140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_expr_in_expr_list1215 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_PIEZZO_in_piezzo1239 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_piezzo1242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_params_in_piezzo1244 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_partitura_in_piezzo1246 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ENDPIEZZO_in_piezzo1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREMOD_in_nota1276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_nota1277 = new BitSet(new long[]{0x0000040100000000L});
    public static final BitSet FOLLOW_INT_in_nota1281 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_NOTA_MUSICAL_in_nota1284 = new BitSet(new long[]{0x0040000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_nota1289 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_FIGURA_in_nota1291 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_PUNTET_in_nota1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SILENCI_in_nota1325 = new BitSet(new long[]{0x0040000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_nota1328 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_FIGURA_in_nota1329 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_PUNTET_in_nota1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_acord1356 = new BitSet(new long[]{0x4020040100000000L});
    public static final BitSet FOLLOW_nota_in_acord1358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_acord1361 = new BitSet(new long[]{0x4020040100000000L});
    public static final BitSet FOLLOW_nota_in_acord1363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_81_in_acord1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARTITURA_in_partitura1391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_partitura1394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_optionsPart_in_partitura1397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_veus_in_partitura1399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_partitura1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tempo_in_optionsPart1418 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_compas_beat_in_optionsPart1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_veu_in_veus1449 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_TEMPO_in_tempo1471 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_PARAULA_TEMPO_in_tempo1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIGURA_in_tempo1503 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_EQUAL_in_tempo1505 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_tempo1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_compas_beat1547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_compas_beat1549 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_compas_beat1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_veu1581 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_veu1584 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SEPARADOR_COMPAS_in_veu1587 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_grup_compases_in_veu1590 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SEPARADOR_COMPAS_in_veu1592 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SEPARADOR_COMPAS_in_veu1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeticion_compases_in_grup_compases1608 = new BitSet(new long[]{0x2800000000000002L});
    public static final BitSet FOLLOW_SEPARADOR_COMPAS_in_grup_compases1612 = new BitSet(new long[]{0x4020040100000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_compas_in_grup_compases1615 = new BitSet(new long[]{0x2800000000000002L});
    public static final BitSet FOLLOW_REP_OBRIR_in_repeticion_compases1639 = new BitSet(new long[]{0x4020040100000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_dentro_repeticio_in_repeticion_compases1642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_rep_tancar_in_repeticion_compases1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compas_in_dentro_repeticio1682 = new BitSet(new long[]{0x2800000000000002L});
    public static final BitSet FOLLOW_repeticion_compases_in_dentro_repeticio1685 = new BitSet(new long[]{0x2800000000000002L});
    public static final BitSet FOLLOW_SEPARADOR_COMPAS_in_dentro_repeticio1689 = new BitSet(new long[]{0x4020040100000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_compas_in_dentro_repeticio1692 = new BitSet(new long[]{0x2800000000000002L});
    public static final BitSet FOLLOW_77_in_rep_tancar1720 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_rep_tancar1723 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SEPARADOR_COMPAS_in_rep_tancar1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optionsCompas_in_compas1744 = new BitSet(new long[]{0x4020040100000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_notes_o_acords_in_compas1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_notes_o_acords1777 = new BitSet(new long[]{0x4020040100000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_acord_in_notes_o_acords1781 = new BitSet(new long[]{0x4020040100000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_82_in_optionsCompas1806 = new BitSet(new long[]{0x0009822140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_optionCompas_in_optionsCompas1808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_75_in_optionsCompas1811 = new BitSet(new long[]{0x0009822140800000L,0x0000000000000204L});
    public static final BitSet FOLLOW_optionCompas_in_optionsCompas1813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_83_in_optionsCompas1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_optionCompas1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAULA_TEMPO_in_optionCompas1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAULA_INTENSITAT_in_optionCompas1864 = new BitSet(new long[]{0x0000000000000002L});

}