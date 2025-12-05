public class ImovelVelho extends Imovel {
    // Construtor
    public ImovelVelho(Endereco endereco, double preco) {
        super(endereco, preco);
    }

    // Método
    public double calcularValorImovel() {
        return this.preco * 0.75;
    }
}