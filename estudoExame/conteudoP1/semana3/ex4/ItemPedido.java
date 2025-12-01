public class ItemPedido {
    // Atributos
    private String nomeItem;
    private double preco;

    // Construtor
    public ItemPedido(String nomeItem, double preco) {
        this.setNomeItem(nomeItem);
        this.setPreco(preco);
    }

    // Métodos
    public String getNomeItem() {
        return this.nomeItem;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setNomeItem(String nomeItem) {
        if (nomeItem != null)
            this.nomeItem = nomeItem;
    }

    public void setPreco(double preco) {
        if (preco > 0)
            this.preco = preco;
    }
}