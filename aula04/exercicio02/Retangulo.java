package aula04.exercicio02;

public class Retangulo extends FormaGeometrica {

    private String nome ;
    private double altura;
    private double base;

    public Retangulo(double base, double altura, String nome){
        this.altura = altura;
        this.base = base;
        this.nome = nome;
    }
    @Override
    public double calcularArea() {
        return base * altura;
    }

    public String getNome() {
        return nome;
    }
}
