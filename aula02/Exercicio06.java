package aula02;

import utils.ScanUtils;

//Escreva um programa que receba uma string do usuário e imprima ela ao contrário
public class Exercicio06 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        String text = scan.coletaTexto("Digite um texto: ");

        String textBackwards;
        textBackwards = reverse(text);

        System.out.println("O Texto "+ text +" ao contrario é: " + textBackwards );
    }
    public static String reverse(String texto){
        return new StringBuilder(texto).reverse().toString();
    }
}
