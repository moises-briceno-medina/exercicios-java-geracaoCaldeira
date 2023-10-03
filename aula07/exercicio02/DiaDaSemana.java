//Exercício 2: Enum
//Crie um enum chamado DiaDaSemana que represente os dias da semana
// (por exemplo, SEGUNDA, TERCA, etc.). Escreva um programa que aceite um dia da semana
// do usuário e imprima uma mensagem de acordo com o dia escolhido.
package aula07.exercicio02;

import utils.ScanUtils;

public class DiaDaSemana {
    enum DiaDaSemanaEnum {
        SEGUNDA, TERCA , QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
    }

    public static void main(String[] args) {
        ScanUtils scan = new ScanUtils();


        String entrada = scan.coletaTexto("Digite um dia da semana (em maiúsculas): )");
        DiaDaSemanaEnum diaEscolhido = DiaDaSemanaEnum.valueOf(entrada.toUpperCase());

        switch (diaEscolhido) {
            case SEGUNDA:
                System.out.println("Você escolheu segunda-feira.");
                break;
            case TERCA:
                System.out.println("Você escolheu terça-feira.");
                break;
            case QUARTA:
                System.out.println("Você escolheu quarta-feira.");
                break;
            case QUINTA:
                System.out.println("Você escolheu quinta-feira.");
                break;
            case SEXTA:
                System.out.println("Você escolheu sexta-feira.");
                break;
            case SABADO:
                System.out.println("Você escolheu sábado.");
                break;
            case DOMINGO:
                System.out.println("Você escolheu domingo.");
                break;
            default:
                System.out.println("Dia da semana inválido. Certifique-se de digitar um dia válido.");
        }
    }
}

