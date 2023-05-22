public class Automoveis {

    public static void main(String[] args) {
        
        Carro carro = new Carro("Volkswagen", "Gol", 2013, 4);
        Moto moto = new Moto("Yamaha", "Factor", 2015, 150);

        System.out.println("Informações do carro:");
        System.out.println("Marca: "+carro.getMarca());
        System.out.println("Modelo: "+carro.getModelo());
        System.out.println("Ano de Fabricação: "+carro.getAnoFabricacao());
        System.out.println("Número de portas: "+carro.getNumeroPortas());
        System.out.println("");

        System.out.println("Informações moto: ");
        System.out.println("Marca: "+moto.getMarca());
        System.out.println("Modelo: "+moto.getModelo());
        System.out.println("Ano de Fabricação: "+moto.getAnoFabricacao());
        System.out.println("Cilindrada: "+moto.getCilindrada());
    }
    
}
