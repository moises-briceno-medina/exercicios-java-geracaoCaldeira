//Exercício 1: Stack com livros
//Crie um programa Java que utilize uma estrutura de dados do tipo Stack
// para armazenar objetos da classe Livros. Implemente a classe Livro,
// com titulo e categoria, inicialize a pilha com alguns livros,
// imprimir os elementos da pilha, imprimir com base na categoria
// e implemente um loop para remover até que ela esteja vazia.
package aula06.exercicio01;

import aula06.exercicio01.utils.ScanUtils;

import java.util.HashSet;
import java.util.Objects;
import java.util.Stack;

public class Testelivro {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();
        HashSet<String> categorias = new HashSet<>();
        ScanUtils scan = new ScanUtils();

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("""
                    1 -> Adicionar Livro
                    2 -> Remover todos os livros da lista
                    3 -> Visualizar todos os livros da lista
                    4 -> Visualizar livros por categoria
                    5 -> Sair
                    Escolha uma opcao:
                    """);
            opcao = scan.coletaInt("");

            switch (opcao) {
                case 1:
                    adicionarLivro(pilha, scan);
                    break;
                case 2:
                    if (verifarListaVazia(pilha)) {
                        removerLivros(pilha);
                    }
                    break;
                case 3:
                    if (verifarListaVazia(pilha)) {
                        imprimirLivros(pilha);
                    }
                    break;
                case 4:
                    if (verifarListaVazia(pilha)) {
                        imprimirLivrosPorCategorias(pilha, categorias);
                    }
                    break;
                case 5:
                    System.out.println("Fechando programa.");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }

    public static void adicionarLivro(Stack<Livro> livros, ScanUtils scan) {
        String titulo = scan.coletaTexto("Digite o titulo do livro");
        String categoria = scan.coletaTexto("Digite a categoria do livro");

        Livro newlivro = new Livro(titulo, categoria);
        livros.push(newlivro);
    }

    public static void imprimirLivros(Stack<Livro> pilha) {
        System.out.println("Pilha de livros");
        for (Livro livros : pilha) {
            System.out.println(livros);
        }
    }

    public static void imprimirLivrosPorCategorias(Stack<Livro> pilhaLivros, HashSet<String> categorias) {
        pegarCategorias(pilhaLivros, categorias);
        if (verifarListaVazia(pilhaLivros)) {
            for (String categoriaAtual : categorias) {
                System.out.println("Livros da categoria: " + categoriaAtual);
                for (Livro livro : pilhaLivros) {
                    if (Objects.equals(livro.getCategoria(), categoriaAtual)) { // equal na class
                        System.out.println(livro.getTitulo());
                    }
                }
            }
        }

    }

    public static void removerLivros(Stack<Livro> pilha) {
        System.out.println("Removendo Todos os livros");
        pilha.removeAllElements();
    }

    public static boolean verifarListaVazia(Stack<Livro> pilhaLivros) {
        if (!pilhaLivros.isEmpty()) {
            return true;
        } else
            System.out.println("Lista vazia");
        return false;
    }

    private static void pegarCategorias(Stack<Livro> stackLivros, HashSet<String> categorias) {
        for (Livro livro : stackLivros) {
            categorias.add(livro.getCategoria());
        }
    }
}
