public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Rafael Ribeiro Kluge", 20244439);
        Aluno aluno2 = new Aluno("André Ribeiro Kluge", 20201456);
        Aluno aluno3 = new Aluno("Ana Ribeiro Kluge", 20318931);

        Turma turma = new Turma(5, "Ivete");

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        turma.exibir();
    }
}