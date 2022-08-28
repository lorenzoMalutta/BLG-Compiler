namespace VerySimpleInterpreter.Lexer
{
    public enum ETokenType
    {
        EOF,        
        EOL,        // EOL    : [\n\r]+
        INPUT,      // INPUT  : 'read'
        OUTPUT,     // OUTPUT : 'write'
        VAR,        // VAR    : $[a-z]+
        NUM,        // NUM    : [0-9]+
        AT,         // AT     : '='
        OE,         // OE     : '('
        CE,         // CE     : ')'
        SUM,        // SUM    : '+'
        SUB,        // SUB    : '-'
        DIV,        // DIV    : '/'
        MULT,        // MULT   : '*'
        ERR
    }
}