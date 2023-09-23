# BLG Compiler

BLG Compiler is a compiler developed with the ANTLR4 tool that has the ability to compile a custom programming language called BLG Language.

## How to compile BLG Language?

To compile BLG Language, you need to use the following command:

This command will generate the Grammar folder containing LangLexer.cs, LangParser.cs, and LangVisitor.cs.

## BLG Language Syntax

The BLG programming language has the following control structures:

### Function declaration
```
function function_name(arguments){
//code block
}
```

### Input and Output Commands
```
write "message";
read variable;

If the input does not respect the type, a loop starts to verify the type until the type is correct.
```

### FOR loop
```
for(variable; condition; increment){
//code block
}
```

### WHILE loop
```
while(condition){
//code block
}
```

### DO-WHILE loop
```
do {
//code block
} while(condition);
```

### IF-ELSE decision structure
```
if(condition){
//code block
} else {
//code block
}
```

## Example of BLG Language Program
```
function multiplicacao(num1, num2,num3){
    write num1 * num2 / num3;
}

write "Digite o primeiro número:";
read num1;
write "Digite o segundo número:";
read num2;
write "Digite o terceiro número:";
read num3;

write "Chamando a função multiplicacao";
multiplicacao(num1,num2,num3);

function CalcFatorial (fatorial,n){

      for (numero i = 1;i <= n; numero i = (i + 1)) {
          numero fatorial = fatorial * i;
        }

      write fatorial;

}

numero fatorial = 1;
write "fatorial de quanto?";
numero read n;

write "chamando a função CalcFatorial...";
CalcFatorial(fatorial, n);

write "informe um número:";
numero read x;
write "informe outro número:";
numero read y;

write "começo do FOR";
for(numero i; i < 10; numero i = i + 1){
    numero x = (x + 1);
    write x;
};

write "informe um número:";
numero read x;
write "informe outro número:";
numero read y;

write "começo do WHILE";
while(i < 10){
    numero x = (x + 1);
    write x;
};

write "informe um número:";
numero read x;
write "informe outro número:";
numero read y;

write "Começo DoWhile";
do {
    numero x = x + 1;
    write x;
}
while (i < 10);

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
```

## Conclusion

With BLG Language, it is possible to develop programs in a custom programming language with basic control structures. The BLG Compiler allows compiling these programs and generating executable code.
