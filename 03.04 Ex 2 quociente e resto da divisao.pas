Program Pzim ;
VAR
N1, N2: Integer;
quociente:Integer;
restodivisao:Integer;
Begin
    Write('Insira um número: ');
    Read(N1);
    Write('Insira outro número: ');
    Read(N2);
    quociente:=(N1)div(N2);
    restodivisao:=(N1)mod(N2);
    Writeln('O quociente de ', N1, ' e ', N2, ' será ', quociente, ' e o resto da divisão destes dois números será ', restodivisao);
    
    
End.