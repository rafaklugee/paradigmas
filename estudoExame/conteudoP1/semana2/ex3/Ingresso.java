public class Ingresso {
    // Atributos
    private String nomeFilme;
    private int numSala;
    private double preco;

    // Métodos
    public String getNomeFilme() {
        return this.nomeFilme;
    }

    public void setNomeFilme(String nome) {
        if (nome != null)
            this.nomeFilme = nome;
    }

    public int getNumSala() {
        return this.numSala;
    }

    public void setNumSala(int numSala) {
        if (numSala > 0)
            this.numSala = numSala;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        if (preco > 0)
            this.preco = preco;
    }

    public void exibir() {
        System.out.print("\nNome do filme: " + this.nomeFilme);
        System.out.print("\nNúmero da sala: " + this.numSala);
        System.out.print("\nPreço: " + this.preco);
    }
}