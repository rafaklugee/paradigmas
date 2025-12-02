public class ItemBiblioteca {
    // Atributos
    protected String titulo;
    protected int ano;

    // Construtor
    public ItemBiblioteca (String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getAno() {
        return this.ano;
    }
}