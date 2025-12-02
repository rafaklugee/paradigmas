public class Ingresso {
    // Atributo
    protected double valor;

    // Construtor
    public Ingresso(double valor) {
        this.valor = valor;
    }

    // Método
    public void imprimirValor() {
        System.out.print("\nValor do ingresso: " + this.valor);
    }
}