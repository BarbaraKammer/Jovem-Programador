Program Pzim ;
VAR
AnoNasc: Real;
AnoAtual: Real;
Idade: Real;
Begin
    Write('Insira o ano do seu nascimento: ');
    Read(AnoNasc);
    Write('Insira o ano atual: ');
    Read(AnoAtual);
    Idade:= (AnoAtual-AnoNasc);
    Writeln('A sua idade atual é: ', Idade:5:0)
End.