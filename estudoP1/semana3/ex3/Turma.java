public class Turma {
    // Atributos
    private int codigo;
    private String nomeProfessor;
    private Aluno[] alunos;
    private int qtdAlunos = 0;

    // Construtores
    public Turma(int codigo) {
        if (codigo > 0)
            this.codigo = codigo;
    }

    public Turma(int codigo, String nomeProfessor) {
        if (codigo > 0)
            this.codigo = codigo;
        if (nomeProfessor != null)
            this.nomeProfessor = nomeProfessor;
        
        this.alunos = new Aluno[3];
    }

    public Turma(int codigo, String nomeProfessor, Aluno[] alunos) {
        if (codigo > 0)
            this.codigo = codigo;
        if (nomeProfessor != null)
            this.nomeProfessor = nomeProfessor;
        if (alunos != null)
            this.alunos = alunos;
    }

    // Métodos
    public void adicionarAluno(Aluno aluno) {
        if (aluno != null) {
            this.alunos[this.qtdAlunos] = aluno;
            this.qtdAlunos++;
        }
    }

    public void exibir() {
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Aluno: " + this.alunos[i].getNome());
        }
    }
}