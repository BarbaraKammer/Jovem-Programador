import java.util.Scanner;

public class Ex2aula2404 {
    public static void main(String[] args) {
        


        System.out.println("Informe o valor nominal(salário bruto)");
        Scanner ler = new Scanner(System.in);
        double salariobruto = ler.nextDouble();

        System.out.println("Informe a quantidade de horas extras:");
        
        int horasextras = ler.nextInt();

        double valorhoraextra =(salariobruto/176)*horasextras*1.5;

        double INSS = (salariobruto + valorhoraextra) * 10/100;

        if (INSS>=150){
            INSS = 150;

        }

        double salarioliquido = salariobruto+valorhoraextra - INSS;

        System.out.println("Os componentes do salário são: "+salariobruto+" correspondente ao valor nominal");
        System.out.println(+valorhoraextra+" valor adicional correspondente as horas extras");
        System.out.println(+INSS+" valor descontado para o INSS ");

        System.out.println("Sendo assim, o salario liquido será: " +salarioliquido);


         

    }
    
}
