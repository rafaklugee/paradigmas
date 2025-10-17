public class Ingresso {
    // Atributo (protected pois é super classe)
    protected double valor;

    // Construtor
    public Ingresso(double valor) {
        if (valor > 0)
            this.valor = valor;
    }

    // Método
    public void imprimirValor() {
        System.out.println("[NORMAL] Valor do ingresso: " + this.valor);
    }
}