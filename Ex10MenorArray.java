public class Ex10MenorArray {
    public static void main(String[] args) {
       
        int[] array = {1,2,3,2,1,5,6};
        int inicio = 0;
        int fim = 0;
        int maiorInicio = 0;
        int maiorFim = 0;
        int tamanho = 1;
        int maiorTamanho = 1;

        for (int i = 1; i < array.length; i++){
            if (array[i] >=array [i-1]){
                fim = i;
                tamanho++;
                if (tamanho > maiorTamanho){
                    maiorTamanho = tamanho;
                    maiorInicio = inicio;
                    maiorFim = fim;
                }

            } else {
                inicio = i;
                fim = i;
                tamanho = 1;
            }
        }
        int[] subarray = new int [maiorTamanho];
        for (int i = 0; i < maiorTamanho; i++){
            subarray[i]= array[maiorInicio+i];
        }
        System.out.println("O maior subarray não descrescente é: ");
        for (int i = 0; i<maiorTamanho; i++){
            System.out.println(subarray[i]+" ");
        }
        System.out.println("com comprimento "+maiorTamanho);
 }  
    
}
