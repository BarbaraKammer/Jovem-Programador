Program Pzim ;
VAR
peso:integer;
altura:real;
imc:real;
Begin
  Writeln('Vamos calcular o seu IMC!');
  Writeln('Qual a sua altura? ');
  Read(altura);
  Writeln('Qual o seu peso atual? ');
  Read(peso);
  imc:= peso/(SQR(altura));
  Writeln('Seu IMC corresponde ao valor de ', imc:5:2);
End.