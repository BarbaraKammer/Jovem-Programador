import java.util.Scanner;

public class Ex5IdadeMenor {
    public static void main(String[] args) {
        
    int idadeMaisNova = Integer.MAX_VALUE;
    String nomeMaisNovo = "";
    Scanner scanner = new Scanner(System.in);

    for (int i = 1; i <=10;i++){
        System.out.println("Informe o nome da pessoa "+i+": ");
        String nome = scanner.nextLine();
        System.out.println("Informe a idade da pessoa "+i+": ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        if(idade<idadeMaisNova){
            idadeMaisNova = idade;
            nomeMaisNovo = nome;
        }
    }
    System.out.println("A pessoa mais nova é "+nomeMaisNovo+" com "+idadeMaisNova+" anos");

    }
    
}
