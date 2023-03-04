# compilers-final-work

```
    antlr4 -package Grammar -visitor -Dlanguage=CSharp -o Grammar/ Lang.g4 
```

Example:

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
while (x < 10) {
    numero x = x + 1;
    write "X:";
    write x;
}

EXAMPLE

```
write "escreva um número:";
numero read x;
write "escreva um número:";
numero read i;
//-----------------------------------------------------
write "começo do FOR";
for(numero i; i < 10; numero i = i + 1){
    numero x = (x + 1);
    write x;
};
"Write "Fim FOR;
//-----------------------------------------------------
write "começo do WHILE";
while(x < 10){
    numero x = (x + 1);
    write x;
};
"Write "Fim WHILE;
//-----------------------------------------------------
write "Começo DoWhile";
do {
    numero x = x + 1;
    write x;
}
while (x < 10);
"Write "Fim DoWhile;

```