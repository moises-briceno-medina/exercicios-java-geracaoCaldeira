import utils.ScanUtils;

//Crie um programa que leia seu nome e imprima na tela.

public class Exercicio01 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        String nome = scan.coletaTexto("Por favor, digite seu nome: ");

        System.out.println("Seu nome é " + nome);
    }
}
