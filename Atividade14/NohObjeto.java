package Mapa_lse;

public class NohObjeto {
    private Aluno info;
    private NohObjeto ant;
    private NohObjeto prox;

    public NohObjeto(Aluno info) {
        this.info = info;
        this.ant = null;
        this.prox = null;
    }

    public void setProx(NohObjeto n) {
        this.prox = n;
    }

    public void setAnt(NohObjeto n) {
        this.ant = n;
    }

    public Aluno getInfo() {
        return this.info;
    }

    public NohObjeto getProx() {
        return this.prox;
    }

    public NohObjeto getAnt() {
        return this.ant;
    }

    public void setInfo(Aluno info) {
        this.info = info;
    }
}