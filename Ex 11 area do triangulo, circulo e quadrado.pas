Program Pzim ;
CONST
PI= 3.1415926;
VAR
AreaT:real;
AreaCirc:real;
RaioCirc:real;
AreaQuad:real;
Lado:real;
A, B, C:real;
Begin
   Write('Vamos descobrir a �rea do triangulo! Insira o tamanho da base: ');
   Read(A);
   Write('Agora informe a altura deste triangulo: ');
   Read(C);
   AreaT:=(A*C)/2;
   Writeln('A �rea do trinagulo ser� ', AreaT:5:2);
   Write('Agora vamos descobrir a �rea de um c�rculo! Insira o valor do raio: ');
   Read(C);
   AreaCirc:=(PI*(SQR(C)));
   Writeln('A �rea do c�rculo ser� ', AreaCirc:5:2);
   Write('Por fim, vamos descobrir a �rea do quadrado! Insira o valor de um dos lados: ');
   Read(B);
   AreaQuad:=(SQR(B));
   Writeln('A �rea do quadrado ser� ', AreaQuad:5:2);
   
   
End.