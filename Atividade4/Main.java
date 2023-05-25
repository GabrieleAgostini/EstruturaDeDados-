package Atividade4;

public class Main {

	public static void main(String[] args) {
		// cria o vetor
        Vetor alunos = new Vetor();
		// adiciona os alunos 
		alunos.adiciona(new Aluno("Lilian",28,9.5));
		alunos.adiciona(new Aluno("Nathália", 31, 180));
		alunos.adiciona(new Aluno("Cristian",30,9.5));
		alunos.adiciona(new Aluno("Ângela", 27, 0));
		alunos.adiciona(new Aluno("Osmar",21,5.5));
		alunos.adiciona(new Aluno("Patrick", 27, 6.8));


		// print do resultado 
		System.out.println(alunos.tamanho());
		System.out.println(alunos.cheio());
		System.out.println();	
		System.out.println();
		System.out.println();
		
		
	}

}
