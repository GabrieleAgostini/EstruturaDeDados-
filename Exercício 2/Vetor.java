public class Vetor {
    
    private int totalAlunos = 0;
    public Aluno alunos[];

    public Vetor(int tamanho){
        alunos = new Aluno[tamanho];
    }

    public void adiciona(Aluno aluno){
        this.alunos[totalAlunos] = aluno;
        totalAlunos++;
    }

    public int tamanho(){
        return this.totalAlunos;
    }

    public boolean contem(Aluno aluno){
        for(int i = 0; i<this.totalAlunos; i++){
            if(this.alunos[i].equals(aluno)){
                return true;
            }
        }
        return false;
    }
}