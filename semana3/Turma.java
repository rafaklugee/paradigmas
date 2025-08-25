public class Turma {
    // Atributos
    private int codigo;
    private String nomeProfessor;
    private Aluno[] alunos;
    private int quantidadeAlunos = 0;

    // Construtores
    public Turma(int codigo) {
        this.codigo = codigo;
        this.alunos = new Aluno[3];
    }

    public Turma(int codigo, String nomeProfessor) {
        this.codigo = codigo;
        this.nomeProfessor = nomeProfessor;
        this.alunos = new Aluno[3];
    }

    // Métodos
    public int getCodigo() {
        return this.codigo;
    }

    public String getNomeProfessor() {
        return this.nomeProfessor;
    }

    public Aluno[] getAlunos() {
        return this.alunos;
    }

    public void setCodigo(int codigo) {
        if (codigo >= 0)
            this.codigo = codigo;
    }

    public void setNomeProfessor(String nomeProfessor) {
        if (nomeProfessor != null)
            this.nomeProfessor = nomeProfessor;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < 3 && aluno != null) {
            this.alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        }
    }
}