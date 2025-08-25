public class Brinquedo {
    // Atributos
    String nome;
    double alturaMin;
    double preco;

    // Construtores
    public Brinquedo(String nome, double alturaMin, double preco) {
        this.nome = nome;
        this.alturaMin = alturaMin;
        this.preco = preco;
    }

    // Métodos
    public void verificaAltura(double alturaAtual) {
        if (alturaAtual >= alturaMin) {
            System.out.println("Acesso permitido ao brinquedo!");
        } else {
            System.out.println("Acesso negado ao brinquedo!");
        }
    }
}   