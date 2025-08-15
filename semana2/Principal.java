import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nome;
        double notaFinal;

        Scanner input = new Scanner(System.in);

        Estudante[] estudantes = new Estudante[5];

        for (int i = 0; i < 5; i++) {
            estudantes[i] = new Estudante();
            
            System.out.print("Insira o nome do estudante: ");
            nome = input.next();
            estudantes[i].setNome(nome);

            System.out.print("Insira sua nota final: ");
            notaFinal = input.nextDouble();
            estudantes[i].setNotaFinal(notaFinal);
        }

        double somaNotas = 0;
        int qtdExame = 0;
        int qtdReprovado = 0;
        int qtdAprovado = 0;

        for (int i = 0; i < 5; i++) {
            double nota = estudantes[i].getNotaFinal();
            somaNotas += nota;
            if (nota >= 40 && nota <= 69)
                qtdExame++;
            if (nota < 40)
                qtdReprovado++;
            if (nota >= 70)
                qtdAprovado++;
        }
        double mediaTurma = somaNotas / 5;

        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Qtd exame final: " + qtdExame);
        System.out.println("Qtd reprovado: " + qtdReprovado);
        System.out.println("Qtd aprovado: " + qtdAprovado);
    }
}
