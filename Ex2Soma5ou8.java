import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Ex2Soma5ou8 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num;
        double SomaPar, SomaImpar = 0;

        System.out.println("Insira um número: ");
        num = entrada.nextInt();

        if (num % 2 ==0){
         SomaPar = num+5;
         System.out.println("O número informado é par, somado a 5 dará o seguinte resultado: "+SomaPar);


        }
        else
        {
            SomaImpar = num+8;
            System.out.println("O número informado é impar, somado a 8 dará o seguinte resultado: "+SomaImpar);
        }

       
    }
    
}
