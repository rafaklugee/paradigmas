public class Arqueiro extends Personagem {
    // Atributos

    // Construtor
    public Arqueiro(String nome, int nivel, int forca) {
        super(nome, nivel, forca);
    }

    // Método
    public void calcularDano() {
        this.dano = forca * nivel + 15;
    }
}