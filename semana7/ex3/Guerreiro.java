public class Guerreiro extends Personagem {
    // Atributos

    // Construtor
    public Guerreiro(String nome, int nivel, int forca) {
        super(nome, nivel, forca);
    }

    // Método
    public void calcularDano() {
        this.dano = forca * nivel * 1.2;
    }
}