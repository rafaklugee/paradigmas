import java.util.Scanner;

public class PrincipalLivro {
    public static void main(String[] args) {
        String titulo;
        String nome;
        Autor autor;
        int ano;

        Scanner input = new Scanner(System.in);

        Livro[] livro = new Livro[3];
        for (int i = 0; i < 3; i++) {
            livro[i] = new Livro("");
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o título: ");
            titulo = input.next();

            System.out.print("Digite o ano de publicação: ");
            ano = input.nextInt();

            System.out.print("Digite o nome do autor: ");
            nome = input.next();
            autor = new Autor(nome);

            livro[i] = new Livro(titulo, autor, ano);

        }

        for (int i = 0; i < 3; i++) {
            String TituloLivro = livro[i].getTitulo();
            int AnoLivro = livro[i].getAno();
            String AutorNome = livro[i].getAutor().getNome();
            
            System.out.println("Título: " + TituloLivro);
            System.out.println("Ano: " + AnoLivro);
            System.out.println("Autor: " + AutorNome);
        }
        input.close();
    }
}