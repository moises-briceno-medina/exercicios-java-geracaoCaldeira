package aula07.exercicio05;

import utils.ScanUtils;

public class Programa {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        int idade = scan.coletaInt("Digite sua idade");
        if (idade < 0 || idade > 150) {
            throw new IdadeInvalidaException("Idade invalida");
        } else {
            System.out.println("Sua idade é " + idade);
        }
    }
}
