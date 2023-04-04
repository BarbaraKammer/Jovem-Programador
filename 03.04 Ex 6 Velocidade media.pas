Program Pzim ;
VAR
KmH, Velmetros, Tempo: Real;

Begin
    Write('Digite a velocidade do veiculo em Km/h: ');
    Read(KmH);
    Velmetros:= KmH/3.6;
    Tempo:=435/Kmh;
    Writeln('A velocidade do veículo é de ', Velmetros:5:2, ' m/s ');
    Write('O tempo para realizar a viagem entre São Paulo e Rio de Janeiro na velocidade informada será de ', Tempo:1:0, ' horas ');
    
    
End.