Program Pzim ;
Var
Num: Integer;
Tabuada: Integer;
Begin
    Write('Digite um valor entre 1 a 10: ');
    Read(Num);
    For Tabuada:= 1 To 10 Do 
		Writeln(Num, ' x ', Tabuada, ' = ', Num*Tabuada);
		Readln;
End.