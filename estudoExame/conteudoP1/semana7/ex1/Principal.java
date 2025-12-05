public class Principal {
    public static void main(String[] args) {
        Imovel[] imoveis = new Imovel[2];

        Endereco endereco = new Endereco("Rua Sanito Rocha", 79, "Bairro Cristo Rei", "Cidade Curitiba", "Estado Paraná");

        // Polimorfismo (Universal) de inclusão
        imoveis[0] = new ImovelVelho(endereco, 500000);
        imoveis[1] = new ImovelNovo(endereco, 500000);

        double precoi1, precoi2;
        
        precoi1 = imoveis[0].calcularValorImovel();
        precoi2 = imoveis[1].calcularValorImovel();

        for (int i = 0; i < 2; i++) {
            if (i == 0)
                System.out.print("\nO preço do imóvel velho é: " + precoi1);
            else
                System.out.print("\nO preço do imóvel novo é: " + precoi2 + "\n");
        }
    }
}