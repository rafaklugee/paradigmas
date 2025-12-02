public class Livro extends ItemBiblioteca {
    // Atributos
    private String editora;
    private String formato;

    // Construtor
    public Livro (String titulo, int ano, String editora, String formato) {
        super(titulo, ano);
        this.editora = editora;
    }

}