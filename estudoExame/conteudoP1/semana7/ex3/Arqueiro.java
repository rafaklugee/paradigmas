public class Arqueiro extends Personagem {
    // Construtor
    public Arqueiro(String nome, int nivel, double forcaBase) {
        super(nome, nivel, forcaBase);
    }

    // Método
    public double calcularDano() {
        return this.forcaBase * this.nivel + 15;
    }
}