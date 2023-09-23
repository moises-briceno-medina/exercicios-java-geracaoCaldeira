package Aula04.Exercicios.Exercicio03;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        SeguroDeVida seguroDeVida = new SeguroDeVida();
        GerenciadorDeImpostoDeRenda gerenciadorImposto =new GerenciadorDeImpostoDeRenda();

        contaCorrente.deposito(200);
        contaPoupanca.deposito(200);

        System.out.println("Seus tributos: " + seguroDeVida.calculaTributos());
        System.out.println("Seus tributos: " + contaCorrente.calculaTributos());
        System.out.println("Seus tributos: " + contaPoupanca.calculaTributos());

        contaCorrente.obterSaldo();
        contaPoupanca.obterSaldo();

        gerenciadorImposto.adicionarTributavel(contaCorrente);
        gerenciadorImposto.adicionarTributavel(contaPoupanca);
        gerenciadorImposto.adicionarTributavel(seguroDeVida);
    }
}
