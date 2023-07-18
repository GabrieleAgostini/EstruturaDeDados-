public class ListaObj {
    private NohObj inicio;

    public NohObj getInicio() {
        return inicio;
    }

    public void add(Veiculo veiculo) {
        NohObj novoNoh = new NohObj(veiculo);
        if (inicio == null) {
            inicio = novoNoh;
        } else {
            NohObj atual = inicio;
            while (atual.getProx() != null) {
                atual = atual.getProx();
            }
            atual.setProx(novoNoh);
        }
    }

    public void remove(int chave) {
        if (inicio == null) {
            return;
        }

        if (inicio.getInfo().getChassi() == chave) {
            inicio = inicio.getProx();
            return;
        }

        NohObj atual = inicio;
        while (atual.getProx() != null) {
            if (atual.getProx().getInfo().getChassi() == chave) {
                atual.setProx(atual.getProx().getProx());
                return;
            }
            atual = atual.getProx();
        }
    }
}