public class ImovelNovo extends Imovel {
    // Construtor
    public ImovelNovo(Endereco endereco, double preco) {
        super(endereco, preco);
    }

    // Método
    public double calcularValorImovel() {
        return this.preco * 1.5;
    }
}