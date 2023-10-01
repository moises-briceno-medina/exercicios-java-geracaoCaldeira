package Aula04.exercicios.exercicio03;

public class ContaPoupanca extends Conta implements Tributavel{

    @Override
    public double calculaTributos() {
        return 0;
    }
}
