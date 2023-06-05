public class Main {
    public static void main(String[] args) {

        FilaAlunos fila = new FilaAlunos();

        System.out.println("Fila criada com sucesso!");

        fila.add("Guilherme");
        fila.add("Pietra");
        fila.add("Gabriele");

        System.out.println("Imprimindo fila:");
        fila.print();

        System.out.println("Tamanho da fila: " + fila.size());

        System.out.println("Removendo elemento da fila:");
        fila.remove();
        fila.print();

        System.out.println("Tamanho da fila: " + fila.size());

    }

}