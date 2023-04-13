package Revisao;

public class Main {
    
    public static void main(String[] args) {
        
        // Criando dois pontos
        PC ponto1 = new PC(5.5, 13.7);
        PC ponto2 = new PC(2.8, 7.9);
        
        
        // Calculando a distância
        double distancia = ponto1.distanciaEuclidiana(ponto2);
        
        // print do resultado
        System.out.println("A distância entre os pontos (" + ponto1.getA() + ", " + ponto1.getB() + ") e (" + ponto2.getA() + ", " + ponto2.getB() + ") é " + distancia);
    }
}