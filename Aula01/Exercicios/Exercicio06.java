//Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:
//Se for menor de 16 anos, avisar que não pode votar;
//Se tiver 16 ou 17, avisar que o voto é facultativo;
//Se tiver mais de 65, avisar que também é facultativo o voto;
//De 18 até 65, é obrigatório votar.

import utils.ScanUtils;

public class Exercicio06 {
    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();

        do {
            int idadeUsuario = scan.coletaInt("Digite sua idade: ");
        }while (idadeUsuario <= 0 || idadeUsuario >= 120)


        if (idadeUsuario < 16) {
            System.out.println("Você ainda não pode votar");
        } else if (idadeUsuario >= 16 && idadeUsuario <= 17) {
            System.out.println("Seu voto é facultativo.");
        } else if (idadeUsuario > 65) {
            System.out.println("Seu voto é facultativo.");
        } else {
            System.out.println("Seu voto é obrigatório.");
        }
    }
}