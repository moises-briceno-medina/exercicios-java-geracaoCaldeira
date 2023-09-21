package Aula04.Exercicios.Exercicio02;

public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;
    private String nome = "Triangulo";
    public Triangulo(double base, double altura, String nome){
        this.altura= altura;
        this.base = base;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double CalcularArea() {
        return (base*altura)/2;
    }
}
