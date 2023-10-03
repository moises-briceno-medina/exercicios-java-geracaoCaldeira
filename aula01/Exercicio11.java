package aula01;//Peça ao usuário que digite uma palavra ou frase
// e conte quantas vogais (a, e, i, o, u) estão presentes.
// Exiba o número de vogais na tela.
import utils.ScanUtils;
public class Exercicio11 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        String texto = scan.coletaTexto("Digite uma palavra ou frase: ").toLowerCase();

        int contadorVogais = 0;
        for (int i = 0 ; i < texto.length(); i++){

            char caractere = texto.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }
        System.out.println("O número de vogais no texto inserido é: " + contadorVogais);

    }
}
