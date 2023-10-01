package aula06.exercicio01;

public class Livro {
    private String titulo;
    private String categoria;

    public Livro(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Categoria: " + categoria;
    }
}
