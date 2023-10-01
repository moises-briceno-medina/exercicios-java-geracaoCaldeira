package aula01;



//Crie um programa que leia seu nome e imprima na tela.

import aula01.utils.ScanUtils;

public class Exercicio01 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        String nome = scan.coletaTexto("Por favor, digite seu nome: ");

        System.out.println("Seu nome é " + nome);
    }
}
