import java.util.Scanner;

public class PrincipalTurma {
    public static void main(String[] args) {
        String nomeProfessor;
        int codigo;
        String nomeAluno;
        double CR;
        Aluno aluno;

        Scanner input = new Scanner(System.in);

        System.out.print("Código da turma: ");
        codigo = input.nextInt();

        System.out.print("Nome do professor: ");
        nomeProfessor = input.next();

        Turma turma = new Turma(codigo, nomeProfessor);

        for (int i = 0; i < 3; i++) {
            System.out.print("Nome do aluno: ");
            nomeAluno = input.next();

            System.out.print("Coeficiente de rendimento: ");
            CR = input.nextDouble();

            aluno = new Aluno(nomeAluno, CR);
            turma.adicionarAluno(aluno);
        }

        System.out.println("Os alunos são:");

        Aluno[] alunos = turma.getAlunos();

        for (int i = 0; i < 3; i++) {
            System.out.println(alunos[i].getNome());
        }
    }
}