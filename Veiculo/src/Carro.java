public class Carro extends Veiculo{

    private int numeroPortas;

    public Carro(String marca, String modelo, int anoFabricacao, int numeroPortas){
        super(marca, modelo, anoFabricacao);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas(){
        return numeroPortas;
    }
    
}
