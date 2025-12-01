public class Turma {
    // Atributos
    private int codigo;
    private String nomeProfessor;
    private Aluno[] alunos;
    private int qtdAlunos = 0;

    // Construtores
    public Turma(int codigo) {
        this.setCodigo(codigo);
        this.alunos = new Aluno[3];
    }

    public Turma(int codigo, String nomeProfessor) {
        this.setCodigo(codigo);
        this.setNomeProfessor(nomeProfessor);
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
        if (codigo > 0)
            this.codigo = codigo;
    }

    public void setNomeProfessor(String nomeProfessor) {
        if (nomeProfessor != null)
            this.nomeProfessor = nomeProfessor;
    }

    public void adicionarAluno(Aluno aluno) {
        if (aluno != null && qtdAlunos < 3) {
            this.alunos[qtdAlunos] = aluno;
            qtdAlunos++;
        }
    }

    public void exibir() {
        for (int i = 0; i < 3; i++) {
            System.out.print("\nAluno: " + this.alunos[i].getNome() + " | GRR: " + this.alunos[i].getGRR());
        }
        System.out.print("\nCódigo da turma: " + this.codigo);
        System.out.print("\nProfessor da turma: " + this.nomeProfessor + "\n");
    }
}