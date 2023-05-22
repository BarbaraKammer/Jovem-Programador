public class Gerente extends Funcionario{

    private String areaAtuacao;

    public Gerente(String nome, int idade, double salario, String areaAtuacao){
        super(nome, idade, salario);
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao(){
        return areaAtuacao;
    }
    
}
