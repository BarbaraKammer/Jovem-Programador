public class Moto extends Veiculo{

    private int cilindrada;

    public Moto(String marca, String modelo, int anoFabricacao, int cilindrada){
        super(marca, modelo, anoFabricacao);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada(){
        return cilindrada;
    }
    
}
