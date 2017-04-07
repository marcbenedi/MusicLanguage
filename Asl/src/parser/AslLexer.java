// $ANTLR 3.4 /home/marcbenedi/Programs/Asl/src/parser/Asl.g 2017-04-06 21:13:50

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AslLexer() {} 
    public AslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/marcbenedi/Programs/Asl/src/parser/Asl.g"; }

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:6:7: ( '&' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:6:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:7:7: ( '(' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:8:7: ( ')' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:9:7: ( ',' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:10:7: ( '.' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:10:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:11:7: ( ':' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:12:7: ( ';' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:13:7: ( 'Voice' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:13:9: 'Voice'
            {
            match("Voice"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:14:7: ( '[' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:14:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:15:7: ( ']' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:15:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:16:7: ( '{' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:17:7: ( '}' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "NOTA_MUSICAL"
    public final void mNOTA_MUSICAL() throws RecognitionException {
        try {
            int _type = NOTA_MUSICAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:245:13: ( ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:245:15: ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' )
            {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:245:15: ( 'Do' | 'Re' | 'Mi' | 'Fa' | 'Sol' | 'La' | 'Si' )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 'D':
                {
                alt1=1;
                }
                break;
            case 'R':
                {
                alt1=2;
                }
                break;
            case 'M':
                {
                alt1=3;
                }
                break;
            case 'F':
                {
                alt1=4;
                }
                break;
            case 'S':
                {
                int LA1_5 = input.LA(2);

                if ( (LA1_5=='o') ) {
                    alt1=5;
                }
                else if ( (LA1_5=='i') ) {
                    alt1=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;

                }
                }
                break;
            case 'L':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:245:16: 'Do'
                    {
                    match("Do"); 



                    }
                    break;
                case 2 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:245:21: 'Re'
                    {
                    match("Re"); 



                    }
                    break;
                case 3 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:245:26: 'Mi'
                    {
                    match("Mi"); 



                    }
                    break;
                case 4 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:245:31: 'Fa'
                    {
                    match("Fa"); 



                    }
                    break;
                case 5 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:245:36: 'Sol'
                    {
                    match("Sol"); 



                    }
                    break;
                case 6 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:245:42: 'La'
                    {
                    match("La"); 



                    }
                    break;
                case 7 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:245:47: 'Si'
                    {
                    match("Si"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTA_MUSICAL"

    // $ANTLR start "PARAULA_TEMPO"
    public final void mPARAULA_TEMPO() throws RecognitionException {
        try {
            int _type = PARAULA_TEMPO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:246:14: ( ( 'Lento' | 'Adagio' | 'Moderato' | 'Allegro' | 'Presto' | 'Apasionatto' | 'Con caracter' | 'Giocoso' ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:246:16: ( 'Lento' | 'Adagio' | 'Moderato' | 'Allegro' | 'Presto' | 'Apasionatto' | 'Con caracter' | 'Giocoso' )
            {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:246:16: ( 'Lento' | 'Adagio' | 'Moderato' | 'Allegro' | 'Presto' | 'Apasionatto' | 'Con caracter' | 'Giocoso' )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 'L':
                {
                alt2=1;
                }
                break;
            case 'A':
                {
                switch ( input.LA(2) ) {
                case 'd':
                    {
                    alt2=2;
                    }
                    break;
                case 'l':
                    {
                    alt2=4;
                    }
                    break;
                case 'p':
                    {
                    alt2=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }

                }
                break;
            case 'M':
                {
                alt2=3;
                }
                break;
            case 'P':
                {
                alt2=5;
                }
                break;
            case 'C':
                {
                alt2=7;
                }
                break;
            case 'G':
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:246:17: 'Lento'
                    {
                    match("Lento"); 



                    }
                    break;
                case 2 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:246:25: 'Adagio'
                    {
                    match("Adagio"); 



                    }
                    break;
                case 3 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:246:34: 'Moderato'
                    {
                    match("Moderato"); 



                    }
                    break;
                case 4 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:246:45: 'Allegro'
                    {
                    match("Allegro"); 



                    }
                    break;
                case 5 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:246:55: 'Presto'
                    {
                    match("Presto"); 



                    }
                    break;
                case 6 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:246:64: 'Apasionatto'
                    {
                    match("Apasionatto"); 



                    }
                    break;
                case 7 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:246:78: 'Con caracter'
                    {
                    match("Con caracter"); 



                    }
                    break;
                case 8 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:246:93: 'Giocoso'
                    {
                    match("Giocoso"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PARAULA_TEMPO"

    // $ANTLR start "PARAULA_INTENSITAT"
    public final void mPARAULA_INTENSITAT() throws RecognitionException {
        try {
            int _type = PARAULA_INTENSITAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:247:19: ( ( 'pp' | 'p' | 'mp' | 'mf' | 'f' | 'ff' | 'pf' |) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:247:21: ( 'pp' | 'p' | 'mp' | 'mf' | 'f' | 'ff' | 'pf' |)
            {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:247:21: ( 'pp' | 'p' | 'mp' | 'mf' | 'f' | 'ff' | 'pf' |)
            int alt3=8;
            switch ( input.LA(1) ) {
            case 'p':
                {
                switch ( input.LA(2) ) {
                case 'p':
                    {
                    alt3=1;
                    }
                    break;
                case 'f':
                    {
                    alt3=7;
                    }
                    break;
                default:
                    alt3=2;
                }

                }
                break;
            case 'm':
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='p') ) {
                    alt3=3;
                }
                else if ( (LA3_2=='f') ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'f':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='f') ) {
                    alt3=6;
                }
                else {
                    alt3=5;
                }
                }
                break;
            default:
                alt3=8;
            }

            switch (alt3) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:247:22: 'pp'
                    {
                    match("pp"); 



                    }
                    break;
                case 2 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:247:27: 'p'
                    {
                    match('p'); 

                    }
                    break;
                case 3 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:247:31: 'mp'
                    {
                    match("mp"); 



                    }
                    break;
                case 4 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:247:36: 'mf'
                    {
                    match("mf"); 



                    }
                    break;
                case 5 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:247:41: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:247:45: 'ff'
                    {
                    match("ff"); 



                    }
                    break;
                case 7 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:247:50: 'pf'
                    {
                    match("pf"); 



                    }
                    break;
                case 8 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:247:55: 
                    {
                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PARAULA_INTENSITAT"

    // $ANTLR start "PIEZZO"
    public final void mPIEZZO() throws RecognitionException {
        try {
            int _type = PIEZZO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:248:7: ( 'Piezzo' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:248:9: 'Piezzo'
            {
            match("Piezzo"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PIEZZO"

    // $ANTLR start "SILENCI"
    public final void mSILENCI() throws RecognitionException {
        try {
            int _type = SILENCI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:249:8: ( 'Silenci' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:249:10: 'Silenci'
            {
            match("Silenci"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SILENCI"

    // $ANTLR start "PREMOD"
    public final void mPREMOD() throws RecognitionException {
        try {
            int _type = PREMOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:251:7: ( ( '#' | 'bm' | 'bq' ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:251:9: ( '#' | 'bm' | 'bq' )
            {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:251:9: ( '#' | 'bm' | 'bq' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='#') ) {
                alt4=1;
            }
            else if ( (LA4_0=='b') ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='m') ) {
                    alt4=2;
                }
                else if ( (LA4_2=='q') ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:251:10: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 2 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:251:16: 'bm'
                    {
                    match("bm"); 



                    }
                    break;
                case 3 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:251:23: 'bq'
                    {
                    match("bq"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREMOD"

    // $ANTLR start "PUNTET"
    public final void mPUNTET() throws RecognitionException {
        try {
            int _type = PUNTET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:253:7: ( '·' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:253:9: '·'
            {
            match('\u00B7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PUNTET"

    // $ANTLR start "SEPARADOR_COMPAS"
    public final void mSEPARADOR_COMPAS() throws RecognitionException {
        try {
            int _type = SEPARADOR_COMPAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:254:17: ( '|' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:254:19: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEPARADOR_COMPAS"

    // $ANTLR start "REP_OBRIR"
    public final void mREP_OBRIR() throws RecognitionException {
        try {
            int _type = REP_OBRIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:255:10: ( '|:' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:255:12: '|:'
            {
            match("|:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REP_OBRIR"

    // $ANTLR start "FIGURA"
    public final void mFIGURA() throws RecognitionException {
        try {
            int _type = FIGURA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:258:7: ( ( 'n' | 'b' | 'c' | 'sc' | 'f' | 'sf' | 'r' ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:258:9: ( 'n' | 'b' | 'c' | 'sc' | 'f' | 'sf' | 'r' )
            {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:258:9: ( 'n' | 'b' | 'c' | 'sc' | 'f' | 'sf' | 'r' )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt5=1;
                }
                break;
            case 'b':
                {
                alt5=2;
                }
                break;
            case 'c':
                {
                alt5=3;
                }
                break;
            case 's':
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4=='c') ) {
                    alt5=4;
                }
                else if ( (LA5_4=='f') ) {
                    alt5=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;

                }
                }
                break;
            case 'f':
                {
                alt5=5;
                }
                break;
            case 'r':
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:258:10: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 2 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:258:14: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 3 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:258:18: 'c'
                    {
                    match('c'); 

                    }
                    break;
                case 4 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:258:22: 'sc'
                    {
                    match("sc"); 



                    }
                    break;
                case 5 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:258:27: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:258:31: 'sf'
                    {
                    match("sf"); 



                    }
                    break;
                case 7 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:258:36: 'r'
                    {
                    match('r'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FIGURA"

    // $ANTLR start "TEMPO"
    public final void mTEMPO() throws RecognitionException {
        try {
            int _type = TEMPO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:260:6: ( 'Tempo' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:260:8: 'Tempo'
            {
            match("Tempo"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEMPO"

    // $ANTLR start "COMPAS"
    public final void mCOMPAS() throws RecognitionException {
        try {
            int _type = COMPAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:261:7: ( 'Compas' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:261:9: 'Compas'
            {
            match("Compas"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMPAS"

    // $ANTLR start "ARMADURA"
    public final void mARMADURA() throws RecognitionException {
        try {
            int _type = ARMADURA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:262:9: ( 'Armadura' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:262:11: 'Armadura'
            {
            match("Armadura"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARMADURA"

    // $ANTLR start "REPETICIO"
    public final void mREPETICIO() throws RecognitionException {
        try {
            int _type = REPETICIO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:263:10: ( 'Repeticio' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:263:12: 'Repeticio'
            {
            match("Repeticio"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REPETICIO"

    // $ANTLR start "PARTITURA"
    public final void mPARTITURA() throws RecognitionException {
        try {
            int _type = PARTITURA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:269:10: ( 'Partitura' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:269:12: 'Partitura'
            {
            match("Partitura"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PARTITURA"

    // $ANTLR start "VEGADA"
    public final void mVEGADA() throws RecognitionException {
        try {
            int _type = VEGADA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:271:7: ( 'Vegada' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:271:9: 'Vegada'
            {
            match("Vegada"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VEGADA"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:274:7: ( '=' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:274:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:275:10: ( '!=' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:275:12: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:276:8: ( '<' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:276:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:277:8: ( '<=' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:277:10: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:278:8: ( '>' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:278:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:279:8: ( '>=' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:279:10: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:280:6: ( '+' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:280:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:281:7: ( '-' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:281:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:282:9: ( '*' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:282:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:283:9: ( '/' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:283:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:284:9: ( '%' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:284:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:285:9: ( 'not' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:285:11: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:286:9: ( 'and' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:286:11: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:287:8: ( 'or' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:287:10: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:288:6: ( 'if' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:288:8: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:289:6: ( 'then' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:289:8: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:290:6: ( 'else' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:290:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:291:7: ( 'endif' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:291:9: 'endif'
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:292:7: ( 'while' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:292:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:293:8: ( 'do' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:293:10: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ENDWHILE"
    public final void mENDWHILE() throws RecognitionException {
        try {
            int _type = ENDWHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:294:9: ( 'endwhile' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:294:11: 'endwhile'
            {
            match("endwhile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDWHILE"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:295:6: ( 'func' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:295:8: 'func'
            {
            match("func"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "ENDFUNC"
    public final void mENDFUNC() throws RecognitionException {
        try {
            int _type = ENDFUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:296:9: ( 'endfunc' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:296:11: 'endfunc'
            {
            match("endfunc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDFUNC"

    // $ANTLR start "ENDPIEZZO"
    public final void mENDPIEZZO() throws RecognitionException {
        try {
            int _type = ENDPIEZZO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:297:11: ( 'endPiezzo' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:297:13: 'endPiezzo'
            {
            match("endPiezzo"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDPIEZZO"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:298:8: ( 'return' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:298:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:299:6: ( 'read' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:299:8: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:300:7: ( 'write' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:300:9: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:301:9: ( 'true' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:301:11: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:302:9: ( 'false' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:302:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:303:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:303:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:303:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:304:6: ( ( '0' .. '9' )+ )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:304:8: ( '0' .. '9' )+
            {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:304:8: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:307:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='/') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='/') ) {
                    alt11=1;
                }
                else if ( (LA11_1=='*') ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:307:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:307:16: (~ ( '\\n' | '\\r' ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:307:30: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:307:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:308:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:308:13: ( options {greedy=false; } : . )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='*') ) {
                            int LA10_1 = input.LA(2);

                            if ( (LA10_1=='/') ) {
                                alt10=2;
                            }
                            else if ( ((LA10_1 >= '\u0000' && LA10_1 <= '.')||(LA10_1 >= '0' && LA10_1 <= '\uFFFF')) ) {
                                alt10=1;
                            }


                        }
                        else if ( ((LA10_0 >= '\u0000' && LA10_0 <= ')')||(LA10_0 >= '+' && LA10_0 <= '\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:308:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:312:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:312:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:312:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\\') ) {
                    alt12=1;
                }
                else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '!')||(LA12_0 >= '#' && LA12_0 <= '[')||(LA12_0 >= ']' && LA12_0 <= '\uFFFF')) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:312:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:312:28: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:318:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:318:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:321:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:321:8: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:8: ( T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | NOTA_MUSICAL | PARAULA_TEMPO | PARAULA_INTENSITAT | PIEZZO | SILENCI | PREMOD | PUNTET | SEPARADOR_COMPAS | REP_OBRIR | FIGURA | TEMPO | COMPAS | ARMADURA | REPETICIO | PARTITURA | VEGADA | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | ENDPIEZZO | RETURN | READ | WRITE | TRUE | FALSE | ID | INT | COMMENT | STRING | WS )
        int alt13=62;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:10: T__72
                {
                mT__72(); 


                }
                break;
            case 2 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:16: T__73
                {
                mT__73(); 


                }
                break;
            case 3 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:22: T__74
                {
                mT__74(); 


                }
                break;
            case 4 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:28: T__75
                {
                mT__75(); 


                }
                break;
            case 5 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:34: T__76
                {
                mT__76(); 


                }
                break;
            case 6 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:40: T__77
                {
                mT__77(); 


                }
                break;
            case 7 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:46: T__78
                {
                mT__78(); 


                }
                break;
            case 8 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:52: T__79
                {
                mT__79(); 


                }
                break;
            case 9 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:58: T__80
                {
                mT__80(); 


                }
                break;
            case 10 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:64: T__81
                {
                mT__81(); 


                }
                break;
            case 11 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:70: T__82
                {
                mT__82(); 


                }
                break;
            case 12 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:76: T__83
                {
                mT__83(); 


                }
                break;
            case 13 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:82: NOTA_MUSICAL
                {
                mNOTA_MUSICAL(); 


                }
                break;
            case 14 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:95: PARAULA_TEMPO
                {
                mPARAULA_TEMPO(); 


                }
                break;
            case 15 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:109: PARAULA_INTENSITAT
                {
                mPARAULA_INTENSITAT(); 


                }
                break;
            case 16 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:128: PIEZZO
                {
                mPIEZZO(); 


                }
                break;
            case 17 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:135: SILENCI
                {
                mSILENCI(); 


                }
                break;
            case 18 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:143: PREMOD
                {
                mPREMOD(); 


                }
                break;
            case 19 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:150: PUNTET
                {
                mPUNTET(); 


                }
                break;
            case 20 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:157: SEPARADOR_COMPAS
                {
                mSEPARADOR_COMPAS(); 


                }
                break;
            case 21 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:174: REP_OBRIR
                {
                mREP_OBRIR(); 


                }
                break;
            case 22 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:184: FIGURA
                {
                mFIGURA(); 


                }
                break;
            case 23 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:191: TEMPO
                {
                mTEMPO(); 


                }
                break;
            case 24 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:197: COMPAS
                {
                mCOMPAS(); 


                }
                break;
            case 25 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:204: ARMADURA
                {
                mARMADURA(); 


                }
                break;
            case 26 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:213: REPETICIO
                {
                mREPETICIO(); 


                }
                break;
            case 27 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:223: PARTITURA
                {
                mPARTITURA(); 


                }
                break;
            case 28 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:233: VEGADA
                {
                mVEGADA(); 


                }
                break;
            case 29 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:240: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 30 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:246: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 31 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:256: LT
                {
                mLT(); 


                }
                break;
            case 32 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:259: LE
                {
                mLE(); 


                }
                break;
            case 33 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:262: GT
                {
                mGT(); 


                }
                break;
            case 34 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:265: GE
                {
                mGE(); 


                }
                break;
            case 35 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:268: PLUS
                {
                mPLUS(); 


                }
                break;
            case 36 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:273: MINUS
                {
                mMINUS(); 


                }
                break;
            case 37 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:279: MUL
                {
                mMUL(); 


                }
                break;
            case 38 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:283: DIV
                {
                mDIV(); 


                }
                break;
            case 39 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:287: MOD
                {
                mMOD(); 


                }
                break;
            case 40 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:291: NOT
                {
                mNOT(); 


                }
                break;
            case 41 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:295: AND
                {
                mAND(); 


                }
                break;
            case 42 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:299: OR
                {
                mOR(); 


                }
                break;
            case 43 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:302: IF
                {
                mIF(); 


                }
                break;
            case 44 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:305: THEN
                {
                mTHEN(); 


                }
                break;
            case 45 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:310: ELSE
                {
                mELSE(); 


                }
                break;
            case 46 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:315: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 47 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:321: WHILE
                {
                mWHILE(); 


                }
                break;
            case 48 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:327: DO
                {
                mDO(); 


                }
                break;
            case 49 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:330: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 50 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:339: FUNC
                {
                mFUNC(); 


                }
                break;
            case 51 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:344: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 52 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:352: ENDPIEZZO
                {
                mENDPIEZZO(); 


                }
                break;
            case 53 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:362: RETURN
                {
                mRETURN(); 


                }
                break;
            case 54 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:369: READ
                {
                mREAD(); 


                }
                break;
            case 55 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:374: WRITE
                {
                mWRITE(); 


                }
                break;
            case 56 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:380: TRUE
                {
                mTRUE(); 


                }
                break;
            case 57 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:385: FALSE
                {
                mFALSE(); 


                }
                break;
            case 58 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:391: ID
                {
                mID(); 


                }
                break;
            case 59 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:394: INT
                {
                mINT(); 


                }
                break;
            case 60 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:398: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 61 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:406: STRING
                {
                mSTRING(); 


                }
                break;
            case 62 :
                // /home/marcbenedi/Programs/Asl/src/parser/Asl.g:1:413: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\32\7\uffff\1\64\4\uffff\12\64\1\32\1\64\1\32\2\uffff\1\125\1"+
        "\uffff\1\127\2\125\1\64\1\125\1\64\2\uffff\1\136\1\140\3\uffff\1"+
        "\142\1\uffff\7\64\4\uffff\2\64\3\157\1\64\1\157\1\64\2\157\12\64"+
        "\5\32\2\64\2\33\3\uffff\1\64\2\125\2\64\6\uffff\1\64\1\u0086\1\u0087"+
        "\6\64\1\u008e\2\64\1\uffff\2\64\1\157\16\64\1\u00a1\3\64\1\u00a5"+
        "\2\uffff\6\64\1\uffff\15\64\1\uffff\2\64\1\u00be\1\64\1\uffff\1"+
        "\64\1\u00c1\1\64\1\uffff\1\u00c3\1\u00c4\1\u00c5\6\64\1\u00cc\4"+
        "\64\1\u009c\11\64\1\uffff\1\u00da\1\64\1\uffff\1\u00dc\3\uffff\1"+
        "\u00dd\3\64\1\u00e1\1\u00e2\1\uffff\1\u00e3\3\64\1\u009c\3\64\1"+
        "\u009c\1\u00ea\1\64\1\u00ec\1\64\1\uffff\1\u00ee\2\uffff\3\64\3"+
        "\uffff\2\64\1\u00f4\1\u009c\2\64\1\uffff\1\64\1\uffff\1\u009c\1"+
        "\uffff\1\64\1\u00f9\2\64\1\u009c\1\uffff\1\64\1\u00fd\1\64\1\u00ff"+
        "\1\uffff\1\64\1\u0101\1\64\1\uffff\1\u0103\1\uffff\1\u0104\1\uffff"+
        "\1\64\2\uffff\1\u009c";
    static final String DFA13_eofS =
        "\u0106\uffff";
    static final String DFA13_minS =
        "\1\11\7\uffff\1\145\4\uffff\1\157\1\145\1\151\1\141\1\151\1\141"+
        "\1\144\1\141\1\157\1\151\1\60\1\146\1\60\2\uffff\1\60\1\uffff\1"+
        "\72\2\60\1\143\1\60\1\145\2\uffff\2\75\3\uffff\1\52\1\uffff\1\156"+
        "\1\162\1\146\1\150\1\154\1\150\1\157\4\uffff\1\151\1\147\3\60\1"+
        "\144\1\60\1\154\2\60\1\156\1\141\1\154\1\141\1\155\2\145\1\162\1"+
        "\155\1\157\5\60\1\156\1\154\2\60\3\uffff\1\164\2\60\1\141\1\155"+
        "\6\uffff\1\144\2\60\1\145\1\165\1\163\1\144\2\151\1\60\1\143\1\141"+
        "\1\uffff\2\145\1\60\1\145\1\164\1\147\1\145\1\163\1\141\1\163\1"+
        "\172\1\164\1\40\1\160\2\143\1\163\1\60\1\165\1\144\1\160\1\60\2"+
        "\uffff\1\156\2\145\1\120\1\154\1\164\1\uffff\1\145\1\144\1\164\1"+
        "\162\1\156\1\157\1\151\1\147\1\151\1\144\1\164\1\172\1\151\1\uffff"+
        "\1\141\1\157\1\60\1\145\1\uffff\1\162\1\60\1\157\1\uffff\3\60\1"+
        "\146\1\150\1\165\1\151\2\145\1\60\1\141\1\151\1\141\1\143\1\60\1"+
        "\157\1\162\1\157\1\165\2\157\1\164\2\163\1\uffff\1\60\1\156\1\uffff"+
        "\1\60\3\uffff\1\60\1\151\1\156\1\145\2\60\1\uffff\1\60\1\143\1\164"+
        "\1\151\1\60\1\157\1\156\1\162\2\60\1\165\1\60\1\157\1\uffff\1\60"+
        "\2\uffff\1\154\1\143\1\172\3\uffff\1\151\1\157\2\60\2\141\1\uffff"+
        "\1\162\1\uffff\1\60\1\uffff\1\145\1\60\1\172\1\157\1\60\1\uffff"+
        "\1\164\1\60\1\141\1\60\1\uffff\1\157\1\60\1\164\1\uffff\1\60\1\uffff"+
        "\1\60\1\uffff\1\157\2\uffff\1\60";
    static final String DFA13_maxS =
        "\1\u00b7\7\uffff\1\157\4\uffff\1\157\1\145\1\157\1\141\1\157\1\145"+
        "\2\162\1\157\1\151\1\172\1\160\1\172\2\uffff\1\172\1\uffff\1\72"+
        "\2\172\1\146\1\172\1\145\2\uffff\2\75\3\uffff\1\57\1\uffff\1\156"+
        "\1\162\1\146\1\162\1\156\1\162\1\157\4\uffff\1\151\1\147\3\172\1"+
        "\144\1\172\1\154\2\172\1\156\1\141\1\154\1\141\1\155\2\145\1\162"+
        "\1\156\1\157\5\172\1\156\1\154\2\172\3\uffff\1\164\2\172\1\164\1"+
        "\155\6\uffff\1\144\2\172\1\145\1\165\1\163\1\144\2\151\1\172\1\143"+
        "\1\141\1\uffff\2\145\1\172\1\145\1\164\1\147\1\145\1\163\1\141\1"+
        "\163\1\172\1\164\1\40\1\160\2\143\1\163\1\172\1\165\1\144\1\160"+
        "\1\172\2\uffff\1\156\2\145\1\167\1\154\1\164\1\uffff\1\145\1\144"+
        "\1\164\1\162\1\156\1\157\1\151\1\147\1\151\1\144\1\164\1\172\1\151"+
        "\1\uffff\1\141\1\157\1\172\1\145\1\uffff\1\162\1\172\1\157\1\uffff"+
        "\3\172\1\146\1\150\1\165\1\151\2\145\1\172\1\141\1\151\1\141\1\143"+
        "\1\172\1\157\1\162\1\157\1\165\2\157\1\164\2\163\1\uffff\1\172\1"+
        "\156\1\uffff\1\172\3\uffff\1\172\1\151\1\156\1\145\2\172\1\uffff"+
        "\1\172\1\143\1\164\1\151\1\172\1\157\1\156\1\162\2\172\1\165\1\172"+
        "\1\157\1\uffff\1\172\2\uffff\1\154\1\143\1\172\3\uffff\1\151\1\157"+
        "\2\172\2\141\1\uffff\1\162\1\uffff\1\172\1\uffff\1\145\2\172\1\157"+
        "\1\172\1\uffff\1\164\1\172\1\141\1\172\1\uffff\1\157\1\172\1\164"+
        "\1\uffff\1\172\1\uffff\1\172\1\uffff\1\157\2\uffff\1\172";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\12\1\13\1\14"+
        "\15\uffff\1\17\1\22\1\uffff\1\23\6\uffff\1\35\1\36\2\uffff\1\43"+
        "\1\44\1\45\1\uffff\1\47\7\uffff\1\72\1\73\1\75\1\76\35\uffff\1\26"+
        "\1\25\1\24\5\uffff\1\40\1\37\1\42\1\41\1\74\1\46\14\uffff\1\15\26"+
        "\uffff\1\52\1\53\6\uffff\1\60\15\uffff\1\16\4\uffff\1\50\3\uffff"+
        "\1\51\30\uffff\1\62\2\uffff\1\66\1\uffff\1\54\1\70\1\55\6\uffff"+
        "\1\10\15\uffff\1\71\1\uffff\1\27\1\56\3\uffff\1\57\1\67\1\34\6\uffff"+
        "\1\20\1\uffff\1\30\1\uffff\1\65\5\uffff\1\21\4\uffff\1\63\3\uffff"+
        "\1\31\1\uffff\1\61\1\uffff\1\32\1\uffff\1\33\1\64\1\uffff";
    static final String DFA13_specialS =
        "\u0106\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\67\2\uffff\1\67\22\uffff\1\67\1\45\1\66\1\33\1\uffff\1\54"+
            "\1\1\1\uffff\1\2\1\3\1\52\1\50\1\4\1\51\1\5\1\53\12\65\1\6\1"+
            "\7\1\46\1\44\1\47\2\uffff\1\23\1\64\1\25\1\15\1\64\1\20\1\26"+
            "\4\64\1\22\1\17\2\64\1\24\1\64\1\16\1\21\1\43\1\64\1\10\4\64"+
            "\1\11\1\uffff\1\12\1\uffff\1\64\1\uffff\1\55\1\34\1\40\1\63"+
            "\1\61\1\31\2\64\1\57\3\64\1\30\1\37\1\56\1\27\1\64\1\42\1\41"+
            "\1\60\2\64\1\62\3\64\1\13\1\36\1\14\71\uffff\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\71\11\uffff\1\70",
            "",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74\5\uffff\1\75",
            "\1\76",
            "\1\100\5\uffff\1\77",
            "\1\101\3\uffff\1\102",
            "\1\103\7\uffff\1\104\3\uffff\1\105\1\uffff\1\106",
            "\1\111\7\uffff\1\110\10\uffff\1\107",
            "\1\112",
            "\1\113",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\115\11\64"+
            "\1\114\12\64",
            "\1\117\11\uffff\1\116",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\122\4\64\1\120"+
            "\16\64\1\121\5\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\123\3\64"+
            "\1\124\11\64",
            "",
            "\1\126",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\130\13\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\131\2\uffff\1\132",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\133\25\64",
            "\1\134",
            "",
            "",
            "\1\135",
            "\1\137",
            "",
            "",
            "",
            "\1\141\4\uffff\1\141",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146\11\uffff\1\147",
            "\1\150\1\uffff\1\151",
            "\1\152\11\uffff\1\153",
            "\1\154",
            "",
            "",
            "",
            "",
            "\1\155",
            "\1\156",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\160\12\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\161",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\162",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\163\16\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\175\1\174",
            "\1\176",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\177",
            "\1\u0080",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\u0081",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0083\22\uffff\1\u0082",
            "\1\u0084",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0085",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00ac\25\uffff\1\u00ab\2\uffff\1\u00a9\15\uffff\1\u00aa",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00c2",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00db",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00eb",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00ed",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u00f8",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00fa",
            "\1\u00fb",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u00fc",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00fe",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0100",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0102",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0105",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | NOTA_MUSICAL | PARAULA_TEMPO | PARAULA_INTENSITAT | PIEZZO | SILENCI | PREMOD | PUNTET | SEPARADOR_COMPAS | REP_OBRIR | FIGURA | TEMPO | COMPAS | ARMADURA | REPETICIO | PARTITURA | VEGADA | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | ENDPIEZZO | RETURN | READ | WRITE | TRUE | FALSE | ID | INT | COMMENT | STRING | WS );";
        }
    }
 

}