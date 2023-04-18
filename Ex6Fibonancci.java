import java.util.Scanner;

public class Ex6Fibonancci {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        int num;

        System.out.println("Insira um numero: ");
        num = entrada.nextInt();
       
        int limite = num;
        int anterior = 0;
        int atual = 1;
        while (atual < limite) {
            int proximo = anterior + atual;
            System.out.println(atual);
            anterior = atual;
            atual = proximo;
        }


    }

    
}
