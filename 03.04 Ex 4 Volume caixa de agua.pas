Program Pzim ;
Var
Altura, Largura, Profundidade: Integer;
Volume: Integer;
Begin
   Writeln('Vamos descobrir o volume de uma caixa de agua! Os valores informados devem ser em cm!');
	 Write('Digite o valor da altura desta caixa: ');
   Read(Altura);
   Write('Digite o valor da largura: ');
   Read(Largura);
   Write('Por fim, informe a profundidade: ');
   Readln(Profundidade);
   Volume:=Altura*Largura*Profundidade;
   Write('De acordo com os valores informados, o volume da caixa de agua será de ', Volume, ' cm3');
   
End.