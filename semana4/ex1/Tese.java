package semana4.ex1;

public class Tese extends Biblioteca {
    String disciplina;
    String orientador;

    // Construtor
    public Tese(String titulo, int ano, String disciplina, String orientador) {
        super(titulo, ano);
        this.disciplina = disciplina;
        this.orientador = orientador;
    }
}
