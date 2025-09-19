import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String endereco;
        double metros;
        
        Imovel[] imoveis = new Imovel[3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < imoveis.length; i++) {
            System.out.println("Digite o endereço do imóvel " + (i+1) + ":");
            endereco = input.nextLine();

            System.out.println("Digite a metragem do imóvel " + (i+1) + ":");
            metros = input.nextDouble();
            
            input.nextLine(); // Quebrar linha

            if (i % 2 == 0) {
                imoveis[i] = new ImovelNovo(endereco, 0);
            } else {
                imoveis[i] = new ImovelVelho(endereco, 0);
            }
            imoveis[i].calcularValorImovel(0, metros);
        }

        for (int i = 0; i < imoveis.length; i++) {
            System.out.println("Imóvel " + (i+1) + ": Endereço: " + imoveis[i].endereco + ", Valor: R$ " + imoveis[i].preco);
        }

        input.close();
    }
}

/*
O conceito de polimorfismo está presente quando o array é declarado como Imovel[] e,
mesmo assim, armazena objetos de ImovelNovo e ImovelVelho. Ao chamar
imoveis[i].calcularValorImovel(0, metros), o método correto (de ImovelNovo ou ImovelVelho)
é executado conforme o tipo real do objeto, mesmo usando a referência do tipo Imovel.

Polimorfismo
Nome da categoria: Universal de inclusão
Classe que foi usada: Imovel.java
Instruções referentes a categoria: Imovel[] imoveis = new Imovel[3];
*/