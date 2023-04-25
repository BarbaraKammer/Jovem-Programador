import java.util.Scanner;

public class Ex1aula2404 {
    public static void main(String[] args) {
        System.out.println("Menu Principal");

        System.out.println("1 - Fim");
        
        System.out.println("2 - Cadastro");
       
        System.out.println("3 - Consulta");

       
        System.out.println("Insira o número que corresponde a opção que você deseja: ");
        Scanner ler = new Scanner(System.in);

        int num = ler.nextInt();


        if ( num == 1|num==2| num==3 ){
            System.out.println("Você escolheu a opção "+num);
        }
        
        else {
            System.out.println("Você escolheu uma opção invalida!");
        }


    
    }
}
