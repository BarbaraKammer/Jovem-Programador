Program Pzim ;
VAR
N1, N2: Integer;
quociente:Integer;
restodivisao:Integer;
Begin
    Write('Insira um n�mero: ');
    Read(N1);
    Write('Insira outro n�mero: ');
    Read(N2);
    quociente:=(N1)div(N2);
    restodivisao:=(N1)mod(N2);
    Writeln('O quociente de ', N1, ' e ', N2, ' ser� ', quociente, ' e o resto da divis�o destes dois n�meros ser� ', restodivisao);
    
    
End.