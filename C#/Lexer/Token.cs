namespace VerySimpleInterpreter.Lexer
{
    public class Token
    {

        public Token(ETokenType type, Int32? value = null)
        {
            Type = type;
            Value = value;
        }

        public ETokenType Type { get; set; }
        public Int32? Value{ get; set; }
    }
}