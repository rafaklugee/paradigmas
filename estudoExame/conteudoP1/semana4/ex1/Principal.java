public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", 1899, "Brasil", "Físico");
        Tese tese = new Tese("Máquina da Natureza", 2025, "Vignatti");
        MidiaDigital midia = new MidiaDigital("Revista Recreio", 2009, "PDF");
        LivroDidatico livroDidatico = new LivroDidatico("Algoritmos", 1989, "Algoritmos I", "MIT Press");

        ItemBiblioteca[] itens = {livro, tese, midia, livroDidatico};

        ItemBiblioteca maisAntigo = livro;

        for (int i = 0; i < 4; i++) {
            if (itens[i].getAno() < maisAntigo.getAno())
                maisAntigo = itens[i];
        }

        System.out.print("\nO item mais antigo é: " + maisAntigo.getTitulo() + ".\n");
    }
}