package semana4.ex1;

public class Livro extends Biblioteca {
    // Atributos
    String editora;
    String formato;

    // Construtor
    public Livro(String titulo, int ano, String editora, String formato) {
        super(titulo, ano);
        this.editora = editora;
        this.formato = formato;
    }
}