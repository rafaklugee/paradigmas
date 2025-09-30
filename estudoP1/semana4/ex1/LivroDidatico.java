public class LivroDidatico extends Livro {
    // Atributos
    String disciplina;

    // Construtor
    public LivroDidatico(String titulo, int ano, String editora, String disciplina) {
        super(titulo, ano, editora);
        if (disciplina != null)
            this.disciplina = disciplina;
    }

    // Método
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Disciplina: " + this.disciplina);
    }
}