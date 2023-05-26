package Questao6;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList lst = new DoublyLinkedList();

        lst.addOrdenado(2);
        lst.addOrdenado(5);
        lst.addOrdenado(7);
        lst.addOrdenado(10);

        Node current = lst.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
