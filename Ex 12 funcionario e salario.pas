Program Pzim ;
VAR
funcionario:String;
horastrabalhadas:integer;
dependentes:integer;
salario:real;

Begin
    Writeln('Insira o nome do funcionário: ');
    Read(funcionario);
    Writeln('Insira o número total de horas trabalhadas por este funcionário: ');
    Read(horastrabalhadas);
    Writeln('Informe o número de dependentes que este fucionário possui: ');
    Read(dependentes);
    salario:=(horastrabalhadas*12)+(dependentes*40);
		Writeln('O salario de ', funcionario, ' será de ', salario:5:2); 
    
End.