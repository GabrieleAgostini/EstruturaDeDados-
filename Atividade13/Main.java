package Mapa_Vetor;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(6561616, "Gabriele", 9.9, 85);
        Aluno aluno2 = new Aluno(6546466, "Guilherme", 8.5, 80);
        Aluno aluno3 = new Aluno(4654555, "Pedro", 9.5, 80);
        Aluno aluno4 = new Aluno(5626551, "Pietra", 7.5, 90);

        MapaHashLSE mapa = new MapaHashLSE();

        mapa.put(6561616, aluno1);
        mapa.put(6546466, aluno2);
        mapa.put(4654555, aluno3);
        mapa.put(5626551, aluno4);

        System.out.println(mapa.getAluno(6561616));
        System.out.println(mapa.getAluno(6546466));
        System.out.println(mapa.getAluno(4654555));
        mapa.remove(5626551);
        System.out.println(mapa.getAluno(5626551));
    }
}
