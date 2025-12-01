public class Brinquedo {
    // Atributos
    private String nomeBrinquedo;
    private double alturaMin;
    private double preco;

    // Construtor
    public Brinquedo(String nomeBrinquedo, double alturaMin, double preco) {
        this.setNomeBrinquedo(nomeBrinquedo);
        this.setAlturaMin(alturaMin);
        this.setPreco(preco);
    }

    // Métodos
    public String getNomeBrinquedo() {
        return this.nomeBrinquedo;
    }

    public double getAlturaMin() {
        return this.alturaMin;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setNomeBrinquedo(String nomeBrinquedo) {
        if (nomeBrinquedo != null)
            this.nomeBrinquedo = nomeBrinquedo;
    }

    public void setAlturaMin(double alturaMin) {
        if (alturaMin > 0)
            this.alturaMin = alturaMin;
    }

    public void setPreco(double preco) {
        if (preco > 0)
            this.preco = preco;
    }

    public void verificaAltura(double alturaPessoa) {
        if (this.alturaMin <= alturaPessoa)
            System.out.print("\nPossui altura mínima para usar: " + this.nomeBrinquedo + ".");
        else
            System.out.print("\nNão possui altura mínima para usar: " + this.nomeBrinquedo + ".");
    }
}