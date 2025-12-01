public class PrincipalLivro {
    public static void main(String args[]) {
        Autor autor1 = new Autor("Miguel de Cervantes", "Espanha");

        Livro livro1 = new Livro("Dom Quixote", 1605, autor1, 1);

        Autor autor2 = new Autor("Machado de Assis", "Brasil");

        Livro livro2 = new Livro("Dom Casmurro", 1899, autor2, 1);

        livro1.exibir();
        livro2.exibir();
    }
}