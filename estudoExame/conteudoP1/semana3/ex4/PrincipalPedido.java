public class PrincipalPedido {
    public static void main(String[] args) {
        ItemPedido[] itens = new ItemPedido[2];

        Pedido pedido = new Pedido(101, itens);

        ItemPedido pizza = new ItemPedido("Pizza", 35);
        ItemPedido suco = new ItemPedido("Suco", 8);

        pedido.adicionarItem(pizza);
        pedido.adicionarItem(suco);

        pedido.exibir();
    }
}