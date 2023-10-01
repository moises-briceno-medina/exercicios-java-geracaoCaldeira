package aula03.exercicios.exercicio01;

import java.time.LocalTime;

public class TestConta {
    public static void main(String[] args) {

        if (VerificaCpf.validarCpf("70794884270")) {
            ContaBancaria conta1 = new ContaBancaria("Moises Briceno", "708948844-50", 2022, "Banrisul", "Av protasio alves");
            ContaBancaria conta2 = new ContaBancaria("Neymar", "102345767-80", 2123, "Nubank", "Bom Jesus");

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
            conta2.verificarTransacoes();
        } else System.out.println("Cpf invalido");
    }
}
