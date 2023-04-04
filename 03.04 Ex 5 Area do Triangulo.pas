Program Pzim ;
VAR
Base, Altura, AreaT: Real;
Begin
    Writeln('Vamos descobrir a área de um triangulo! Os valores deverão ser informados em centimetros!');
    Write('Digite o valor da base: ');
    Read(Base);
    Write('Digite o valor da altura: ');
    Read(Altura);
    AreaT:=(Base*Altura)/2;
    Write('De acordo com os valores informados, a área do Triangulo será de ', AreaT:5:2, ' cm');
    
End.