package aula07.Exercicio06;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 100;
    }

    public double getSaldo() {
        return saldo;
    }
    public void sacar (double valor) throws SaldoInsuficienteException {
        if (this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque feito com sucesso");
        }else {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
    }
}
