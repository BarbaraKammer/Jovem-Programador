Program Pzim ;
VAR
Base, Altura, AreaT: Real;
Begin
    Writeln('Vamos descobrir a �rea de um triangulo! Os valores dever�o ser informados em centimetros!');
    Write('Digite o valor da base: ');
    Read(Base);
    Write('Digite o valor da altura: ');
    Read(Altura);
    AreaT:=(Base*Altura)/2;
    Write('De acordo com os valores informados, a �rea do Triangulo ser� de ', AreaT:5:2, ' cm');
    
End.