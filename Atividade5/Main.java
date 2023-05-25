package Atividade5;

public class Main {
    public static void main(String[] args) {
        ILSE l = new LSE();
        l.insereInicio(12);
        l.insereInicio(68);
        l.insereFim(55);

        System.out.println(l.print());
    }
}
