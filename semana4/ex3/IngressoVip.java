public class IngressoVip extends Ingresso {
    // Atributo
    double valorAdicional;

    // Construtor
    public IngressoVip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    // Métodos
    public double adicionar(double valorAdicional) {
        double total;
        total = this.valor;
        if(valorAdicional > 0)
            total += valorAdicional;

        return total;
    }

    public void setValorVip(double total) {
        this.valor = total; // usa o atributo da classe base
    }
}