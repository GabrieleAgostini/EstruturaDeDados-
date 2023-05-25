package LDE_Objet;

public class Noh {
    private int info;
    private Noh ant;
    private Noh prox;
    
    public Noh (int info){
    this.info = info;
    this.ant = null;
    this.prox = null;
    }
    public void setProx(Noh n) { this.prox = n; }

    public void setAnt(Noh n) { this.ant = n; }
    public int getInfo() {
        return this.info;
    }
    public Noh getProx() {
        return this.prox;
    }
    public Noh getAnt() {
        return this.ant;
    }
}
