public abstract class Personagem {
    // Atributos
    protected String nome;
    protected int nivel;
    protected int forca;
    protected double dano;

    // Construtor
    public Personagem(String nome, int nivel, int forca) {
        this.nome = nome;
        this.nivel = nivel;
        this.forca = forca;
    }

    // Método
    public abstract void calcularDano();
}