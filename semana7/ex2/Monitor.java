public abstract class Monitor {
    // Atributos (protegido pois é abstrato)
    protected String nome;
    protected String disciplina;
    protected int matricula;

    // Construtor
    public Monitor(String nome, String disciplina, int matricula) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.matricula = matricula;
    }

    // Método
    public abstract void enviarRelatorio(String disciplina);
}