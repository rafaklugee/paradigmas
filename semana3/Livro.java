public class Livro {
    // Atributos
    private String titulo;
    private Autor autor;
    private int ano;
    private int edicao;

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

    public Livro(String titulo, Autor autor, int ano, int edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.edicao = edicao;
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

    public int getEdicao() {
        return this.edicao;
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

    public void setEdicao(int edicao) {
        if(edicao > 0)
            this.edicao = edicao;
    }

    // Outros métodos
    public void exibir() {
        if(this.titulo != null)
            System.out.println("Titulo: " + this.titulo);
        if(this.ano > 0)
            System.out.println("Ano: " + this.ano);
        if(this.autor != null)
            System.out.println("Nome do autor: " + this.autor.getNome());
        if(this.edicao > 0)
            System.out.println("Edição: " + this.edicao);
    }
}
