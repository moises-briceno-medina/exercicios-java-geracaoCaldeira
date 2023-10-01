package aula01;//Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.

import utils.ScanUtils;

public class Exercicio03 {
    public static void main(String[] args) {

        ScanUtils scan = new ScanUtils();
        double firstNumber = scan.coletaDouble("Digite o primeiro número: ");
        double secondNumber = scan.coletaDouble("Digite o segundo número: ");
        double thirdNumber = scan.coletaDouble("Digite o terceiro número: ");

//        //Primeira solução: usando if
//        //Encontrar o maior número
//        if (firstNumber > secondNumber) {
//            if (firstNumber > thirdNumber) {
//                maxValue = firstNumber;
//            } else {
//                maxValue = thirdNumber;
//            }
//        } else {
//            if (secondNumber > thirdNumber) {
//                maxValue = secondNumber;
//            } else {
//                maxValue = thirdNumber;
//            }
//        }
//
//        //Encontrar o menor número
//        if (firstNumber < secondNumber) {
//            if (firstNumber < thirdNumber) {
//                minValue = firstNumber;
//            } else {
//                minValue = thirdNumber;
//            }
//        } else {
//            if (secondNumber < thirdNumber) {
//                minValue = secondNumber;
//            } else {
//                minValue = thirdNumber;
//            }
//        }
//
//        //Sempre usar parenteses para definir a prioridade nos cálculos
//        arithmeticMean = (firstNumber + secondNumber + thirdNumber) / 3.0;
//
//        System.out.println("[Solução com if] O maior número é: " + maxValue);
//        System.out.println("[Solução com if] O menor número é: " + minValue);
//        System.out.println("[Solução com if] A média aritmética é: " + arithmeticMean);

        double numeroMaior = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
        double numeroMenor = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
        double media = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("O numero maior é: " + numeroMaior);
        System.out.println("o número menor é: " + numeroMenor);
        System.out.println(" A média aritmética é: "+media);
    }
}
