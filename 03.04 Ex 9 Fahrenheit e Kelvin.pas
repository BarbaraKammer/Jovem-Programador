Program Pzim ;
Var
Temperatura, F, K: real;
Begin
    Write('Informe a temperatura em C: ');
    Read(Temperatura);
    F:=(9*Temperatura)/5+32;
    K:=Temperatura+273;
    Writeln('A temperatura de ', Temperatura:5:1, ' Celsius para Fahrenheit será ', F:5:2, ' F');
    Writeln('A temperatura de ', Temperatura:5:1, ' Celsius para Kelvin será ', K:5:2, ' K');
End.