public class PizzaNapolitana extends Pizza {
    // Atributos
        // herdados

    // Construtor
    public PizzaNapolitana(double preco) {
        super("Napolitana", preco);
    }

    // Métodos
    public void descricao() {
        System.out.print("Pizza Napolitana original!\n");
    }

    public int minutosForno() {
        return 18;
    }
}