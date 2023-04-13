package Revisao;

public class PontoCartesiano {
    
    private double a;
    private double b;
    
    public PontoCartesiano(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double getA() {
        return a;
    }
    
    public void setA(double a) {
        this.a = a;
    }
    
    public double getB() {
        return b;
    }
    
    public void setB(double b) {
        this.b = b;
    }
    
    public double distanciaEuclidiana(PontoCartesiano outroPonto) {
        double deltaA = this.a - outroPonto.getA();
        double deltaB = this.b - outroPonto.getB();
        return Math.sqrt(deltaA * deltaB + deltaB * deltaB);
    }
}
