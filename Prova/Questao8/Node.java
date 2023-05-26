package Questao8;

public class Node {
    private int info;
    private Node next;
    private Node previous;

    public Node(int info) {
        this.info = info;
        this.next = null;
        this.previous = null;
    }

    public int getInfo() {
        return this.info;
    }

    public Node getNext() {
        return this.next;
    }

    public Node getPrevious() {
        return this.previous;
    }

    public Node setNext(Node n) {
        this.next = n;
        return this;
    }

    public Node setPrevious(Node n) {
        this.previous = n;
        return this;
    }
}

