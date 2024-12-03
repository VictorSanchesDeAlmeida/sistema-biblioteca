package livro;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;

    // Construtor
    public Livro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Gênero: " + genero;
    }
}
