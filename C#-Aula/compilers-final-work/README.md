# compilers-final-work

```
    antlr4 -visitor -Dlanguage=CSharp -o Grammar/ Lang.g4 
```

Example:

function hello(){
    write "Hello World";
}

function hello(str){
    x = "Hello" + str;
    write x;
}

write "Chamada de função";
hello();
hello();
hello();
hello();

write hello("world");

write "Fim da chamada de função";


EXAMPLE

write "informe um número:";
numero read x;
write "informe outro número:";
numero read y;
if (x > y) then {
  write "X é maior que Y";
} else { 
  if (x < y) then {
    write "Y é maior que X";
  } else {
    write "Y e X são iguais"; 
  }
}
while (x < 10) do {
    numero x = x + 1;
    write "X:";
    write x;
}