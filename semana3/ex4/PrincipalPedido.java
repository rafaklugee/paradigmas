import java.util.Scanner;

public class PrincipalPedido {
    public static void main(String[] args) {
        int numeroPedido;
        int quantidade;
        String nomeItem;
        double preco;
        ItemPedido item;
        double total;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número do pedido: ");
        numeroPedido = input.nextInt();
        
        Pedido pedido = new Pedido(numeroPedido);

        System.out.print("Quantos itens deseja adicionar ao pedido? ");
        quantidade = input.nextInt();

        // Vou inicializar minha lista aqui
        pedido.setLista(new ItemPedido[quantidade]);

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome do item: ");
            nomeItem = input.next();
            System.out.print("Digite o preço do item: ");
            preco = input.nextDouble();

            item = new ItemPedido(nomeItem, preco);
            pedido.adicionarItem(item);
        }

        System.out.println("Pedido #" + numeroPedido);
        pedido.exibirItens();
        total = pedido.calculaTotal();
        System.out.printf("Total: $%.2f%n", total);
    }
}