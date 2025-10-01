public class Livro {
    // Atributos
    private String titulo;
    private int ano;
    private Autor autor;

    // Construtores
    public Livro(String titulo) {
        if (titulo != null)
            this.titulo = titulo;
    }

    public Livro(String titulo, int ano) {
        if (titulo != null)
            this.titulo = titulo;
        if (ano > 0)
            this.ano = ano;
    }

    public Livro(String titulo, int ano, Autor autor) {
        if (titulo != null)
            this.titulo = titulo;
        if (ano > 0)
            this.ano = ano;
        this.autor = autor;
    }

    // Métodos
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null)
            this.titulo = titulo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        if (ano > 0)
            this.ano = ano;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        if (autor != null)
            this.autor = autor;
    }
}