public abstract class Pizza {
    // Atributos
    protected String sabor;
    protected double preco;

    // Construtor

    // Polimorfismo de sobrecarga(construtor)
    public Pizza(String sabor) {
        this(sabor, 0.0);
    }

    public Pizza(double preco) {
        this("", preco);
    }

    public Pizza(String sabor, double preco) {
        this.setSabor(sabor);
        this.setPreco(preco);
    }

    // Métodos
    public void setSabor(String sabor) {
        if (sabor != null)
            this.sabor = sabor;
    }

    public void setPreco(double preco) {
        if (preco > 0)
            this.preco = preco;
    }

    public String getSabor() {
        return this.sabor;
    }

    public double getPreco() {
        return this.preco;
    }

    public abstract void descricao();
    public abstract int minutosForno();
}