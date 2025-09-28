import java.util.Scanner;
import java.util.ArrayList;

// Polimorfismo universal de inclusão

public class Principal {
    public static void main(String[] args) {
        String rua;
        int numero;
        String bairro;
        String cidade;
        String estado;
        double preco;
        
        Scanner input = new Scanner(System.in);

        ArrayList<Imovel> imoveis = new ArrayList<Imovel>(2);

        for (int i = 0; i < 2; i++) {
            if (i % 2 == 0) {
                System.out.print("Digite a rua: ");
                rua = input.nextLine();

                System.out.print("Digite o numero do imovel: ");
                numero = input.nextInt();
                input.nextLine(); // Limpar o buffer

                System.out.print("Digite o nome do bairro: ");
                bairro = input.nextLine();

                System.out.print("Digite o nome da cidade: ");
                cidade = input.nextLine();

                System.out.print("Digite o nome do estado: ");
                estado = input.nextLine();

                Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado);

                System.out.print("Digite o preco do metro do Imovel(Novo): ");
                preco = input.nextDouble();

                input.nextLine(); // Limpar o buffer

                imoveis.add(new ImovelNovo(endereco, preco)); // Polimorfismo de inclusão
            }
            else {
                System.out.print("Digite a rua: ");
                rua = input.nextLine();

                System.out.print("Digite o numero do imovel: ");
                numero = input.nextInt();
                input.nextLine(); // Limpar o buffer

                System.out.print("Digite o nome do bairro: ");
                bairro = input.nextLine();

                System.out.print("Digite o nome da cidade: ");
                cidade = input.nextLine();

                System.out.print("Digite o nome do estado: ");
                estado = input.nextLine();

                Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado);

                System.out.print("Digite o preco do metro do Imovel(Velho): ");
                preco = input.nextDouble();

                input.nextLine(); // Limpar o buffer

                imoveis.add(new ImovelVelho(endereco, preco)); // Polimorfismo de inclusão
            }
        }

        // Exibindo o preço de cada imóvel
        System.out.println("\n=== PRECO DOS IMOVEIS ===");
        for (int i = 0; i < imoveis.size(); i++) {
            double valorAtual = imoveis.get(i).calcularValorImovel();
            System.out.println("O preco do imóvel é: R$ " + valorAtual);
        }

        input.close();
    }
}