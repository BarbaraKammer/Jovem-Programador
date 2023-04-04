Program Pzim ;
Var
passagemnormal, meiapassagem, passagemgratis: Integer; 
normal, meia, gratis: Real;
valorpassagem: Real;
faturaporonibus, totalpassageiros, somageral: Real;
numeroonibus: real;
numpassageiros:real;

Begin
	 
   Write('Informe o valor atual da passagem inteira do onibus: ');
   Read(valorpassagem);
   Write('Informe quantos passageiros pagaram a passagem normal: ');
   Read(passagemnormal);
   Write('Informe quantos passageiros pagaram meia passagem: ');
   Read(meiapassagem);
   Write('Informe quantos passageiros não precisaram pagar a passagem: ');
   Read(passagemgratis);
   normal:=passagemnormal*valorpassagem;
   meia:=(meiapassagem*valorpassagem)/2;
   faturaporonibus:=normal+meia;
   numpassageiros:=passagemnormal+meiapassagem+passagemgratis;
   Writeln('A fatura deste onibus será de ', faturaporonibus:5:2, ' R$ e o número total de passageiros é de ', numpassageiros:1:0);
   
   
   
   
   
   
   
End.