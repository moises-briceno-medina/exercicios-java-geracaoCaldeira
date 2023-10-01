package aula01;//Criar um algoritmo para definir as filas prioritárias.
// Seu programa deve exibir um menu de opções,
// perguntando se a pessoa é Gestante, Idosa, PCD ou Nenhuma das alternativas.
// Se ela for PCD, Idosa ou Gestante, tem direito a fila prioritária. Se não, não tem direito."

import utils.ScanUtils;

public class  Exercicio08 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        System.out.println("Olá, você se encaixa em qual desta opções?");
        System.out.printf("Gestante [1] %n" + "Idosa [2] %n" + "PCD [3] %n" + "Nenhuma das alternativas [4]" );

        int opcao = scan.coletaInt("");
        switch (opcao) {
            case 1:
                System.out.println("Você tem direito a fila prioritária");
                break;
            case 2:
                System.out.println("Você tem direito a fila prioritária");
                break;
            case 3:
                System.out.println("Você tem direito a fila prioritária");
                break;
            case 4:
                System.out.println("Você não tem direito a fila prioritária");
                break;
            default:
                System.out.println("Escolha uma das alternativas, por favor!");
        }
    }
}
