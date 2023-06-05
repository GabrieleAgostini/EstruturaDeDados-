import java.util.LinkedList;
import java.util.Queue;

public class FilaAlunos {
    private Queue<String> filaAlunos;

    public FilaAlunos() {
        filaAlunos = new LinkedList<>();
    }

    public int size() {
        return filaAlunos.size();
    }

    public boolean isEmpty() {
        return filaAlunos.isEmpty();
    }

    public void add(String aluno) {
        filaAlunos.add(aluno);
    }

    public void remove() {
        filaAlunos.remove();
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            for (String aluno : filaAlunos) {
                System.out.println(aluno);
            }
        }
    }
}
