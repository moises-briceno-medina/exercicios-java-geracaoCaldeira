//Exercício 1: Interface
//Crie uma interface chamada Desenhavel com um método desenhar().
// Em seguida, crie duas classes, Circulo e Quadrado, que implementam essa interface
// e tenham implementações diferentes para o método desenhar().
//---> O método desenhar pode só criar um print na dela dizendo "vou desenhar o
// 'nomedafigura'.
package aula07.exercicio01;

public class TesteDesenhavel {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();

        circulo.desenhar();
        quadrado.desenhar();
    }
}
