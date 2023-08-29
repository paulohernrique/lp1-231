package semana21;

//para implementar interface seguir abaixo

public class Quadrado implements FiguraGeometrica{
    private double lado;

    public Quadrado(double lado){
        this.lado=lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }

    @Override
    public double calcularPerimetro(){
        return 4*lado;
    }
}