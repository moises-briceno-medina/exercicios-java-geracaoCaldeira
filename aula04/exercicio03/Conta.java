package aula04.exercicio03;

public class Conta {
    private double saldo;

    public Conta() {
        this.saldo = 0;
    }

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
