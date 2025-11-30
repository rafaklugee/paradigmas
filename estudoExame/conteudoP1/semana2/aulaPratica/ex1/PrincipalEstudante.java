import java.util.Scanner;

public class PrincipalEstudante {
    public static void main(String args[]) {
        String nome;
        int nota, numExame = 0, numRepr = 0;
        double soma = 0, media;
        
        Estudante[] estudantes = new Estudante[5];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            estudantes[i] = new Estudante();

            System.out.print("Digite o nome do estudante: ");
            nome = input.next();
            estudantes[i].setNome(nome);

            System.out.print("Digite a nota do estudante: ");
            nota = input.nextInt();
            estudantes[i].setNota(nota);
        }

        System.out.print("\nEstudantes aprovados:");
        for (int i = 0; i < 5; i++) {
            soma += estudantes[i].getNota();
            if (estudantes[i].getNota() < 40)
                numRepr++;
            else if (estudantes[i].getNota() >= 40 && estudantes[i].getNota() <= 69)
                numExame++;
            else
                estudantes[i].exibir();
        }
        media = soma / 5;

        System.out.print("\n");
        System.out.print("\nMédia da turma: " + media);
        System.out.print("\nEstudantes em exame: " + numExame);
        System.out.print("\nEstudantes reprovados: " + numRepr);
        
        input.close();
    }
}