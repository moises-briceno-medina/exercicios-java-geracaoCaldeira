package aula01;

import utils.ScanUtils;

//Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado, assuma que o salário mínimo é R$1.320.
public class Exercicio04 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        final double SALARIO_MINIMO = 1320;

        double salarioUsuario = scan.coletaDouble("Digte seu salario: ");

        double quantidadeSalarioMinimo = (salarioUsuario / SALARIO_MINIMO);

        System.out.printf("Você recebe %.2f Salários mínimos %n", quantidadeSalarioMinimo);
    }
}
