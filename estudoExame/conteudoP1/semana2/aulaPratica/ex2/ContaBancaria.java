public class ContaBancaria {
    // Atributos
    private String nome;
    private double saldo;
    private double limite;

    // Métodos
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null)
            this.nome = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0)
            this.saldo = saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        if (limite <= this.saldo)
            this.limite = limite;
    }

    public void depositar(double valor) {
        if (valor > 0)
            this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo && valor <= this.limite && valor > 0)
            this.saldo -= valor;
    }
}