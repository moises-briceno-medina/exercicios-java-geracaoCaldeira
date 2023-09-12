//Crie um programa em Java que peça ao usuário para inserir
// seu ano de nascimento e, em seguida, calcule e exiba a idade.
import utils.ScanUtils;

public class Exercicio09 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();


        do {
            int anoDeNascimento = scan.coletaInt("informe seu ano de nascimento: ");
        }while (anoDeNascimento <= 2023 || anoDeNascimento <= 1900)

        System.out.println("Sua idade é: " + (2023-anoDeNascimento));
    }
}
