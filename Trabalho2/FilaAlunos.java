public class FilaAlunos {
    private NoAluno inicio;
    private NoAluno fim;

    public void enqueue(Aluno aluno) {
        NoAluno novoNo = new NoAluno(aluno);
        if (isEmpty()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
    }

    public Aluno dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está vazia.");
        }
        Aluno aluno = inicio.getAluno();
        inicio = inicio.getProximo();
        if (inicio == null) {
            fim = null;
        }
        return aluno;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void imprimir() {
        NoAluno temp = inicio;
        while (temp != null) {
            System.out.println(temp.getAluno().getNome());
            temp = temp.getProximo();
        }
    }
}

