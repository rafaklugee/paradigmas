public class PizzaNapolitana extends Pizza {
    // Atributos
        // herdados

    // Construtor
    public PizzaNapolitana(double preco) {
        super("Napolitana", preco);
    }

    // Métodos
    public void preparar() {
        System.out.print("... Preparando Pizza Napolitana ...\n");
    }

    public int minutosForno() {
        return 18;
    }
}