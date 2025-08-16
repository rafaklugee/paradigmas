public class ContaBancaria {
    // Atributos
    private String titular;
    private double saldo;
    private double limite;

    // Métodos (get e set)
    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setTitular(String titular) {
        if (titular != null)
            this.titular = titular;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0)
            this.saldo = saldo;
    }

    public void setLimite(double limite, double saldo) {
        if (limite <= saldo)
            this.limite = limite;
    }

    // Outros métodos 
    // Depositar
    public void adicionarSaldo(double saldoAdicionar) {
        if (saldoAdicionar > 0)
            this.saldo += saldoAdicionar;
    }

    // Sacar
    public void sacarSaldo(double saldoSacar, double saldo) {
        if (saldoSacar > 0 && saldoSacar <= saldo)
            this.saldo -= saldoSacar;
    }
}