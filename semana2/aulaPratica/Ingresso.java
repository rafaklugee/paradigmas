public class Ingresso {
    // Atributos
    private String nomeFilme;
    private int numSala, ingressosPorFilme;
    private double preco;

    public String getNomeFilme() {
        return this.nomeFilme;
    }

    public int getNumSala() {
        return this.numSala;
    }

    public int getIngressosPorFilme() {
        return this.ingressosPorFilme;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setNomeFilme(String nomeFilme) {
        if (nomeFilme != null)
            this.nomeFilme = nomeFilme;
    }

    public void setNumSala(int numSala) {
        if (numSala >= 0)
            this.numSala = numSala;
    }

    public void setIngressosPorFilme(int ingressosPorFilme) {
        if (ingressosPorFilme >= 0)
            this.ingressosPorFilme = ingressosPorFilme;
    }

    public void setPreco(double preco) {
        if (preco > 0)
            this.preco = preco;
    }

    public void exibirDados() {
        System.out.println("Nome do filme: " + this.nomeFilme);
        System.out.println("Numero da sala: " + this.numSala);
        System.out.println("Preco: " + this.preco);
    }
}