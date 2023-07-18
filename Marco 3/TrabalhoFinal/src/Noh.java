public class Noh {
    int chave;
    Veiculo veiculo;
    Noh esq;
    Noh dir;
    Noh pai;

    public Noh(int chave, Veiculo veiculo) {
        this.chave = chave;
        this.veiculo = veiculo;
        this.esq = null;
        this.dir = null;
        this.pai = null;
    }
}