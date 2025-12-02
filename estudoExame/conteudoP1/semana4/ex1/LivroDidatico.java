public class LivroDidatico extends ItemBiblioteca {
    // Atributos
    private String disciplina;
    private String editora;

    // Construtor
    public LivroDidatico(String titulo, int ano, String disciplina, String editora) {
        super(titulo, ano);
        this.disciplina = disciplina;
        this.editora = editora;
    }
}