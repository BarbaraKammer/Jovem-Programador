Program Pzim ;
VAR
precofabrica, impostos, percrevendedor, precofinal: real;
nomeautomovel: string;
Begin
	Writeln('Informe o nome do automovel: ');
	Read(nomeautomovel);
  Write('Digite o pre�o de f�brica do autom�vel: ');
  Read(precofabrica);
  percrevendedor:= (precofabrica*25)/100;
  impostos:= (precofabrica*15)/100;
  precofinal:= precofabrica+percrevendedor+impostos;
  Writeln('O valor final do ', nomeautomovel, ' ser� de ', precofinal:5:4);
  
End.