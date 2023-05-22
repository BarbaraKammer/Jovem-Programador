public class Vendedor extends Funcionario {

    private double metaVendas;

    public Vendedor(String nome, int idade, double salario, double metaVendas){
        super(nome, idade, salario);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas(){
        return metaVendas;
    }

    
}
