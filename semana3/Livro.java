public class Livro {
    // Atributos
    private String titulo;
    private Autor autor;
    private int ano;

    // Construtores (3)
    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(String titulo, Autor autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    // Métodos
    public String getTitulo() {
        return this.titulo;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setTitulo(String titulo) {
        if(titulo != null)
            this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        if(autor != null)    
            this.autor = autor;
    }

    public void setAno(int ano) {
        if(ano > 0)
            this.ano = ano;
    }  
}
