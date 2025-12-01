public class Pedido {
    // Atributos
    private int numeroPedido;
    private ItemPedido[] lista;
    private int qtdItens = 0;

    // Construtor
    public Pedido(int numeroPedido) {
        this.setNumeroPedido(numeroPedido);
        this.lista = new ItemPedido[2];
    }

    public Pedido(int numeroPedido, ItemPedido[] itens) {
        this.setNumeroPedido(numeroPedido);
        if (itens != null)
            this.lista = itens;
        else
            this.lista = new ItemPedido[2];
    }

    // Métodos
    public int getNumeroPedido() {
        return this.numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        if (numeroPedido > 0)
            this.numeroPedido = numeroPedido;
    }

    public void adicionarItem(ItemPedido item) {
        if (item != null) {
            this.lista[this.qtdItens] = item;
            this.qtdItens++;
        }
    }

    public double calcularPedido() {
        double soma = 0;
        for (int i = 0; i < this.qtdItens; i++) {
            soma += this.lista[i].getPreco();
        }
        return soma;
    }

    public void exibir() {
        System.out.print("\nPedido #" + this.numeroPedido + "\n");
        for (int i = 0; i < this.qtdItens; i++) {
            System.out.print(i + 1 + " - " + lista[i].getNomeItem() + " ($" + lista[i].getPreco() + ")\n");
        }
        System.out.print("Total: $" + calcularPedido() + "\n");
    }
}