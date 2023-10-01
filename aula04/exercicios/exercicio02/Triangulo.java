package aula04.exercicios.exercicio02;

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

    public double calcularArea() {
        return (base*altura)/2;
    }
}
