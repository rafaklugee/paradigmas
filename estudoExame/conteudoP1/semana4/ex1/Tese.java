public class Tese extends ItemBiblioteca {
    // Atributos
    private String orientador;

    // Construtor
    public Tese (String titulo, int ano, String orientador) {
        super(titulo, ano);
        this.orientador = orientador;
    }
}