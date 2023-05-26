package Questao8;

public class Main {
    public static void main(String[] args) {
        LDEConcatenator lde1 = new LDEConcatenator();
        lde1.addEnd(1);
        lde1.addEnd(2);
        lde1.addEnd(3);
        lde1.addEnd(4);
        
        LDEConcatenator lde2 = new LDEConcatenator();
        lde2.addEnd(5);
        lde2.addEnd(6);
        lde2.addEnd(7);
        lde2.addEnd(8);
        
        System.out.println("Lista 1:");
        lde1.printList();
        
        System.out.println("Lista 2:");
        lde2.printList();
        
        lde1.concat(lde2);
        
        System.out.println("Lista Concatenada:");
        lde1.printList();
    }
}
