//Exercício 4: LinkedHashMap
//Crie um programa Java que utilize uma estrutura de dados do tipo LinkedHashMap
// para associar produtos a seus preços.
// Insira algumas entradas no mapa e, em seguida, imprima a lista de produtos na
// ordem em que foram inseridos, exibindo o nome do produto e seu preço.
package aula06.exercicio04;

import aula01.utils.ScanUtils;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercicio04 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();
        LinkedHashMap<Produto,Double> listaProdutos = new LinkedHashMap<>();

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
}
