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
   Write('Vamos descobrir a área do triangulo! Insira o tamanho da base: ');
   Read(A);
   Write('Agora informe a altura deste triangulo: ');
   Read(C);
   AreaT:=(A*C)/2;
   Writeln('A área do trinagulo será ', AreaT:5:2);
   Write('Agora vamos descobrir a área de um círculo! Insira o valor do raio: ');
   Read(C);
   AreaCirc:=(PI*(SQR(C)));
   Writeln('A área do círculo será ', AreaCirc:5:2);
   Write('Por fim, vamos descobrir a área do quadrado! Insira o valor de um dos lados: ');
   Read(B);
   AreaQuad:=(SQR(B));
   Writeln('A área do quadrado será ', AreaQuad:5:2);
   
   
End.