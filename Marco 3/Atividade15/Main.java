
public class Main {
    public static void main(String[] args) {

        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        arvore.add(0);
        arvore.add(10);
        arvore.add(20);
        arvore.add(30);
        arvore.add(40);
        arvore.add(9);
        arvore.add(50);
        arvore.add(70);
        arvore.add(100);
        arvore.add(60);
        arvore.add(5);
        arvore.add(80);
        arvore.add(90);

        arvore.buscar(arvore.getRaiz(), 60);
        arvore.buscar(arvore.getRaiz(), 30);

        System.out.println("Imprimindo a arvore: ");
        arvore.printEmOrdem(arvore.getRaiz());

        System.out.println("A raiz da arvore é: " + arvore.getRaiz().getValor());

        System.out.println("Removendo o elemento 30 da arvore: ");
        arvore.removeNoh(30);

        arvore.printEmOrdem(arvore.getRaiz());
    }

}