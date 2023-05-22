package Ex1;
public class Universidade {

    public static void main(String[] args) {
        Professor professor = new Professor("Jorge", 35, 2500, "Programação");
        Administrativo administrativo = new Administrativo("Joana", 40, 1500, "Cobrança");
    
    
    System.out.println("Iformações do Professor:");
    System.out.println("Nome: "+professor.getNome());
    System.out.println("Idade: "+professor.getIdade());
    System.out.println("Salario: "+professor.getSalario());
    System.out.println("Disciplina: "+professor.getDisciplina());
    System.out.println("");

    System.out.println("Informações do Funcionário Administrativo");
    System.out.println("Nome: "+administrativo.getNome());
    System.out.println("Idade: "+administrativo.getIdade());
    System.out.println("Salario: "+administrativo.getSalario());
    System.out.println("Setor: "+administrativo.getSetor());

    }
    
}
