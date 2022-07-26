using VerySimpleInterpreter.Lexer;
using System.Text;

namespace VerySimpleInterpreter
{
    public class TableEntry {
        public ETokenType Type {get;set;}
        public String Name {get;set;}
        public Double? Value {get;set;}

        public TableEntry (ETokenType type, String name, Double? value = null)
        {
            Type = type;
            Name = name;
            Value = value;
        }
    }

    public class SymbolTable
    {

        private Int32 _key = 0;
        private Dictionary<int,TableEntry> _data;

        public SymbolTable()
        {
            _data = new Dictionary<int,TableEntry>();
        }

        public Int32 Put(string name){

            return this.Put(name, null);
        }

        public Int32 Put(string name, Double? value){
            var (entry, k) = GetByName(name);
            if (entry != null)
                return k;
            
            _data.Add(++_key, new TableEntry(ETokenType.VAR, name, value));
            return _key;
        }

        public (TableEntry?, Int32) GetByName(String name) 
        {
            foreach(var k in _data.Keys.ToList())
            {
                if (_data[k].Name == name){
                    return (_data[k], k);
                }
            };
            return (null, 0);
        }

        public double? Get(Int32 key){
            if (!(_data.ContainsKey(key)))
                return null;
            TableEntry entry = _data[key];
            return entry.Value;
        }


        public override String ToString()
        {
            var sb = new StringBuilder();
            sb.Append("ID".PadRight(5, ' '));
            sb.Append("Type".PadRight(10, ' '));
            sb.Append("Name".PadRight(15, ' '));
            sb.Append("Value".PadRight(5, ' '));
            sb.AppendLine();

            _data.Keys.ToList().ForEach(k => {
                var entry = _data[k];
                sb.Append(k.ToString().PadRight(5, ' '));
                sb.Append(entry.Type.ToString().PadRight(10, ' '));
                sb.Append(entry.Name.ToString().PadRight(15, ' '));
                if(entry.Value.HasValue)
                    sb.Append(entry.Value.Value.ToString().PadRight(5, ' '));
                sb.AppendLine();
            });
            return sb.ToString();
        }
    
    }
}