public class IngressoVip extends Ingresso {
    // Atributo
    protected double valorAdicionalVip;

    // Construtor
    public IngressoVip(double valor, double valorAdicionalVip) {
        super(valor);
        this.valorAdicionalVip = valorAdicionalVip;
    }

    public double valorComAdicionalVip() {
        double valorComAdicional;
        valorComAdicional = this.valor + this.valorAdicionalVip;

        return valorComAdicional;
    }
}