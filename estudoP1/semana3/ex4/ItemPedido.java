public class ItemPedido {
    // Atributos
    private String nomeItem;
    private double preco;

    // Construtores
    public ItemPedido(String nomeItem) {
        if (nomeItem != null)
            this.nomeItem = nomeItem;
    }

    public ItemPedido(String nomeItem, double preco) {
        if (nomeItem != null)
            this.nomeItem = nomeItem;
        if (preco > 0)
            this.preco = preco;
    }

    // Métodos
    public String getNomeItem() {
        return this.nomeItem;
    }

    public double getPreco() {
        return this.preco;
    }
}