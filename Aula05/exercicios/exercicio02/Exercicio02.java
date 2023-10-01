package Aula05.exercicios.exercicio02;

import Aula05.exercicios.utils.ScanUtils;

public class Exercicio02 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        int[] arrayNumerosAleatorios = new int[10];

        //for para adicionar os numeros aleatorios
        for (int i = 0; i < arrayNumerosAleatorios.length; i++) {
            arrayNumerosAleatorios[i] = GeradorNumeroAleatorio(arrayNumerosAleatorios);
        }

        //for só para imprimir na tela cada número
        for (int numero : arrayNumerosAleatorios) {
            System.out.println(numero);
        }

        int numeroUsuario = scan.coletaInt("Insira um número");

        //for para verificar se o numero esta no array
        for (int i = 0; i < arrayNumerosAleatorios.length; i++) {
            if (numeroUsuario == arrayNumerosAleatorios[i]) {
                System.out.println("Numero encotrado!");
                break;
            }
        }
    }

    public static int GeradorNumeroAleatorio(int[] array) { // metodo gerador de numeros aleatorios
        int quantidadeNumeros = array.length;
        int numeroAleatorio = 0;
        for (int i = 0; i < quantidadeNumeros; i++) {
            numeroAleatorio = (int) (Math.random() * 100) + 1;
        }
        return numeroAleatorio;
    }
}
