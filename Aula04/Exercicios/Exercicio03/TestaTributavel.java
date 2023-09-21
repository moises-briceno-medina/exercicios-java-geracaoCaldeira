package Aula04.Exercicios.Exercicio03;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        SeguroDeVida seguroDeVida= new SeguroDeVida();

        contaCorrente.deposito(200);
        contaPoupanca.deposito(200);

        System.out.println(seguroDeVida.calculaTributos());
        System.out.println(contaCorrente.calculaTributos());
        System.out.println(contaPoupanca.calculaTributos());

        contaCorrente.obterSaldo();
        contaPoupanca.obterSaldo();

    }
}
