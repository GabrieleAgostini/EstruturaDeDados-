class NohObj {
    private Veiculo info;
    private NohObj prox;

    public NohObj(Veiculo info) {
        this.info = info;
        this.prox = null;
    }

    public Veiculo getInfo() {
        return info;
    }

    public NohObj getProx() {
        return prox;
    }

    public void setProx(NohObj prox) {
        this.prox = prox;
    }
}