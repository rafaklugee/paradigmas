public class ImovelNovo extends Imovel {
    // Atributos

    // Construtor
    public ImovelNovo(String endereco, double preco) {
        super(endereco, preco);
    }

    // Método
    public void calcularValorImovel(double preco, double metros) {
        double valormetro = 8315;
        preco = valormetro * metros;
        
        this.preco = preco;
    }
}