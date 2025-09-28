public class Mago extends Personagem {
    // Atributos
        // herdados

    // Construtor
    public Mago(String nome, int nivel, int forcaBase) {
        super(nome, nivel, forcaBase);
    }

    // Método
    public double calcularDano() {
        double dano;
        dano = this.forcaBase * this.nivel * 1.5 - 10;

        return dano;
    }
}