package Aula05.Exercicios.exercicio05;

public class Impressao {
    private String nome;
    private int numeroDePagina;

    public Impressao(String nome , int numeroDePagina){
        this.nome = nome;
        this.numeroDePagina = numeroDePagina;
    }
    @Override
    public String toString() {
        return "Nome:" + nome + ", Numeros de pagina: " + numeroDePagina ; // Personalize como desejar
    }
}
