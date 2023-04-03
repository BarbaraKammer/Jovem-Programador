Program Pzim ;
VAR
Nome: String;
Produto: String;
PrecoP: Real;
Quantidade: Real;
ValorCompra: Real;

Begin
   Write('Insira o nome do cliente: ');
   Read(Nome);
   Write('Digite qual produto a ser comprado: ');
   Read(Produto);
   Write('Insira o preco do produto: ');
   Read(PrecoP);
   Write('Informe a quantidade de produtos a serem comprados: ');
   Read(Quantidade);
   ValorCompra:= (PrecoP*Quantidade);
   Writeln('O(a) cliente ', Nome, ' esta levando ', Produto, ' e o valor total de sua compra sera ', ValorCompra:5:2);
   
End.