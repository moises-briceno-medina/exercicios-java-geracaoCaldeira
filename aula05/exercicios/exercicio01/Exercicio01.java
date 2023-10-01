package aula05.exercicios.exercicio01;
import Aula05.exercicios.utils.ScanUtils;

public class Exercicio01 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();
        int[] arrayNumeros = new int[5];
        int total = 0;

        for (int i = 0; i < arrayNumeros.length; i++) {
            int numeroAtual = i + 1;
            arrayNumeros[i] = scan.coletaInt("insera o " + numeroAtual + "° numero inteiro");
            total += arrayNumeros[i];
        }

        System.out.println("A soma dos numeros é: " + total);
        System.out.println("A media dos numeros é: " + (total / 5));
    }
}