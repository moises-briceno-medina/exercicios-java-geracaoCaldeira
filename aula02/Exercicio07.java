package aula02;

import utils.ScanUtils;

//Criar um jogo de adivinhação para descobrir quantos soldados
// os 300 espartanos irão enfrentar.
// Leônidas pede para que seus soldados tentem
// adivinhar quantos inimigos irão combater. O usuário deve digitar seu palpite
// e se o número for menor do que 300.000, Leônidas deve dizer Um pouco mais!
// caso o número dito pelo usuário seja menor, ele dirá Um pouco menos!".
public class Exercicio07 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        // soldeiers = soldados tradução
        final int SOLDIERS = 300;
        //guess = Adivinhar tradução
        System.out.println("Bora descobrir quantos soldados os 300 espartanos irão enfrentar!");
        int guess = scan.coletaInt("Qual é o seu palpite? ");

        if (guess < SOLDIERS) {
            System.out.println("Um pouco mais!");
        } else if (guess > SOLDIERS) {
            System.out.println("Um pouco menos");
        } else
            System.out.println("Parabéns! você acertou!");


    }
}
