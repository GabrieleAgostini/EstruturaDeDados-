package vetor;

public class Vetor implements IVetor {
    private Aluno alunos[] = new Aluno[4];
    private int posiçao = 0;
  
	@Override
	public void adiciona(Aluno aluno) {
		if (!cheio()) {
            this.alunos[posiçao] = aluno;
            this.posiçao++;
        } else {
            aumentaTam();
            adiciona(aluno);
        }
	}
	private void aumentaTam() {
		if (cheio()) {
            Aluno newVet[] = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
                newVet[i] = this.alunos[i];
            }
            this.alunos = newVet;
        }
	}
	@Override
	public int tamanho() {
		return posiçao;
	}
    @Override
    public boolean contem(Aluno aluno) {
        for (int i = 0; i < posiçao; i++) {
            if (alunos[i] != null) {
                if (this.alunos[i].getNome().equals(aluno.getNome())) {
                    return true;
                }
            }
        }
        return false;
    }

	@Override
	public boolean cheio() {
		if (posiçao == alunos.length)
		return true;
	return false;
	}
	@Override
	public boolean remove(Aluno aluno) {
		int ind = -1;
        Aluno al[] = new Aluno[alunos.length];
        for (int i = 0; i < posiçao; i++) {
            if (aluno == alunos[i]) {
                ind = i;
                break;
            } else {
                al[i] = alunos[i];
            }
        }
        if (ind != -1) {
            for (int i = ind + 1; i < alunos.length; i++) {
                al[i - 1] = alunos[i];
            }
            alunos = al;
            posiçao--;
            alunos[posiçao] = null;
            return true;
        } else
            System.out.println("Este aluno Nao foi cadastrado!");
        return false;
	}
    public char[] remove(String string) {
        return null;
    }
	
}
