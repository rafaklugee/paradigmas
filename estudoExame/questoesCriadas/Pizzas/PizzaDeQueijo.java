public class PizzaDeQueijo extends Pizza {
    // Atributos
        // herdados

    // Construtor
    public PizzaDeQueijo(double preco) {
        super("De Queijo", preco);
    }

    // Métodos
    public void preparar() {
        System.out.print("... Preparando Pizza de Queijo ...\n");
    }

    public int minutosForno() {
        return 15;
    }
}