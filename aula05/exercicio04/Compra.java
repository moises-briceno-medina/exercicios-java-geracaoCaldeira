package aula05.exercicio04;

public class Compra {
    private String nome;
    private String dataDeValidade;
    private double valor;

    public Compra(String nome, double valor ,String dataDeValidade){
        this.nome = nome;
        this.valor = valor;
        this.dataDeValidade = dataDeValidade;
    }
    @Override
    public String toString() {
        return "Nome:" + nome + ", Valor: " + valor + ", Data de validade: " + dataDeValidade; // Personalize como desejar
    }
}
