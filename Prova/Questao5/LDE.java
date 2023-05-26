package Questao5;

public class LDE implements IList {
    private Nod begin;
    private Nod end;
    
    public LDE (){
        this.begin = null;
        this.end = null;
    }
    
    public void addBegin(int info) {
        Nod newNod = new Nod(info);
        
        if (begin == null){
            begin = newNod;
            end = newNod;
        }
        else {
            newNod.setNext(begin);
            begin.setPrevious(newNod);
            begin = newNod;
        }
    }
    
    public void addEnd(int info) {
        Nod newNod = new Nod(info);
       
        
        if (begin == null){
            begin = newNod;
            end = newNod;
        }
        else {
           newNod.setPrevious(end);
           end.setNext(newNod);
           end = newNod;
        }
    }
    
    public void printFromBegin() {
        Nod aux = begin;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }
    }

    public void printFromEnd() {
        Nod aux = end;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getPrevious();
        }
    }

    public int nroPares() {
        int even = 0;
        Nod aux = begin;
        while (aux != null) {
            if (aux.getInfo() % 2 == 0) {
                even++;
            }
            aux = aux.getNext();
        }
        return even;
    }

}