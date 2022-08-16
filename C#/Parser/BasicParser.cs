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
            Console.WriteLine("FOI AQ");
            if (_lookAhead.Type == type)
                _lookAhead = _lexer.GetNextToken();
            else
                Error("Expected "+ type +" - Found "+ _lookAhead.Type);
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
                Error("Expected Input, Output or Var");
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

        public int Expr()
        {
            var res1 = Term();
            var res2 = Y(res1); //R
            return res2;
        }

        public int Term()
        {
            var res1 = Fact();
            var res2 = Z(res1);
            return res2;
        }

        public int Y(int t)
        {
            if (_lookAhead.Type == ETokenType.SUM)
            {
                Match(ETokenType.SUM);
                var res = Expr();
                return t + res;
            }
            else if(_lookAhead.Type == ETokenType.SUB)
            {
                Match(ETokenType.SUB);
                var res = Expr();
                return t - res;
            }
            else if(!TestFollow(ETokenType.CE, ETokenType.EOL))
            {
                Error("Expected SUM, SUB, CE OR EOL");
            }
            return t;
        }

        private bool TestFollow(params ETokenType[] list)
        {   
            return list.ToList().Exists(t => _lookAhead.Type == t);
        }

        public int Fact() //T
        {
            if(_lookAhead.Type == ETokenType.NUM)
            {
                var res = _lookAhead.Value;
                Match(ETokenType.NUM);
                if(res != null)
                {
                    return 0;
                }
                else
                {
                    return 0;
                }
            }

            else if(_lookAhead.Type == ETokenType.VAR)
            {
                Match(ETokenType.VAR);
                return 0;
            }

            else if(_lookAhead.Type == ETokenType.OE)
            {
                Match(ETokenType.OE);
                var res = Expr();
                Match(ETokenType.CE);
                return res;
            }
            else {
                Error("Expected NUM, VAR or OE");
            }
            return 0;
        }


        public int Z(int t)
        {
            if(_lookAhead.Type == ETokenType.MULT)
            {
                Match(ETokenType.MULT);
                var res = Term();
                return t + res;
            }

            else if(_lookAhead.Type == ETokenType.DIV)
            {
                Match(ETokenType.DIV);
                var res = Term();
                return t + res;
            }
            return t;
        }

    }
}