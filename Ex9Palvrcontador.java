import java.util.HashMap;
import java.util.Scanner;

public class Ex9Palvrcontador {
    public static void main(String[] args) {  

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        String[] palavras = frase.split(" ");
        HashMap<String, Integer> contador = new HashMap <>();
        for (String palavra : palavras){
          if (contador.containsKey(palavra)){
              contador.put(palavra, contador.get(palavra)+1);
          }else {
              contador.put(palavra,1);
          }
  
        }
        for (String palavra : contador.keySet()){
          if(contador.get(palavra)>=1){
              System.out.println(palavra+" aparece "+contador.get(palavra)+" vezes.");
          }
        }
  
      }
     
    
}
