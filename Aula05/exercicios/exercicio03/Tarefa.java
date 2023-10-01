package Aula05.exercicios.exercicio03;
public class Tarefa {
    private String titulo;
    private String data;
    private String descricao;

    public Tarefa(String titulo, String descricao, String data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Descrição: " + descricao + ", Data: " + data; // Personalize como desejar
    }
}