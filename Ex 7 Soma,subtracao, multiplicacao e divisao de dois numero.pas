Program Pzim ;
VAR
N1: Real;
N2: Real;
soma: Real;
subtracao: Real;
multiplicacao: Real;
divisao: Real;
Begin
   Write('Insira o primeiro numero: ');
   Read(N1);
   Write('Insira o segundo numero: ');
   Read(N2);
   soma:= (N1+N2);
   subtracao:= (N1-N2);
   multiplicacao:= (N1*N2);
   divisao:= (N1/N2);
   Writeln('A soma entre o primeiro e o segundo número é: ',soma:5:1);
   Writeln('A subtracao entre o primeiro e o segundo número é: ', subtracao:5:1);
   Writeln('A multiplicacao entre o primeiro e o segundo número é: ', multiplicacao:5:1);
   Writeln('A divisao entre o primeiro e o segundo numero é: ', divisao:5:1);
End.