public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private int ano;

    // Construtores
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    // Métodos
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setTitulo(String titulo) {
        if(!titulo.equals(null))
            this.titulo = titulo;
    }

    public void setAutor(String autor) {
        if(!autor.equals(null))    
            this.autor = autor;
    }

    public void setAno(int ano) {
        if(ano > 0)
            this.ano = ano;
    }  
}
