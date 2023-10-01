package aula06;

import aula05.exercicios06.Reserva;
import aula06.utils.ScanUtils;

import java.util.Stack;

public class Testelivro {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();
        ScanUtils scan = new ScanUtils();

        Livro livro01 = new Livro("Os segredos da mente milionária", "auto ajuda");
        Livro livro02 = new Livro("Aprenda c++", " Estudo");
        Livro livro03 = new Livro("ULtimo amor", " Romance");
        Livro livro04 = new Livro("Aprenda inglês intermediaro", " estudo");
        Livro livro05 = new Livro("Amar até a morte", " Romance");
        Livro livro06 = new Livro("turismo", " viagens");
        Livro livro07 = new Livro("A galinha pintadinha", "Infantil");
        Livro livro08 = new Livro("Cocomelom", "Infantil");

        //Adicionando novos elementos ao fim da lista
        pilha.push(livro01);
        pilha.push(livro02);
        pilha.push(livro03);
        pilha.push(livro04);
        pilha.push(livro05);
        pilha.push(livro06);
        pilha.push(livro07);
        pilha.push(livro08);

//        imprimePilhaLivros(pilha);
        imprimePilhaLivrosCategoria(pilha, scan);
    }

    public static void imprimePilhaLivros(Stack<Livro> pilha) {
        System.out.println("Pilha de livros");
        for (Livro livros : pilha) {
            System.out.println(livros);
        }
    }

    public static void imprimePilhaLivrosCategoria(Stack<Livro> pilha, ScanUtils scan) {
        String scanCategoria = scan.coletaTexto("Digite a categoria do livro").toLowerCase();

        System.out.println("Pilha de livros segundo a categoria");
        for (Livro livros : pilha) {
            if (livros.getCategoria().toLowerCase().replaceAll("\\s", "").equals(scanCategoria.replaceAll("\\s", ""))) {
                System.out.println(livros);
            }
        }
//        //Por exemplo, "\\s" é usado para corresponder a espaços em branco,
//        e o uso de duas barras invertidas é necessário porque
//        a barra invertida é um caractere de escape em strings Java
    }
}
