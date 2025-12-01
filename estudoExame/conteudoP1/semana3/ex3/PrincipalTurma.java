public class PrincipalTurma {
    public static void main(String args[]) {
        Aluno aluno1 = new Aluno("Rafael Ribeiro Kluge", 20244439);
        Aluno aluno2 = new Aluno("Alejandro David Nava Nava", 20240000);
        Aluno aluno3 = new Aluno("André Akira", 20241111);

        Turma turma = new Turma(1164, "Armando Delgado");

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        turma.exibir();
    }
}