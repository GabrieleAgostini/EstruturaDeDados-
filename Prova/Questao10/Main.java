package Questao10;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {3, 7, 1, 4, 9, 2};

        System.out.println("Vetor original: ");
        exibirVetor(vetor);

        // Bubble Sort
        bubbleSort(vetor.clone());

        // Selection Sort
        selectionSort(vetor.clone());

        // Insertion Sort
        insertionSort(vetor.clone());
    }
}