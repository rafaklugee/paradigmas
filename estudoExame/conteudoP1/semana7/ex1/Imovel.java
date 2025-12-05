public abstract class Imovel {
    // Atributos
    protected Endereco endereco;
    protected double preco;

    // Construtor
    public Imovel(Endereco endereco, double preco) {
        this.endereco = endereco;
        // this.setEndereco(endereco);
        this.preco = preco;
        // this.setPreco(preco);
    }

    // Método
    public abstract double calcularValorImovel();
}