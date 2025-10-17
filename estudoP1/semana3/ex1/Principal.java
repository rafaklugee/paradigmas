public class Principal {
    public static void main(String[] args) {
        Autor autor = new Autor("Rafael", "Brasileiro");
        Livro livro = new Livro("O Pequeno Príncipe", 1990, autor);

        System.out.println("Livro: Titulo = " + livro.getTitulo() + " | Ano = " + livro.getAno());
        System.out.println("Autor: Nome = " + autor.getNome() + " | Nacionalidade = " + autor.getNacionalidade());   
    }
}