public class ABB {
    private Noh raiz;

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void add(int chave, Veiculo veiculo) {
        if (isEmpty()) {
            this.raiz = new Noh(chave, veiculo);
        } else {
            addRecursive(raiz, chave, veiculo);
        }
    }

    private void addRecursive(Noh node, int chave, Veiculo veiculo) {
        if (chave < node.chave) {
            if (node.esq == null) {
                Noh newNode = new Noh(chave, veiculo);
                node.esq = newNode;
                newNode.pai = node;
            } else {
                addRecursive(node.esq, chave, veiculo);
            }
        } else {
            if (node.dir == null) {
                Noh newNode = new Noh(chave, veiculo);
                node.dir = newNode;
                newNode.pai = node;
            } else {
                addRecursive(node.dir, chave, veiculo);
            }
        }
    }

    public void imprime() {
        imprimeInOrdem(raiz);
    }

    private void imprimeInOrdem(Noh node) {
        if (node != null) {
            imprimeInOrdem(node.esq);
            System.out.println(node.veiculo.toString());
            imprimeInOrdem(node.dir);
        }
    }

    public int countFord() {
        return countFordRecursive(raiz);
    }

    private int countFordRecursive(Noh node) {
        if (node == null) {
            return 0;
        }

        int count = node.veiculo.isMarcaFord() ? 1 : 0;
        count += countFordRecursive(node.esq);
        count += countFordRecursive(node.dir);
        return count;
    }

    public void remover(int limiteChassi) {
        raiz = removerRecursivo(raiz, limiteChassi);
    }

    private Noh removerRecursivo(Noh node, int limiteChassi) {
        if (node == null) {
            return null;
        }

        if (node.chave <= limiteChassi) {
            node = removerRecursivo(node.dir, limiteChassi);
        } else {
            node.esq = removerRecursivo(node.esq, limiteChassi);
        }

        return node;
    }

}