Program Pzim ;
VAR
funcionario:String;
horastrabalhadas:integer;
dependentes:integer;
salario:real;

Begin
    Writeln('Insira o nome do funcion�rio: ');
    Read(funcionario);
    Writeln('Insira o n�mero total de horas trabalhadas por este funcion�rio: ');
    Read(horastrabalhadas);
    Writeln('Informe o n�mero de dependentes que este fucion�rio possui: ');
    Read(dependentes);
    salario:=(horastrabalhadas*12)+(dependentes*40);
		Writeln('O salario de ', funcionario, ' ser� de ', salario:5:2); 
    
End.