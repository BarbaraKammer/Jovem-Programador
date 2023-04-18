import java.util.Scanner;

public class Ex4AlgoritmoPares {

    public static void main(String[] args) {
        

    Scanner entrada = new Scanner(System.in);
    int i, num;

    System.out.println("Insira um número: ");
    num = entrada.nextInt();

    for(i=0;i<=num; i++){
        if (i % 2 ==0){
            System.out.println(i);
        }
        
    }
    }
    
}
