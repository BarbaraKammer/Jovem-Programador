import java.nio.channels.NonWritableChannelException;
import java.text.BreakIterator;
import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

public class Ex3aula2404 {

    public static void main(String[] args) {


        int opcao = 0;
        Scanner ler = new Scanner(System.in);
        while(opcao!=1){

        System.out.println("1 - Fim");
        System.out.println("2 - Calcular Raiz");
        System.out.println("Escolha uma das opções acima:");

        
        opcao = ler.nextInt();





        if (opcao == 1){
            System.out.println("Fim do programa");
            break;
        } 

        if (opcao ==2){
            System.out.println("Informe um numero real: ");
            Scanner ler1 = new Scanner(System.in);

            double num = ler1.nextDouble();

            if (num>=0){

                double raizquadrada = Math.sqrt(num);
                System.out.println("A raiz quadrada de "+num+" é "+raizquadrada);
            }else{
                System.out.println("Erro. Número informado é inválido!");
            }
        }else{

            System.out.println("Opção invalida");



        }

        }
    }
    }
    

    
    

