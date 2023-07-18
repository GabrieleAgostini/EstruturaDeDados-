
public class MapaABB {
    private ABB arvore;

    public MapaABB() {
        this.arvore = new ABB();
    }

    public void put(int chave, Veiculo veiculo) {
        arvore.add(chave, veiculo);
    }

    public void inserirVeiculos(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            Veiculo veiculo = new Veiculo();
            put(veiculo.getChassi(), veiculo);
        }
    }

    public void exibeOrdenado() {
        arvore.imprime();
    }

    public int ford() {
        return arvore.countFord();
    }

    public void removerVeiculos(int limiteChassi) {
        arvore.remover(limiteChassi);
    }
}