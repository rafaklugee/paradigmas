public class Mago extends Personagem {
    // Atributos

    // Construtor
    public Mago(String nome, int nivel, int forca) {
        super(nome, nivel, forca);
    }

    // Método
    public void calcularDano() {
        this.dano = forca * nivel * 1.5 - 10;
    }
}