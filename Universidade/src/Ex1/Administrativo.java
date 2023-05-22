package Ex1;

public class Administrativo extends Funcionario {

    String setor;

    public Administrativo(String nome, int idade, double salario, String setor){
        super(nome, idade, salario);
        this.setor = setor;
    }

    public String getSetor(){
        return setor;
    }
    
}
