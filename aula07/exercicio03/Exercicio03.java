//Exercício 3: Tratamento de Erros
//Crie um programa que solicite ao usuário que insira dois números inteiros.
// Utilize tratamento de exceções para lidar com a possibilidade de entrada inválida
// (por exemplo,
// uma entrada que não seja um número inteiro) e exiba uma mensagem de erro apropriada.
package aula07.exercicio03;

import utils.ScanUtils;

public class Exercicio03 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        System.out.println("Digite dois números inteiros:");

        try {
            int numero1 = scan.coletaInt("Digite o primeiro número inteiro:");
            int numero2 = scan.coletaInt("Digite o segundo número inteiro:");
            }catch (java.util.InputMismatchException e){ //Exception e : Tratamento para outras exceções
            System.out.println("Você não digitou um número inteiro válido.");
        }
    }

}
