public class Principal {
    public static void main(String[] args) {
        // Instanciando objetos com construtores completos
        Livro livro = new Livro("Dom Casmurro", 1899, "Editora A", "Impresso");
        Tese tese = new Tese("Tese de Doutorado", 2010, "Computação", "Dr. Silva");
        Midia midia = new Midia("Curso Java", 2015, "Digital");
        LivroDidatico livroDidatico = new LivroDidatico("Matemática Básica", 2005, "Editora B", "Impresso");

        // Armazenando em um array
        Biblioteca[] itens = {livro, tese, midia, livroDidatico};

        // Encontrando o item mais antigo
        Biblioteca antigo = itens[0];
        for (int i = 0; i < 4; i++) {
            if (itens[i].getAno() < antigo.getAno())
                antigo = itens[i];
        }

        System.out.println("O item mais antigo é: " + antigo.getTitulo() + " (" + antigo.getAno() + ")");
    }
}
