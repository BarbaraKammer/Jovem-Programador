public class FuncionariosObjeto {

    public static void main(String[] args) {
        
       
    Gerente gerente = new Gerente("Adriano", 45, 5580, "Gerente de vendas");
    Vendedor vendedor = new Vendedor("Jessica", 25, 2100, 50000);

    System.out.println("Informações do Gerente: ");
    System.out.println("Nome "+gerente.getNome());
    System.out.println("Idade: "+gerente.getIdade());
    System.out.println("Salario: "+gerente.getSalario());
    System.out.println("Area de atuação: "+gerente.getAreaAtuacao());
    System.out.println("");

    System.out.println("Informações do Vendedor: ");
    System.out.println("Nome: "+vendedor.getNome());
    System.out.println("Idade: "+vendedor.getIdade());
    System.out.println("Salario: "+vendedor.getSalario());
    System.out.println("Meta de vendas: "+vendedor.getMetaVendas());

    }   
    
}
