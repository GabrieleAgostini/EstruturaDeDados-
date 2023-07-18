import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MapaHashLDE {
    private static final int INITIAL_CAPACITY = 5;
    private static final double LOAD_FACTOR = 0.75;

    private ListaObj[] vetorLista;
    private int size;

    public MapaHashLDE() {
        this.vetorLista = new ListaObj[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void put(int chave, Veiculo veiculo) {
        if (precisaResize()) {
            resize();
        }

        int hash = hash(chave);
        ListaObj veiculosLista = this.vetorLista[hash];
        if (veiculosLista == null) {
            veiculosLista = new ListaObj();
            this.vetorLista[hash] = veiculosLista;
        }

        veiculosLista.add(veiculo);
        size++;
    }

    public ListaObj[] getVetorLista() {
        return vetorLista;
    }

    private boolean precisaResize() {
        double loadFactor = (double) size / vetorLista.length;
        return loadFactor >= LOAD_FACTOR;
    }

    private void resize() {
        int newCapacity = vetorLista.length * 2;
        ListaObj[] newVetorLista = new ListaObj[newCapacity];

        for (ListaObj lista : vetorLista) {
            if (lista != null) {
                NohObj atual = lista.getInicio();
                while (atual != null) {
                    int hash = hash(atual.getInfo().getChassi(), newCapacity);
                    ListaObj novaLista = newVetorLista[hash];
                    if (novaLista == null) {
                        novaLista = new ListaObj();
                        newVetorLista[hash] = novaLista;
                    }
                    novaLista.add(atual.getInfo());
                    atual = atual.getProx();
                }
            }
        }

        vetorLista = newVetorLista;
    }

    private int hash(int chave) {
        return chave % vetorLista.length;
    }

    private int hash(int chave, int length) {
        return chave % length;
    }

    public void add(MapaHashLDE mapaVeiculos, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            Veiculo veiculo = new Veiculo();
            mapaVeiculos.put(veiculo.getChassi(), veiculo);
        }
    }

    public void exibeOrdenado(MapaHashLDE mapaVeiculos) {
        List<Veiculo> veiculos = new ArrayList<>();

        for (ListaObj lista : mapaVeiculos.getVetorLista()) {
            if (lista != null) {
                NohObj atual = lista.getInicio();
                while (atual != null) {
                    veiculos.add(atual.getInfo());
                    atual = atual.getProx();
                }
            }
        }

        Collections.sort(veiculos);

        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.toString());
        }
    }

    public int ford(MapaHashLDE mapaVeiculos) {
        int count = 0;

        for (ListaObj lista : mapaVeiculos.getVetorLista()) {
            if (lista != null) {
                NohObj atual = lista.getInicio();
                while (atual != null) {
                    if (atual.getInfo().isMarcaFord()) {
                        count++;
                    }
                    atual = atual.getProx();
                }
            }
        }

        return count;
    }

    public void removerVeiculos(MapaHashLDE mapaVeiculos, int limiteChassi) {
        for (ListaObj lista : mapaVeiculos.getVetorLista()) {
            if (lista != null) {
                NohObj atual = lista.getInicio();
                while (atual != null) {
                    if (atual.getInfo().getChassi() <= limiteChassi) {
                        lista.remove(atual.getInfo().getChassi());
                    }
                    atual = atual.getProx();
                }
            }
        }
    }
}