public class Quadrado extends FormaGeometrica{

    private double lado;

    public Quadrado(String cor, double lado){
        super(cor);
        this.lado = lado;

    }

    public double getLado() {
        return lado;
    }
    
}
