
public class Main {
    public static void main(String[] args) {

        AVL arvoreAVL = new AVL();

        arvoreAVL.add(45, arvoreAVL.getRaiz());
        arvoreAVL.add(56, arvoreAVL.getRaiz());
        arvoreAVL.add(89, arvoreAVL.getRaiz());
        arvoreAVL.add(15, arvoreAVL.getRaiz());
        arvoreAVL.add(10, arvoreAVL.getRaiz());
        arvoreAVL.add(33, arvoreAVL.getRaiz());
        arvoreAVL.add(69, arvoreAVL.getRaiz());

        System.out.println("Testando o balanceamento da arvore: ");
        arvoreAVL.isArvoreBalanceada(arvoreAVL.getRaiz());

        if (arvoreAVL.isArvoreBalanceada(arvoreAVL.getRaiz())) {
            System.out.println("A arvore está balanceada!");
        } else {
            System.out.println("A arvore não está balanceada!");
        }

    }

}