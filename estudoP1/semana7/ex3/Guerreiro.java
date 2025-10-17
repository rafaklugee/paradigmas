public class Guerreiro extends Personagem {
    // Atributos
        // herdados

    // Construtor
    public Guerreiro(String nome, int nivel, int forcaBase) {
        super(nome, nivel, forcaBase);
    }

    // Método
    public double calcularDano() {
        double dano;
        dano = this.forcaBase * this.nivel * 1.2;

        return dano;
    }
}