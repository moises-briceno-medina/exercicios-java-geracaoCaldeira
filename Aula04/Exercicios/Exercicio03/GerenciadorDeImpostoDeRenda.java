package Aula04.Exercicios.Exercicio03;

public class GerenciadorDeImpostoDeRenda {
    private double somaTotalTributos;
    public void adicionarTributavel(Tributavel tributavel){
        this.somaTotalTributos += tributavel.calculaTributos();
        System.out.println("A soma tota dos seus tributos é: " + this.somaTotalTributos);
    }

    public double getSomaTotalTributos() {
        return somaTotalTributos;
    }
}
