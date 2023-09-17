package Aula03.Exercicios.Exercicio01;

import Aula03.Exercicios.Exercicio01.Conta;

public class TestConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Moises briceno", "708948844-50", 2021, "Banrisul","Av protasio alves" );
        Conta conta2 = new Conta("Neymar", "102345767-80",2022,"Nubank", "Bom Jesus");

        conta2.setHorarioAtual(12);
        conta1.setHorarioAtual(12);

        conta1.deposito(200);
//        conta1.saque(50);
//        conta1.transferencia(conta2, 40);
//        conta1.pix(18,conta2,12);

        conta1.calculaJuros(2);
        conta1.verificarSaldo();

        conta2.verificarSaldo();

//        conta1.verificartransacoes();
    }
}
