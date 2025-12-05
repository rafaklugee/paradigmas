public abstract class Monitor {
    // Atributos
    protected String nome;
    protected String disciplina;
    protected int matricula;

    // Construtor
    public Monitor(String nome, String disciplina, int matricula) {
        this.nome = nome;
        // this.setNome(nome);
        this.disciplina = disciplina;
        // this.setDisciplina(disciplina);
        this.matricula = matricula;
        // this.setMatricula(matricula);
    }

    // Método
    public abstract void metodo();

    public abstract void relatorioAtividades();

    public void disponibilizarHorario() {
       System.out.print("\nDisponibilizando horários...");
    }
}