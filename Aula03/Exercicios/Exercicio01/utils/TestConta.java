package Aula03.Exercicios.Exercicio01.utils;

import Aula03.Exercicios.Exercicio01.Conta;

public class TestConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Moises briceno", "708948844-50", 2021);
        Conta conta2 = new Conta("Neymar", "102345767-80",2022);


        conta1.setEndereco("Av protasio alves");
        conta1.setNomeBanco("Banrisul");
        conta1.setHorarioAtual(23);

        conta1.setSaldo(20);
//        conta1.saque(3000);
//        conta1.deposito(100);

//        conta1.verificarInformacoes();
//        conta1.verificarHorario();
//        conta1.transferencia(conta2, 100);

//        conta1.pix(200,23, conta2);
//        System.out.println(conta2.verificarSaldo());

        conta1.manutencaoMensal(1);
        System.out.println(conta1.verificarSaldo());

    }
}
