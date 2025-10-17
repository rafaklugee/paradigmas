public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro("O Pequeno Príncipe", 1959, "Aster");
        ItemBiblioteca item = new ItemBiblioteca("Caneta", 2025);
        Tese tese = new Tese("O impacto das mídias no ensino", 2025, "José Ricardo");
        MidiaDigital midia = new MidiaDigital("Ebook Circuitos Digitais", 2024, "pdf");
        LivroDidatico livroDidatico = new LivroDidatico("Algoritmos (Cormen)", 1990, "GEN LTC", "Algoritmos 1");

        livro.imprimirDados();
        item.imprimirDados();
        tese.imprimirDados();
        midia.imprimirDados();
        livroDidatico.imprimirDados();

        ItemBiblioteca[] itens = {livro, item, tese, midia, livroDidatico};
        ItemBiblioteca antigo = itens[0];

        for (int i = 0; i < 5; i++) {
            if (antigo.getAno() > itens[i].getAno())
                antigo = itens[i];
        }

        System.out.println("O item mais antigo é: ");
        antigo.imprimirDados();
    }
}