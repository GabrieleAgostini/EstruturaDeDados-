package Questao8;

public class LDEConcatenator {
    private Node begin;
    private Node end;

    public LDEConcatenator() {
        this.begin = null;
        this.end = null;
    }

    public void addBegin(int info) {
        Node newNode = new Node(info);

        if (begin == null) {
            begin = newNode;
            end = newNode;
        } else {
            newNode.setNext(begin);
            begin.setPrevious(newNode);
            begin = newNode;
        }
    }

    public void addEnd(int info) {
        Node newNode = new Node(info);

        if (begin == null) {
            begin = newNode;
            end = newNode;
        } else {
            newNode.setPrevious(end);
            end.setNext(newNode);
            end = newNode;
        }
    }

    public void printFromBegin() {
        Node aux = begin;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }
    }

    public void printFromEnd() {
        Node aux = end;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getPrevious();
        }
    }

    public int nroPares() {
        int even = 0;
        Node aux = begin;
        while (aux != null) {
            if (aux.getInfo() % 2 == 0) {
                even++;
            }
            aux = aux.getNext();
        }
        return even;
    }

    public void add_ordenado(int info) {
        Node newNode = new Node(info);

        if (begin == null) {
            begin = newNode;
            end = newNode;
        } else if (info < begin.getInfo()) {
            newNode.setNext(begin);
            begin.setPrevious(newNode);
            begin = newNode;
        } else if (info > end.getInfo()) {
            newNode.setPrevious(end);
            end.setNext(newNode);
            end = newNode;
        } else {
            Node current = begin;

            while (current != null && current.getInfo() < info) {
                current = current.getNext();
            }

            newNode.setNext(current);
            newNode.setPrevious(current.getPrevious());
            current.getPrevious().setNext(newNode);
            current.setPrevious(newNode);
        }
    }

    public void concat(LDEConcatenator l) {
        if (l == null || l.begin == null) {
            return;
        }

        if (begin == null) {
            begin = l.begin;
            end = l.end;
        } else {
            end.setNext(l.begin);
            l.begin.setPrevious(end);
            end = l.end;
        }
    }

    public void printList() {
    }
}

