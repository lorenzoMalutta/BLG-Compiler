using VerySimpleInterpreter.Lexer;

namespace VerySimpleInterpreter.Parser
{
    public class BasicParser
    {
        private BasicLexer _lexer;
        private Token _lookAhead;
        public BasicParser(BasicLexer lexer)
        {
            _lexer = lexer;
        }

        public void Match(ETokenType type)
        {
            if (_lookAhead.Type == type)
                _lookAhead = _lexer.GetNextToken();
            else
                Error("Expected "+ type+" - Found "+ _lookAhead.Type);
        }

        public void Error(String err)
        {
            Console.WriteLine("#Error on _____");
            Console.WriteLine("Line "+_lexer.Line);
            Console.WriteLine("Column "+_lexer.Column);
            Console.WriteLine("________________");
            Console.WriteLine(err);
            Console.WriteLine("________________");
            Environment.Exit(0);
        }

        /*
in     : INPUT VAR
out    : OUTPUT VAR
atrib  : VAR AT expr
expr   : termY
Y      : vazio | + expr | - expr
term   : factZ
Z      : vazio | * term | / term
fact   : NUM | VAR | OE expr CE
        */

        public void Prog() // prog   : lineX
        {
            Line();
            X();
        }

        public void X() //X : EOF | prog
        {
            if (_lookAhead.Type == ETokenType.EOF)
                Match(ETokenType.EOF);
            else
                Prog();
        }

        public void Line() // line   : stmt EOL
        {
            Stmt();
            Match(ETokenType.EOL);
        }
    
        public void Stmt() //stmt   : in | out | atrib  
        {
            if (_lookAhead.Type == ETokenType.INPUT)
                Input();
            else if (_lookAhead.Type == ETokenType.OUTPUT)
                Output();
            else if (_lookAhead.Type == ETokenType.VAR)
                Atrib();
            else
                Error("Expected Input, Output or Atrib");
        }

        public void Input()
        {
            Match(ETokenType.INPUT);
            Match(ETokenType.VAR);
        }

        public void Output()
        {
            Match(ETokenType.OUTPUT);
            Match(ETokenType.VAR);
        }

        public void Atrib()
        {
            Match(ETokenType.VAR);
            Match(ETokenType.AT);
            Expr();
        }

        public void Expr()
        {
            Term();
            Y();
        }

        public void Term()
        {
            Fact();
            Z();
        }

        public void Y()
        {
            if (_lookAhead.Type == ETokenType.SUM)
            {
                Match(ETokenType.SUM);
                Expr();
            }
            else if(_lookAhead.Type == ETokenType.SUB)
            {
                Match(ETokenType.SUB);
                Expr();
            }
            else if(!TestFollow(ETokenType.CE, ETokenType.EOL))
            {
                Error("Expected SUM, SUB, CE OR EOL");
            }
        }

        private bool TestFollow(params ETokenType[] list)
        {   
            return list.ToList().Exists(t => _lookAhead.Type == t);
        }

        public void Fact()
        {
            if(_lookAhead.Type == ETokenType.NUM)
            {
                Match(ETokenType.NUM);
            }

            else if(_lookAhead.Type == ETokenType.VAR)
            {
                Match(ETokenType.VAR);
            }

            else if(_lookAhead.Type == ETokenType.OE && _lookAhead.Type == ETokenType.CE)
            {
                Match(ETokenType.OE);
                Match(ETokenType.CE);
                Expr();
            }
        }


        public void Z()
        {
            if(_lookAhead.Type == ETokenType.MULT)
            {
                Match(ETokenType.MULT);
                Term();
            }

            else if(_lookAhead.Type == ETokenType.DIV)
            {
                Match(ETokenType.DIV);
                Term();
            }
        }

    }
}