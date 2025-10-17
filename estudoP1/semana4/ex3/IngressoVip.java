public class IngressoVip extends Ingresso {
    // Atributos
    double valorAdicional;

    // Construtor
    public IngressoVip(double valor, double valorAdicional) {
        super(valor);
        if (valorAdicional > 0)
            this.valorAdicional = valorAdicional;
    }

    // Método
    public void imprimirValor() {
        double total = this.valor + this.valorAdicional;
        System.out.println("[VIP] Valor do ingresso: " + total);
    }
}