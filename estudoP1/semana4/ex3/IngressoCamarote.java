public class IngressoCamarote extends IngressoVip {
    // Atributos
    private double valorAdicional2;

    // Construtor
    public IngressoCamarote(double valor, double valorAdicional, double valorAdicional2) {
        super(valor, valorAdicional);
        if (valorAdicional2 > 0)
            this.valorAdicional2 = valorAdicional2;
    }

    // Método
    public void imprimirValor() {
        double total = this.valor + this.valorAdicional + this.valorAdicional2;
        System.out.println("[CAMAROTE] Valor do ingresso: " + total);
    }
}