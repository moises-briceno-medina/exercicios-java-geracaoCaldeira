package aula04.exercicio01;

public abstract class Veiculo {

    private String marca;
    private String modelo;
    private int ano;

    public abstract void calcularCustoViagem(int distancia);
}
