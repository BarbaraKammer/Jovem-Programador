public class Cachorro extends Animal{

    private String raca;

    public Cachorro(String nome, int idade, String tipo, String raca){
        super(nome, idade, tipo);
        this.raca = raca;
    }

    public String getRaca(){
        return raca;
    }
    
}
