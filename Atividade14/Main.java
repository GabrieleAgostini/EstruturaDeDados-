package Mapa_lse;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(648864, "Angela", 7.5, 25);
        Aluno aluno2 = new Aluno(116541, "Nathalia", 9.5, 23);
        Aluno aluno3 = new Aluno(878494, "Cristian", 8.5, 22);
        Aluno aluno4 = new Aluno(226565, "Osmar", 6.0, 29);
        Aluno aluno5 = new Aluno(684848, "Guilherme", 9.0, 28);
        Aluno aluno6 = new Aluno(991464, "Rick", 7.0, 26);

        MapaHashLSE mapa = new MapaHashLSE();

        mapa.put(648864, aluno1);
        mapa.put(116541, aluno2);
        mapa.put(878494, aluno3);
        mapa.put(226565, aluno4);
        mapa.put(684848, aluno5);
        mapa.put(991464, aluno6);

        mapa.getTudo();

        System.out.println("");

        System.out.println(mapa.getAluno(648864));
        System.out.println(mapa.getAluno(116541));
        System.out.println(mapa.getAluno(878494));
        System.out.println(mapa.getAluno(226565));
        System.out.println(mapa.getAluno(684848));
        mapa.remove(991464);
        System.out.println(mapa.getAluno(991464));
    }
}
