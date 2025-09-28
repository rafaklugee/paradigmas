public class ImovelVelho extends Imovel {
    // Atributos
        // herdados

    // Construtor
    public ImovelVelho(Endereco endereco, double preco) {
        super(endereco, preco);
    }

    // Método
    public double calcularValorImovel() {
        double metrosImovel = 156;
        double precoVelho = metrosImovel * this.preco;

        return precoVelho;
    }
}