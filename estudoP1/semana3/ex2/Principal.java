public class Principal {
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis", "Brasileiro");
        Livro livro1 = new Livro("Dom Casmurro", 1899, autor);
        Livro livro2 = new Livro("Quincas Borba", 1891, autor);

        livro1.exibir();
        livro2.exibir();
    }
}