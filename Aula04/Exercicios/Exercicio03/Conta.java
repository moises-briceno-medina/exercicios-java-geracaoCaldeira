package Aula04.Exercicios.Exercicio03;

public class Conta {
    private double saldo;

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }else System.out.println("Saldo insuficiente.");
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public void obterSaldo(){
        System.out.println("Saldo atual R$: "+ this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
