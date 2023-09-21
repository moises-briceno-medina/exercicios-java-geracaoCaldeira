package Aula04.Exercicios.Exercicio03;

public class ContaPoupanca extends Conta implements Tributavel{

    @Override
    public double calculaTributos() {
        return 0;
    }
}
