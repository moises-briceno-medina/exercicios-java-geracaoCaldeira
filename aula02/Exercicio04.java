package aula02;

import utils.ScanUtils;

//Implemente uma calculadora,
//onde o usuário deve entrar com 2 números e escolher a operação que deseja realizar.
//Durante a execução o programa deve perguntar ao usuário se ele deseja continuar
//se ele não quiser, deve digitar ‘n’ para o programa encerrar.
public class Exercicio04 {
    public static void main(String[] args) {

        ScanUtils scan = new ScanUtils();

        String response;
        do {
            double firstNumber = scan.coletaDouble("Digite o primeiro número: ");
            double secondNumber = scan.coletaDouble("Digite o segundo número: ");

            System.out.println("Qual operação deseja fazer: ");
            System.out.printf("Soma [1] %n" + "Subtração [2] %n" + "Multiplicação [3] %n" + "Divisão [4]");
            int option = scan.coletaInt("");

            switch (option) {
                case 1:
                    System.out.println("A soma de " + firstNumber + " e " + secondNumber + " é: " + (firstNumber + secondNumber));
                    break;
                case 2:
                    System.out.println("A subtração de " + firstNumber + " e " + secondNumber + " é: " + (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.println("A multiplicação de " + firstNumber + " e " + secondNumber + " é: " + (firstNumber * secondNumber));
                    break;
                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Não é possivel dividir por zero.");
                    } else
                        System.out.println("A divisão de " + firstNumber + " e " + secondNumber + " é: " + (firstNumber / secondNumber));
                    break;
                default:
                    System.out.println("Escolha umas das opcões.");
            }

            response = scan.coletaTexto("Se voçê não deseja continuar usando a calculadora digite [n]. Caso contrario digite qualquer outro caracter!").toLowerCase();

        } while (!response.equals("n"));
    }
}
