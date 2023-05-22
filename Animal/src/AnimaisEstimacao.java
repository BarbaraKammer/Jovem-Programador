public class AnimaisEstimacao {

    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro("Bob", 8, "Mamífero", "Golden Retriver");
        Gato gato = new Gato("Simba", 2, "Mamífero", "Laranja");

        System.out.println("Informações do Cachorro: ");
        System.out.println("Nome: "+cachorro.getNome());
        System.out.println("Idade: "+cachorro.getIdade());
        System.out.println("Tipo: "+cachorro.getTipo());
        System.out.println("Raça: "+cachorro.getRaca());
        System.out.println("");

        System.out.println("Informações do Gato: ");
        System.out.println("Nome: "+gato.getNome());
        System.out.println("Idade: "+gato.getIdade());
        System.out.println("Tipo: "+gato.getTipo());
        System.out.println("Cor: "+gato.getCor());
    }
    
}
