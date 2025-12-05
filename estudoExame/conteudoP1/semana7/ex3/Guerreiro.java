public class Guerreiro extends Personagem {
    // Construtor
    public Guerreiro(String nome, int nivel, double forcaBase) {
        super(nome, nivel, forcaBase);
    }

    // Método
    public double calcularDano() {
        return this.forcaBase * this.nivel * 1.2;
    }
}