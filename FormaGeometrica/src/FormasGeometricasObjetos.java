public class FormasGeometricasObjetos {

    public static void main(String[] args) {
        
        Quadrado quadrado = new Quadrado("Preto", 2);
        Circulo circulo = new Circulo("Rosa", 4);

        System.out.println("Atributos do Quadrado: ");
        System.out.println("Cor: "+quadrado.getCor());
        System.out.println("Lado: "+quadrado.getLado()+" cm");
        System.out.println("");

        System.out.println("Atributos do Círculo: ");
        System.out.println("Cor: "+circulo.getCor());
        System.out.println("Raio: "+circulo.getRaio()+" cm");
    }
    
}
