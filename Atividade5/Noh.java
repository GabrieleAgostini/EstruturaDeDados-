package Atividade5;

public class Noh {
    private Object info;
    private Noh next;
    
    public Noh (Object info){
    this.info = info;
    this.next = null;
    }
    
    public Object getInfo() {
        return this.info;
    }
    
    public Noh getNext() {
        return this.next;
    }
    
    public Noh setProximo(Noh n) { return this.next = n; }

}