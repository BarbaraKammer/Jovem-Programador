package Ex1;
public class Professor extends Funcionario{

    private String disciplina;

    public Professor(String nome, int idade, double salario, String disciplina){
        super(nome, idade, salario);
        this.disciplina= disciplina;
    }

    public String getDisciplina(){
        return disciplina;
    }
    
}
