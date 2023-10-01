package aula01;//Escreva um programa que calcule o fatorial de um número inteiro não negativo fornecido pelo usuário.
// O fatorial de um número N é o produto de todos os inteiros de 1 até N.
import aula01.utils.ScanUtils;
public class Exercicio13 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        int numero = scan.coletaInt("Digite um número não negativo para calcular o fatorial: ");

        if (numero < 0) {
            System.out.println("O fatorial não está definido para números negativos.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }

    public static long calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 2; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}