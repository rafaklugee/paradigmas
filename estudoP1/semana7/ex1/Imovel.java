public abstract class Imovel {
    // Atributos (protegido pois é abstrato)
    protected Endereco endereco;
    protected double preco;

    // Construtor
    public Imovel(Endereco endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    // Método
    public abstract double calcularValorImovel();
}