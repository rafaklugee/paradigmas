package semana4.ex1;

public class Biblioteca {
    // Atributos
    protected String titulo;
    protected int ano;

    // Construtor
    public Biblioteca(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    // Métodos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
