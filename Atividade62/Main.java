package Atividade62;

public class Main {
    public static void main(String[] args) {
        LDE l = new LDE();
        l.insereInicio(5);
        l.insereInicio(55);
        l.insereInicio(7);
        l.insereFim(28);


        System.out.println("contem"+l.contem());
        l.printFI();
        System.out.println("|||||||||||||||||||||||||||||||||||");
        l.printIF();

        System.out.println("o ultimo digito é: " + l.getU());
        System.out.println("o primeiro digito é: " + l.getP());
        System.out.println("-----------------------------------------");
        l.remove(55);

        System.out.println("contem"+l.contem());
        l.printFI();
        System.out.println("|||||||||||||||||||||||||||||||||||");
        l.printIF();

    }
}
