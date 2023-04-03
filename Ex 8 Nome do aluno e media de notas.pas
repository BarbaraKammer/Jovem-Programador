Program Pzim ;
VAR
Aluno: STRING;
N1: Real;
N2: Real;
N3: Real;
Media: Real;
Begin
     Write('Insira o nome do aluno:  ');
     Read(Aluno);
     Write('Insira a primeira nota deste aluno: ');
     Read(N1);
     Write('Insira a segunda nota: ');
     Read(N2);
     Write('Insira a terceira nota: ');
     Read(N3);
     Media:=(N1+N2+N3)/3;
     Writeln('O Aluno(a)', Aluno, ' possui a media de notas igual a ', Media:5:2);
End.