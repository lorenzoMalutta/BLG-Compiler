using VerySimpleInterpreter.Lexer;

namespace VerySimpleInterpreter.Parser
{
    public class BasicParser
    {
        private SymbolTable _symbolTable;   
        private BasicLexer _lexer;
        private Token _lookAhead;
        public BasicParser(BasicLexer lexer, SymbolTable st)
        {
            _lexer = lexer;
            _lookAhead = _lexer.GetNextToken();
            _symbolTable = st;
        }

        public void Match(ETokenType type)
        {
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
            var token = _lookAhead.Value;
            Match(ETokenType.VAR);
            Match(ETokenType.AT);
            var e = Expr();
            if(token != null)
            {
                var entry = _symbolTable.GetEntry(token.Value);
                if(entry != null)
                    entry.Value = e;
            }
        }

        public Double Expr()
        {
            var res1 = Term();
            return Y(res1);
        }

        public Double Term()
        {
            var f = Fact();
            return Z(f);
        }

        public Double Y(Double t)
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
                Error("Expected CE OR EOL");
            }
            return t;
        }

        private bool TestFollow(params ETokenType[] list)
        {   
            return list.ToList().Exists(t => _lookAhead.Type == t);
        }

        public Double Fact() //T
        {
            if(_lookAhead.Type == ETokenType.NUM)
            {
                Double num = Convert.ToDouble(_lookAhead.Value);
                Match(ETokenType.NUM);
                return num;
            }

            else if (_lookAhead.Type == ETokenType.VAR){
                int? key = _lookAhead.Value;
                Double val = 0;
                if (key == null)
                {
                    Error("Expected VAR");
                    var s = _symbolTable.Get(key.Value);
                    Match(ETokenType.VAR);
                    val = s.Value;
                }
                return val;
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


        public Double Z(Double left)
        {
            if (_lookAhead.Type == ETokenType.MULT)
            {
                Match(ETokenType.MULT);
                var res = Term();
                return left * res;
            }
            else if(_lookAhead.Type == ETokenType.DIV)
            {
                Match(ETokenType.DIV);
                var res = Term();
                return left / res;
            }
            else if(!TestFollow(ETokenType.CE, ETokenType.EOL))
            {
                Error("Expected CE OR EOL");
            }
            return left;
        }
    }
}