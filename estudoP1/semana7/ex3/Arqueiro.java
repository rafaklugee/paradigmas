public class Arqueiro extends Personagem {
    // Atributos
        // herdados

    // Construtor
    public Arqueiro(String nome, int nivel, int forcaBase) {
        super(nome, nivel, forcaBase);
    }

    // Método
    public double calcularDano() {
        double dano;
        dano = this.forcaBase * this.nivel + 15;

        return dano;
    }
}