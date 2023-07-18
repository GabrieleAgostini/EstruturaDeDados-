
public class App {

        public static void main(String[] args) {

                MapaHashLDE mapaVeiculos = new MapaHashLDE();

                // os comentario se referem a linha de baixo
                // a nao ser que seja os comentarios ao lado
                // esses se referem a mesma linha que estao presentes

                // medi o tempo deexecução do metod q adiciona cem mil veiculos
                long inicioLDE = System.nanoTime();
                // inserir 100.000 veículos
                mapaVeiculos.add(mapaVeiculos, 10000);
                long fimLDEadd = System.nanoTime();
                long xLDEadd = fimLDEadd - inicioLDE; // faz a conta

                // medi o tempo de execução do metodo q exibe os veiculos
                long inicioLDEexibir = System.nanoTime();
                // Apresentar todos os veículos em ordem crescente de número de chassi
                mapaVeiculos.exibeOrdenado(mapaVeiculos);
                long fimLDEexibir = System.nanoTime();
                long xExibir = fimLDEexibir - inicioLDEexibir; // faz a conta

                // medi o tempo de execução do emtod para buscar e exebir quantos veiculos sap
                // da marca ford
                long inicioLDEFord = System.nanoTime();
                // Verificar quantos veículos são da marca Ford
                int quantidadeFord = mapaVeiculos.ford(mapaVeiculos);
                System.out.println("Exixtem " + quantidadeFord + " veiculos da ford");
                long fimLDEFord = System.nanoTime();
                long xLDEFord = fimLDEFord - inicioLDEFord; // faz a conta

                // med o tempo de execução para remover todos os veiculos
                long inicioLDERemove = System.nanoTime();
                // Remover todos os veículos com número de chassi igual ou inferior a 202050000
                mapaVeiculos.removerVeiculos(mapaVeiculos, 202050000);
                long fimLDERemove = System.nanoTime();
                long xRemove = fimLDERemove - inicioLDERemove; // faz a conta

                // Apresentar todos os veículos em ordem crescente de número de chassi
                // mapaVeiculos.exibeOrdenado(mapaVeiculos);

                /////////////////////////////////////////////////////////////////////////////////////////////////
                // mapa usandoa arvore

                MapaABB mapaABB = new MapaABB();
                long inicioArvoreAdd = System.nanoTime();
                mapaABB.inserirVeiculos(10000);
                long fimArvoreAdd = System.nanoTime();
                long ArvoreAdd = fimArvoreAdd - inicioArvoreAdd; // faz a conta

                long inicioArvoreExibe = System.nanoTime();
                mapaABB.exibeOrdenado();
                long fimArvoreExibe = System.nanoTime();
                long XArvoreExibe = fimArvoreExibe - inicioArvoreExibe;

                long inicioArvoreFord = System.nanoTime();
                int quantidadedaFordArvore = mapaABB.ford();
                System.out.println("Exixtem " + quantidadedaFordArvore + " veiculos da ford");
                long fimArvoreFord = System.nanoTime();
                long XArvoreFord = fimArvoreFord - inicioArvoreFord;

                long inicioArvoreRemove = System.nanoTime();
                mapaABB.removerVeiculos(202050000);
                long fimArvoreRemove = System.nanoTime();
                long XArvoreRemove = fimArvoreRemove - inicioArvoreRemove;

                // mapaABB.exibeOrdenado();

                /////////////////////////////////////////////////////////////////////////////////////////////////
                // mapa usandoa vetor

                MapaVet mapaVet = new MapaVet();

                long inicioVetAdd = System.nanoTime();
                // Criando e adicionando 10000 veículos no mapa
                for (int i = 0; i < 10000; i++) {
                        Veiculo veiculo = new Veiculo();
                        mapaVet.put(veiculo);
                }
                long fimVetAdd = System.nanoTime();
                long xVetAdd = fimVetAdd - inicioVetAdd;

                long inicioVetExibe = System.nanoTime();
                mapaVet.imprime();
                long fimVetExibe = System.nanoTime();
                long xVetExibe = fimVetExibe - inicioVetExibe;

                long inicioVetFord = System.nanoTime();
                int contfordford = mapaVet.ford();
                System.out.println("Exixtem " + contfordford + " veiculos da ford");
                long fimVetFord = System.nanoTime();
                long xVetFord = fimVetFord - inicioVetFord;

                long inicioVetRemove = System.nanoTime();
                mapaVet.removerVeiculos(202050000);
                long fimVetRemove = System.nanoTime();
                long xVetRemove = fimVetRemove - inicioVetRemove;

                // mostar o rempo de execução
                // tempo de execução utilizando LDE
                System.out.println("utlizando LDE");
                System.out.println(
                                "O tempo de execução do metodo para adicionar os cem mil veiculos foi de " + xLDEadd
                                                + " nanosegundos");
                System.out.println("O tempo de execução do metodo para exibir os veiculos foi de " + xExibir
                                + " nanosegundos");
                System.out.println(
                                "O tempo de execução do metodo para calcular quantos veiculos da ford existee exibir o resultado foi de "
                                                + xLDEFord + " nanosegundos");
                System.out.println(
                                "O tempo de execução do metodo para remover os todos os veiculos com o numero inferior a 202050000 é de "
                                                + xRemove + " nanosegundos");

                System.out.println("--------------------------------------------------------------------");
                // tempo de execução utilizando arvore binaria
                System.out.println("utlizando Arvore");
                System.out.println(
                                "O tempo de execução do metodo para adicionar os cem mil veiculos foi de " + ArvoreAdd
                                                + " nanosegundos");
                System.out.println("O tempo de execução do metodo para exibir os veiculos foi de " + XArvoreExibe
                                + " nanosegundos");
                System.out.println(
                                "O tempo de execução do metodo para calcular quantos veiculos da ford existee exibir o resultado foi de "
                                                + XArvoreFord + " nanosegundos");
                System.out.println(
                                "O tempo de execução do metodo para remover os todos os veiculos com o numero inferior a 202050000 é de "
                                                + XArvoreRemove + " nanosegundos");

                System.out.println("--------------------------------------------------------------------");
                // tempo de execução utilizando vetor
                System.out.println("utlizando vetor");
                System.out.println(
                                "O tempo de execução do metodo para adicionar os cem mil veiculos foi de " + xVetAdd
                                                + " nanosegundos");
                System.out.println("O tempo de execução do metodo para exibir os veiculos foi de " + xVetExibe
                                + " nanosegundos");
                System.out.println(
                                "O tempo de execução do metodo para calcular quantos veiculos da ford existee exibir o resultado foi de "
                                                + xVetFord + " nanosegundos");
                System.out.println(
                                "O tempo de execução do metodo para remover os todos os veiculos com o numero inferior a 202050000 é de "
                                                + xVetRemove + " nanosegundos");
        }

}