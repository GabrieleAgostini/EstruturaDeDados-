
public class Main {
    public static void main(String[] args){
        Vetor vetAlunos = new Vetor(5);

        Aluno aluno1 = new Aluno("pedro", 22, 5.9);
        Aluno aluno2 = new Aluno("ana", 25, 6.8);

        vetAlunos.adiciona(aluno1);
        vetAlunos.adiciona(aluno2);

        System.out.println(vetAlunos.tamanho());
        System.out.println(vetAlunos.contem(aluno1));
        System.out.println(vetAlunos.contem(aluno2));
    }
}