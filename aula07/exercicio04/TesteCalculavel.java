package aula07.exercicio04;

import utils.ScanUtils;

public class TesteCalculavel {
    public static void main(String[] args) {

        ScanUtils scan = new ScanUtils();
        Calculadora calculadora = new Calculadora();

        System.out.println("Digite dois números inteiros:");

        try {
            System.out.println("##### Calculadora #####");
            String operacao = scan.coletaTexto("""
                    Qual operação você deseja realizar:
                    Somar
                    Subtrair
                    Multiplicar
                    Dividir
                    """);

            Operacoes.OPERACAO_DESEJADA operacaoDesejada = Operacoes.OPERACAO_DESEJADA.valueOf(operacao.toUpperCase());

            int numero1 = scan.coletaInt("Digite o primeiro número inteiro:");
            int numero2 = scan.coletaInt("Digite o segundo número inteiro:");


            switch (operacaoDesejada) {
                case SOMAR -> calculadora.adicionar(numero1, numero2);
                case SUBTRAIR -> calculadora.subtrair(numero1, numero2);
                case MULTIPLICAR -> calculadora.multiplicar(numero1, numero2);
                case DIVIDIR -> calculadora.dividir(numero1, numero2);
                default -> System.out.println("Opção invalida");
            }

        } catch (java.util.InputMismatchException e){ //Exception e : Tratamento para outras exceções
        System.out.println("Você não digitou um número inteiro válido.");
    }
        catch (ArithmeticException e) { //Exception e : Tratamento para outras exceções
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
