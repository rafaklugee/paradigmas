import java.util.Scanner;

public class PrincipalLivro2 {
    public static void main(String[] args) {
        String titulo;
        String nome;
        Autor autor;
        int ano;
        int edicao;

        Scanner input = new Scanner(System.in);

        Livro[] livro = new Livro[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o título: ");
            titulo = input.nextLine();

            System.out.print("Digite o ano de publicação: ");
            ano = input.nextInt();
            input.nextLine(); // Limpa o buffer

            System.out.print("Digite o nome do autor: ");
            nome = input.nextLine();
            autor = new Autor(nome);

            System.out.print("Digite a edição: ");
            edicao = input.nextInt();
            input.nextLine(); // Limpa o buffer

            livro[i] = new Livro(titulo, autor, ano, edicao);
        }

        for (int i = 0; i < 2; i++)
            livro[i].exibir();

        input.close();
    }
}