public class Pedido {
    // Atributos
    private int numeroPedido;
    private ItemPedido[] lista;
    private ItemPedido itens;
    private int quantidadeAtual = 0;

    // Construtores
    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Pedido(int numeroPedido, ItemPedido[] lista) {
        this.numeroPedido = numeroPedido;
        this.lista = lista;
    }

    // Métodos
    public ItemPedido[] getLista() {
        return lista;
    }

    public void setLista(ItemPedido[] lista) {
        this.lista = lista;
    }

    public void adicionarItem(ItemPedido item) {
        this.lista[this.quantidadeAtual] = item;
        this.quantidadeAtual++;
    }

    public double calculaTotal() {
        double soma = 0;
        for (int i = 0; i < this.quantidadeAtual; i++) {
            soma += lista[i].getPreco();
        }
        return soma;
    }

    public void exibirItens() {
        for (int i = 1; i <= this.quantidadeAtual; i++) {
            System.out.println(i + " - " + lista[i - 1].getNomeItem() + " ($" + String.format("%.2f", lista[i - 1].getPreco()) + ")");
        }
    }
}