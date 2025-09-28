public abstract class Monitor {
    // Atributos (protected pois é abstrato)
    protected String nome;
    protected int matricula;
    protected String disciplina;

    // Construtor
    public Monitor(String nome, int matricula, String disciplina) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplina = disciplina;
    }

    // Método
    public abstract void relatorioAtividades();
}