package aula06;

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

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Categoria:" + categoria;
    }
}
