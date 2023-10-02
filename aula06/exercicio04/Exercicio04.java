//Exercício 4: LinkedHashMap
//Crie um programa Java que utilize uma estrutura de dados do tipo LinkedHashMap
// para associar produtos a seus preços.
// Insira algumas entradas no mapa e, em seguida, imprima a lista de produtos na
// ordem em que foram inseridos, exibindo o nome do produto e seu preço.
package aula06.exercicio04;

import aula01.utils.ScanUtils;
import aula06.exercicio03.Contatos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercicio04 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();
        LinkedHashMap<Produto,Double> listaProdutos = new LinkedHashMap<>();

        int opcao = 0;

        while (opcao != 3) {
            opcao = scan.coletaInt("""
                    1 -> Adicionar produto
                    2 -> Vizualizar lista de produtos
                    3 -> Sair
                    Escolha uma opcao:
                    """);

            switch (opcao) {
                case 1:
                    adicionarProduto(listaProdutos, scan);
                    break;
                case 2:
                    if (verificaListaVazia(listaProdutos)) {
                        imprimirListaProduto(listaProdutos);
                    }
                    break;
                case 3:
                    System.out.println("fechando Programa");
                    break;
                default:
                    System.out.println("opção invalida");
            }
        }
    }
    public static void adicionarProduto(LinkedHashMap<Produto,Double> Produtoslist, ScanUtils scan){
        String nome = scan.coletaTexto("Digite o nome do produto");
        double valor = scan.coletaDouble("Digite o valor do produto");

        Produto newProduto = new Produto(nome,valor);
        Produtoslist.put(newProduto,valor);
    }
    public static void imprimirListaProduto(LinkedHashMap<Produto,Double> produtoslist){
        System.out.println("Lista de podutos na orden em que foram inseridos");
        for (Map.Entry<Produto,Double> entry: produtoslist.entrySet()){
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
    }
    public static boolean verificaListaVazia(LinkedHashMap<Produto, Double> produtoslist) {
        if (!produtoslist.isEmpty()) {
            return true;
        } else
            System.out.println("Lista de produtos vazia");
        return false;
    }
}
