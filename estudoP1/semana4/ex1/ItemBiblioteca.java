public class ItemBiblioteca {
    // Atributos (protected pois é super classe)
    protected String titulo;
    protected int ano;

    // Construtor
    public ItemBiblioteca(String titulo, int ano) {
        if (titulo != null)
            this.titulo = titulo;
        if (ano > 0)
            this.ano = ano;
    }

    // Métodos
    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        if (ano > 0)
            this.ano = ano;
    }

    public void imprimirDados() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Ano de publicação: " + this.ano);
    }
}