Program Pzim ;
Var
iniciodia: real;
fimdia:real;
litros:real;
valortotal:real;
mediaconsumo:real;
kmrodado:real;
lucro:real;
valorcusto:real; 
litroskm:real;
Begin
    Write('Informe a marca��o do od�metro em Km do inicio do dia: ');
    Read(iniciodia);
    Write('Informe a marca��o do od�metro em Km do final do dia: ');
    Read(fimdia);
    Write('Quantos litros de combust�vel foram necess�rios para realizar esta viagem? ');
    Read(litros);
    Write('Qual o valor total recebido dos passageiros? ');
    Read(valortotal);
    kmrodado:=(fimdia - iniciodia);
    mediaconsumo:=kmrodado/litros;
    litroskm:=kmrodado/mediaconsumo;
    valorcusto:=litroskm*4.90;
    lucro:=valortotal-valorcusto;
    Write('A media de consumo do ve�culo foi de ', mediaconsumo:5:2, '  km por litro de combust�vel e o lucro l�quido da viagem � de ', lucro:5:2);
End.