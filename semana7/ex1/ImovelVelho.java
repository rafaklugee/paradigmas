public class ImovelVelho extends Imovel {
    // Atributos

    // Construtor
    public ImovelVelho(String endereco, double preco) {
        super(endereco, preco);
    }

    // Método
    public void calcularValorImovel(double preco, double metros) {
        double valormetro = 3000;
        preco = valormetro * metros;
        
        this.preco = preco;
    }
}