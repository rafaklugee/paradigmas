public class Mago extends Personagem {
    // Construtor
    public Mago(String nome, int nivel, double forcaBase) {
        super(nome, nivel, forcaBase);
    }

    // Método
    public double calcularDano() {
        return this.forcaBase * this.nivel * 1.5 - 10;
    }
}