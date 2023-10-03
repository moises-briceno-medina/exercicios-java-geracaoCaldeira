//Exercício 4: Interface, Enum e Tratamento de Erros
//Expanda o exercício 3 adicionando uma interface chamada Calculavel com métodos para adicionar
// subtrair, multiplicar e dividir números inteiros. Em seguida, crie uma classe que implemente
// a interface Calculavel e use um enum para selecionar a operação desejada.
// Trate exceções adequadamente para situações como divisão por zero ou operação inválida.
package aula07.exercicio04;

public class Calculadora implements Calculavel {

    @Override
    public void adicionar (int numero1, int numero2) {
        System.out.println("A soma dos números " + numero1 + " e " + numero2 + " é: " +(numero1+numero2));
    }

    @Override
    public  void subtrair(int numero1, int numero2) {
        System.out.println("A subtração dos números " + numero1 + " e " + numero2 + " é: " +(numero1-numero2));

    }

    @Override
    public void multiplicar(int numero1, int numero2) {
        System.out.println("A multiplicação dos números " + numero1 + " e " + numero2 + " é: " +(numero1*numero2));

    }

    @Override
    public void dividir(int numero1, int numero2) {
        System.out.println("A divisão dos números " + numero1 + " e " + numero2 + " é: " +(numero1/numero2));
    }
}
