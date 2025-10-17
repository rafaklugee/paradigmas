public class Principal {
    public static void main(String[] args) {
        ItemPedido item1 = new ItemPedido("Pizza", 35);
        ItemPedido item2 = new ItemPedido("Suco", 8);

        ItemPedido[] lista = new ItemPedido[2];

        Pedido pedido = new Pedido(101, lista);

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        pedido.exibir();
    }
}