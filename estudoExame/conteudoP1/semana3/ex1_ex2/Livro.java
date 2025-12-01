public class Livro {
    // Atributos
    private String titulo;
    private int ano;
    private Autor autor;
    private int edicao;

    // Construtores
    public Livro(String titulo) {
        this.setTitulo(titulo);
    }

    public Livro(String titulo, int ano) {
        this.setTitulo(titulo);
        this.setAno(ano);
    }

    public Livro(String titulo, int ano, Autor autor) {
        this.setTitulo(titulo);
        this.setAno(ano);
        this.setAutor(autor);
    }

    public Livro(String titulo, int ano, Autor autor, int edicao) {
        this.setTitulo(titulo);
        this.setAno(ano);
        this.setAutor(autor);
        this.setEdicao(edicao);
    }

    // Métodos
    public String getTitulo() {
        return this.titulo;
    }

    public int getAno() {
        return this.ano;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public int getEdicao() {
        return this.edicao;
    }

    public void setTitulo(String titulo) {
        if (titulo != null)
            this.titulo = titulo;
    }

    public void setAno(int ano) {
        if (ano > 0)
            this.ano = ano;
    }

    public void setAutor(Autor autor) {
        if (autor != null)
            this.autor = autor;
    }

    public void setEdicao(int edicao) {
        if (edicao > 0)
            this.edicao = edicao;
    }

    public void exibir() {
        System.out.print("\nTitulo: " + this.titulo);
        System.out.print("\nAno: " + this.ano);
        System.out.print("\nAutor: " + this.autor.getNome());
        System.out.print("\nEdição: " + this.edicao + "\n");
    }
}