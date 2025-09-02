public class IngressoCamarote extends IngressoVip {
    // Atributo
    double valorAdicionalCamarote;

    // Construtor
    public IngressoCamarote(double valor, double valorAdicional, double valorAdicionalCamarote) {
        super(valor, valorAdicional);
        this.valorAdicionalCamarote = valorAdicionalCamarote;
    }

    // Métodos
    public double addValorCamarote(double valorAdicionalCamarote) {
        double total;
        total = this.valor + this.valorAdicional;
        if(valorAdicionalCamarote > 0)
            total += valorAdicionalCamarote;

        return total;
    }
    
    public void setValorCamarote(double total) {
        this.valor = total; // usa o atributo da classe base
    }
}