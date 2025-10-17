public class Tese extends ItemBiblioteca {
    // Atributos
    String orientador;

    // Construtor
    public Tese(String titulo, int ano, String orientador) {
        super(titulo, ano);
        if (orientador != null)
            this.orientador = orientador;
    }

    // Método
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Orientador(a): " + this.orientador);
    }
}