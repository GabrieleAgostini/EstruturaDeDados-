public class NoAluno {
    private Aluno aluno;
    private NoAluno proximo;

    public NoAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public NoAluno getProximo() {
        return proximo;
    }

    public void setProximo(NoAluno proximo) {
        this.proximo = proximo;
    }
}
