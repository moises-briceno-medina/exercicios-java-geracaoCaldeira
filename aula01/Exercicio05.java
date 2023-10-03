package aula01;

import utils.ScanUtils;

//Crie um programa que armazene um horário (hora, minuto e segundo) em variáveis, depois, determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s e a quantidade de segundos que faltam para a meia-noite.
public class Exercicio05 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        int hora;
        do {
            hora = scan.coletaInt("Digite a hora (0-23): ");
        } while (hora > 23 || hora < 0);

        int minuto;
        do {
            minuto = scan.coletaInt("Digite o minuto (0-59): ");
        } while (minuto > 59 || minuto < 0);

        int segundo;
        do {
            segundo = scan.coletaInt("Digite o segundo (0-59): ");
        } while (segundo > 59 || segundo < 0);

        int segundosDesdeMeiaNoite = hora * 3600 + minuto * 60 + segundo;

        int segundosParaMeiaNoite = 24 * 3600 - segundosDesdeMeiaNoite;

        System.out.println("Segundos desde as 0h00min00s: " + segundosDesdeMeiaNoite + " segundos.");
        System.out.println("Segundos faltando para meia-noite: " + segundosParaMeiaNoite + " segundos.");
    }
}
