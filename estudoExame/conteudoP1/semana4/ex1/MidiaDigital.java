public class MidiaDigital extends ItemBiblioteca {
    // Atributos
    private String formato;

    // Construtor
    public MidiaDigital (String titulo, int ano, String formato) {
        super(titulo, ano);
        this.formato = formato;
    }
}