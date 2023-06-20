package Mapa_Vetor;

public class MapaHashLSE {
    private static final int INITIAL_CAPACITY = 100;
    private static final double LOAD_FACTOR = 0.75;

    private ListaObjeto[] vetorLista;
    private int size;

    public MapaHashLSE() {
        this.vetorLista = new ListaObjeto[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void put(int chave, Aluno aluno) {
        if (precisaResize()) {
            resize();
        }

        int hash = hash(chave);
        ListaObjeto alunosLista = this.vetorLista[hash];
        if (alunosLista == null) {
            alunosLista = new ListaObjeto();
            alunosLista.insereInicio(aluno);
            this.vetorLista[hash] = alunosLista;
            size++;
        } else {
            NohObjeto atual = alunosLista.getInicio();
            while (atual != null) {
                if (((Aluno) atual.getInfo()).getMatricula() == chave) {
                    atual.setInfo(aluno);
                    return;
                }
                atual = atual.getProx();
            }
            alunosLista.insereInicio(aluno);
            size++;
        }
    }

    public Aluno getAluno(int chave) {
        int hash = hash(chave);
        ListaObjeto alunosLista = this.vetorLista[hash];
        if (alunosLista != null) {
            NohObjeto atual = alunosLista.getInicio();
            while (atual != null) {
                if (atual.getInfo().getMatricula() == chave) {
                    return atual.getInfo();
                }
                atual = atual.getProx();
            }
        }
        return null; // Retorna null se a chave não for encontrada
    }

    public ListaObjeto remove(int chave) {
        int hash = hash(chave);
        ListaObjeto alunosLista = this.vetorLista[hash];
        this.vetorLista[hash] = null;
        size--;
        return alunosLista;
    }

    private int hash(int chave) {
        return chave % vetorLista.length;
    }

    private boolean precisaResize() {
        double loadFactor = (double) size / vetorLista.length;
        return loadFactor >= LOAD_FACTOR;
    }

    private void resize() {
        int novaCapacidade = vetorLista.length * 2;
        ListaObjeto[] novoVetorLista = new ListaObjeto[novaCapacidade];
        int tamanhoAnterior = size;

        for (ListaObjeto lista : vetorLista) {
            if (lista != null) {
                NohObjeto atual = lista.getInicio();
                while (atual != null) {
                    int hash = hash(novaCapacidade);
                    ListaObjeto listaAlunos = novoVetorLista[hash];
                    if (listaAlunos == null) {
                        listaAlunos = new ListaObjeto();
                        novoVetorLista[hash] = listaAlunos;
                    }
                    listaAlunos.insereInicio(atual.getInfo());
                    size++;
                    atual = atual.getProx();
                }
            }
        }

        vetorLista = novoVetorLista;

        if (precisaRehash()) {
            rehash();
        }

        size = tamanhoAnterior;
    }

    private boolean precisaRehash() {
        double fatorCarga = (double) size / vetorLista.length;
        return fatorCarga <= 0.25;
    }

    private void rehash() {
        int novaCapacidade = vetorLista.length / 2;
        ListaObjeto[] novoVetorLista = new ListaObjeto[novaCapacidade];

        for (ListaObjeto lista : vetorLista) {
            if (lista != null) {
                NohObjeto atual = lista.getInicio();
                while (atual != null) {
                    int hash = hash(novaCapacidade);
                    ListaObjeto listaAlunos = novoVetorLista[hash];
                    if (listaAlunos == null) {
                        listaAlunos = new ListaObjeto();
                        novoVetorLista[hash] = listaAlunos;
                    }
                    listaAlunos.insereInicio(atual.getInfo());
                    atual = atual.getProx();
                }
            }
        }

        vetorLista = novoVetorLista;
    }
}
