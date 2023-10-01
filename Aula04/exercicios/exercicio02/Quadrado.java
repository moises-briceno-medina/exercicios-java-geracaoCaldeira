package Aula04.exercicios.exercicio02;

public class Quadrado extends FormaGeometrica {
    private double lado;
    private String nome;

    public String getNome() {
        return nome;
    }

    public Quadrado(double lado, String nome){
        this.lado = lado;
        this.nome = nome;
    }
    @Override
    public double CalcularArea() {return lado * lado;}
}
