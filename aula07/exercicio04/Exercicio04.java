//Exercício 4: Interface, Enum e Tratamento de Erros
//Expanda o exercício 3 adicionando uma interface chamada Calculavel com métodos para adicionar
// subtrair, multiplicar e dividir números inteiros. Em seguida, crie uma classe que implemente
// a interface Calculavel e use um enum para selecionar a operação desejada.
// Trate exceções adequadamente para situações como divisão por zero ou operação inválida.
package aula07.exercicio04;

import utils.ScanUtils;

public class Exercicio04 implements Calculavel{
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

    @Override
    public void somar(int numero1, int numero2) {

    }

    @Override
    public void subtrair(int numero1, int numero2) {

    }

    @Override
    public void multiplicar(int numero1, int numero2) {

    }

    @Override
    public void dividir(int numero1, int numero2) {

    }
}
