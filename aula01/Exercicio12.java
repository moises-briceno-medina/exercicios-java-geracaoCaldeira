package aula01;//Crie um programa que converta uma quantia em dólares para outra moeda,
// como euros ou reais. Peça ao usuário para inserir a quantia em dólares
// e a taxa de câmbio atual. Em seguida, calcule e exiba o valor convertido.

import utils.ScanUtils;

public class Exercicio12 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();
        double quantidade = scan.coletaDouble("Insara a quantidade de Dolares");
        System.out.println("Você deseja converter:");
        System.out.printf("Dolares para Reais [1] %n" + "Dolares para Euros [2]");
        double opcao = scan.coletaDouble("");
        double taxaAtual = scan.coletaDouble("Informe a taxa de câmbio atual");

        switch ((int) opcao) {
            case 1:
                System.out.printf("%.2f$ em Reais seria: %.2f%n", quantidade, quantidade * taxaAtual);
                break;
            case 2:
                System.out.printf("%.2f$ em Euros seria: %.2f%n", quantidade, quantidade * taxaAtual);
                break;
            default:
                System.out.println("Escolha uma das opções");
        }
    }
}
