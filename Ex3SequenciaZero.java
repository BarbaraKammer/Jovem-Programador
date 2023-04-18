import java.util.Scanner;

public class Ex3SequenciaZero {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int i, num;

        System.out.println("Insira um numero: ");
        num = entrada.nextInt();

        for(i=0; num>=i; i++) {
            System.out.println(i);
        }


    }
    
}
