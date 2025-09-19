public abstract class Imovel {
    // Atributos
    String endereco;
    double preco;

    // Construtor
    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    // Método
    public abstract void calcularValorImovel(double preco, double metros);
    //public void calcularValorImovel(double preco, double metros) {
    //    double valormetro = x;
    //    preco = valormetro * metros;
    //    
    //    this.preco = preco;
    //}
}