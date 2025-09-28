public class ImovelNovo extends Imovel {
    // Atributos
        // herdados

    // Construtor
    public ImovelNovo(Endereco endereco, double preco) {
        super(endereco, preco);
    }

    // Método
    public double calcularValorImovel() {
        double metrosImovel = 156;
        double precoNovo = metrosImovel * this.preco;

        return precoNovo;
    }
}