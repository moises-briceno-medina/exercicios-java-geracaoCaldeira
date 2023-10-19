package org.example;

import java.util.*;

//Crie um projeto Java usando o Gradle que processe uma lista de objetos do tipo
// "Produto" com os seguintes atributos: nome (String), preço (double) e quantidade
// (int). Utilizando Streams, implemente as seguintes operações:
// a) Encontre o produto mais caro na lista.
// b) Calcule o preço total de todos os produtos na lista.
// c) Filtre os produtos com quantidade superior a 10 e crie uma nova lista com eles.
public class Main {
    public static void main(String[] args) {
        List<Produto> produtoList = Arrays.asList(
                new Produto("telefone", 2000, 1),
                new Produto("cama", 3000, 11),
                new Produto("geladeira", 5000, 1)
        );

        //o produto mais caro na lista
        Optional<Produto> precoMaior = produtoList.stream().max(Comparator.comparingDouble(Produto::getValor));
        Produto produto = precoMaior.get();
        System.out.println("Produto mais caro: "+ "Produto: "+produto.getNome() + ", Preco: " + produto.getValor());


        //preço total de todos os produtos na lista
        double totalValorProdutos = produtoList.stream().mapToDouble(Produto::getValor).sum();
        System.out.printf("Preco total de todos os produtos é %.2f",totalValorProdutos);

        //Filtre os produtos com quantidade superior a 10 e crie uma nova lista com eles.

        List<Produto> produtosPelaQuantidade = produtoList.stream()
                .filter(p -> p.getQuantidade() > 10)
                .toList();

        System.out.println("\nProdutos com quantidade maior que 10");
        if (produtosPelaQuantidade.isEmpty()){
            System.out.println("Nao tem produtos com quantidade maior que 10 ");
        }else
            produtosPelaQuantidade.forEach(p -> System.out.println("Produto: " + p.getNome() + ", Quantidade: " + p.getQuantidade()));
    }
}