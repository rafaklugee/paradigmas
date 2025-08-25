public class ItemPedido {
    // Atributos
    private String nomeItem;
    private double preco;

    // Construtores
    public ItemPedido(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public ItemPedido(String nomeItem, double preco) {
        this.nomeItem = nomeItem;
        this.preco = preco;
    }

    // Métodos
    public String getNomeItem() {
        return nomeItem;
    }

    public double getPreco() {
        return preco;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}