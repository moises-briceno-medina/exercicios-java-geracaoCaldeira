package aula01;


//Crie um programa que receba 2 números e imprima na tela.

import aula02.utils.ScanUtils;

public class Exercicio02 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        double primeiroNumero = scan.coletaDouble("Digite o primeiro número: ");

        double segundoNumero = scan.coletaDouble("Digite o segundo número: ");

        System.out.println("Você digitou os números " + primeiroNumero + " e " + segundoNumero);
    }
}
