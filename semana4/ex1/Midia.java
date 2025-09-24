public class Midia extends ItemBiblioteca {
    String formato;

    // Construtor
    public Midia(String titulo, int ano, String formato) {
        super(titulo, ano);
        this.formato = formato;
    }
}