package Questao5;

public class Nod {
    private int info;
    private Nod next;
    private Nod previous;
    
    public Nod (int info){
        this.info = info;
        this.next = null;
        this.previous = null;
    }
    
    public int getInfo() {
        return this.info;
    }
    
    public Nod getNext() {
        return this.next;
    }

    public Nod getPrevious(){
        return this.previous;
    }

    public Nod getLast(){
        Nod aux = this;
        while (aux.getNext() != null) {
            aux = aux.getNext();
        }
        return aux;
    }

    public Nod setNext(Nod n) { return this.next = n; }

    public Nod setPrevious(Nod n) { return this.previous = n; }
}