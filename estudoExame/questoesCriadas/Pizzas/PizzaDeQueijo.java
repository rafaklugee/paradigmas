public class PizzaDeQueijo extends Pizza {
    // Atributos
        // herdados

    // Construtor
    public PizzaDeQueijo(double preco) {
        super("De Queijo", preco);
    }

    // Métodos
    public void descricao() {
        System.out.print("Pizza com o melhor queijo da região!\n");
    }

    public int minutosForno() {
        return 15;
    }
}