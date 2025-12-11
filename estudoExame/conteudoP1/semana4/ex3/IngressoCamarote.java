public class IngressoCamarote extends IngressoVip {
    // Atributo
    private double valorAdicionalCamarote;

    // Construtor
    public IngressoCamarote(double valor, double valorAdicionalVip, double valorAdicionalCamarote) {
        super(valor, valorAdicionalVip);
        this.valorAdicionalCamarote = valorAdicionalCamarote;
    }

    // Método
    public double valorComAdicionalCamarote() {
        double valorComAdicional;
        valorComAdicional = this.valor + this.valorAdicionalVip + this.valorAdicionalCamarote;

        return valorComAdicional;
    }
}