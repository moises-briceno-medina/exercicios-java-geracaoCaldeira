package Aula03.Exercicios.Exercicio01;

import java.time.LocalTime;

public class TestConta {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Moises briceno", "708948844-50", 2021, "Banrisul", "Av protasio alves");
        ContaBancaria conta2 = new ContaBancaria("Neymar", "102345767-80", 2022, "Nubank", "Bom Jesus");

        conta2.setHorarioAtual(LocalTime.of(16, 17));
        conta1.setHorarioAtual(LocalTime.of(16, 17));


        conta1.deposito(200);

        conta1.pix(50, conta2, LocalTime.of(16, 17));

        conta1.transferencia(conta2, 40);
        conta2.transferencia(conta2, 10);

//        conta1.calcularJuros(2);
        conta1.verificarSaldo();
        conta2.verificarSaldo();

        conta1.verificarTransacoes();
    }
}
