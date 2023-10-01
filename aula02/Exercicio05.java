package aula02;//Escreva um programa que separa a string em duas metades e imprime a primeira parte.

import aula02.utils.ScanUtils;

//substring() se pode usar para dividir uma String no meio
public class Exercicio05 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        String text = scan.coletaTexto("Digite um texto: ");
        int size = text.length();
        int meio = size / 2;

        String half1 = text.substring(0,meio); //substring() para obter a primeira metade da string (do índice 0 ao índice do meio)
//        String half2 = text.substring(meio); //a segunda metade (do índice do meio até o final da string).

        System.out.println("A primeira metade do texto é: " + half1);
//        System.out.println("A segunda metade do texto é: " + half2);
    }
}
