package semana4.ex1;

public class Midia extends Biblioteca {
    String formato;

    // Construtor
    public Midia(String titulo, int ano, String formato) {
        super(titulo, ano);
        this.formato = formato;
    }
}