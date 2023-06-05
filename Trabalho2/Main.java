import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String palavra = "arara";
        if (ePalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }

        Stack<Aluno> pilhaAlunos = new Stack<>();
        pilhaAlunos.push(new Aluno("Gabriele"));
        pilhaAlunos.push(new Aluno("Maria"));
        pilhaAlunos.push(new Aluno("Pietra"));

        System.out.println("Tamanho da pilha: " + pilhaAlunos.size());
        System.out.println("Pilha está vazia? " + pilhaAlunos.isEmpty());
        System.out.println("Topo da pilha: " + pilhaAlunos.peek().getNome());

        FilaAlunos filaAlunos = new FilaAlunos();
        filaAlunos.enqueue(new Aluno("Guilherme"));
        filaAlunos.enqueue(new Aluno("Ana"));
        filaAlunos.enqueue(new Aluno("Patricia"));

        System.out.println("Fila antes da inversão: ");
        filaAlunos.imprimir();

        inverterFila(filaAlunos);

        System.out.println("Fila depois da inversão: ");
        filaAlunos.imprimir();
    }

    public static boolean ePalindromo(String palavra) {
        Stack<Character> pilha = new Stack<>();
        int length = palavra.length();

        // Colocar cada caractere na pilha
        for (int i = 0; i < length; i++) {
            pilha.push(palavra.charAt(i));
        }

        // Comparar cada caractere da palavra com o topo da pilha
        for (int i = 0; i < length; i++) {
            if (palavra.charAt(i) != pilha.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void inverterFila(FilaAlunos fila) {
        Stack<Aluno> pilha = new Stack<>();

        // Transferir elementos da fila para a pilha
        while (!fila.isEmpty()) {
            pilha.push(fila.dequeue());
        }

        // Transferir elementos da pilha de volta para a fila
        while (!pilha.isEmpty()) {
            fila.enqueue(pilha.pop());
        }
    }
}