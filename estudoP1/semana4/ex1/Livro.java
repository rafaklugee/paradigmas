public class Livro extends ItemBiblioteca {
    // Atributos
    String editora;

    // Construtor
    public Livro(String titulo, int ano, String editora) {
        super(titulo, ano);
        if (editora != null)
            this.editora = editora;
    }

    // Método
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Editora: " + this.editora);
    }
}