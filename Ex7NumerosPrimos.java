import java.util.Scanner;

public class Ex7NumerosPrimos {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Insira um numero: ");
        num = entrada.nextInt();

        for (int i=2; i<=num;i++) {
            Boolean primo = true;
            for (int j =2; j < i; j++){

            if(i % j==0){
                primo=false;

            }

            }
            if(primo){
                System.out.println(i);
            }
            
            
        }

          }

          
        


    }
    
