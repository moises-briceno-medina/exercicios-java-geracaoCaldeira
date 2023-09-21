package Aula04.Exercicios.Exercicio03;

public class ContaCorrente extends Conta implements Tributavel {


    @Override
    public double calculaTributos() {
        return getSaldo() * 0.01;
    }
}
