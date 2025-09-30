public class MidiaDigital extends ItemBiblioteca {
    // Atributos
    String formato;

    // Construtor
    public MidiaDigital(String titulo, int ano, String formato) {
        super(titulo, ano);
        if (formato != null)
            this.formato = formato;
    }

    // Método
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Formato: " + this.formato);
    }
}