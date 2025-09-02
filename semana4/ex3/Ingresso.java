public class Ingresso {
    // Atributo
    protected double valor;

    // Construtor
    public Ingresso(double valor) {
        this.valor = valor;
    }

    // Método
    public void imprimirValor() {
        System.out.println("O valor do ingresso é: " + this.valor);
    }
}