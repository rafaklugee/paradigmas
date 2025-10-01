public class Pedido {
    // Atributos
    private int numeroPedido;
    private ItemPedido[] listaItens;
    private int qtdItens = 0;

    // Construtores
    public Pedido(int numeroPedido) {
        if (numeroPedido > 0)
            this.numeroPedido = numeroPedido;
    }

    public Pedido(int numeroPedido, ItemPedido[] listaItens) {
        if (numeroPedido > 0)
            this.numeroPedido = numeroPedido;
        if (listaItens != null)
            this.listaItens = listaItens;

        // this.listaItens = new ItemPedido[2];
    }

    // Métodos
    public void adicionarItem(ItemPedido item) {
        this.listaItens[this.qtdItens] = item;
        this.qtdItens++;
    }

    public double calcularPreco(ItemPedido[] listaItens) {
        double total = 0;
        
        for (int i = 0; i < this.qtdItens; i++) {
            total += listaItens[i].getPreco();
        }

        return total;
    }

    public void exibir() {
        System.out.println("Pedido #" + numeroPedido);
        for (int i = 0; i < this.qtdItens; i++) {
            System.out.println(i+1 + " - " + this.listaItens[i].getNomeItem() + " ($" + this.listaItens[i].getPreco() + ")");
        }
        System.out.println("Total: $" + calcularPreco(this.listaItens));
    }
}