package Questao1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {4, 5, 6, 7, 8};

        int[] intersecao = encontrarIntersecao(vetor1, vetor2);

        System.out.println("Interseção entre os vetores:");
        for (int elemento : intersecao) {
            System.out.print(elemento + " ");
        }
    }

    public static int[] encontrarIntersecao(int[] vetor1, int[] vetor2) {
        HashSet<Integer> conjuntoVetor1 = new HashSet<>();
        for (int elemento : vetor1) {
            conjuntoVetor1.add(elemento);
        }

        ArrayList<Integer> intersecao = new ArrayList<>();
        for (int elemento : vetor2) {
            if (conjuntoVetor1.contains(elemento)) {
                intersecao.add(elemento);
            }
        }

        int[] resultado = new int[intersecao.size()];
        for (int i = 0; i < intersecao.size(); i++) {
            resultado[i] = intersecao.get(i);
        }

        return resultado;
    }
}
