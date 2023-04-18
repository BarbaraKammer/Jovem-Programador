import java.util.Scanner;

public class Ex1AprovadoReprovado {

    public static void main(String[] args) {

     Scanner ent = new Scanner(System.in);

     double num1, num2, num3, soma, media = 0;
     

     
        System.out.println("Digite a primeira nota do aluno: ");
        num1 = ent.nextDouble();

        System.out.println("Digite a segunda nota: ");
        num2 = ent.nextDouble();

        System.out.println("Digite a terceira nota: ");
        num3 = ent.nextDouble();


        soma = (num1 + num2 + num3);
        media = soma/3;

        System.out.println("A média do aluno é "+media);

        if (media>=7.0) {
            
            System.out.println("O aluno está APROVADO");
        }
        else{
            System.out.println("O aluno está REPROVADO");
        }

    }
    
}
