import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapaVet {
    private Map<Integer, Veiculo> mapa;

    public MapaVet() {
        this.mapa = new HashMap<>();
    }

    // adiciona os veiculos
    public void put(Veiculo veiculo) {
        mapa.put(veiculo.getChassi(), veiculo);
    }

    // remove
    public void remove(int key) {
        mapa.remove(key);
    }

    public Veiculo get(int key) {
        return mapa.get(key);
    }

    public boolean isEmpty() {
        return mapa.isEmpty();
    }

    // mostra
    public void imprime() {
        for (Veiculo veiculo : mapa.values()) {
            System.out.println(veiculo);
        }
    }

    // ve quantos sao da frod
    public int ford() {
        int count = 0;
        for (Veiculo veiculo : mapa.values()) {
            if (veiculo.isMarcaFord()) {
                count++;
            }
        }
        return count;
    }

    // remove os veiculos com o numero inferior a um numero q nao vem ao caso
    public void removerVeiculos(int limiteChassi) {
        Set<Integer> chaves = new HashSet<>(mapa.keySet());
        for (int chave : chaves) {
            if (chave <= limiteChassi) {
                mapa.remove(chave);
            }
        }
    }

}
