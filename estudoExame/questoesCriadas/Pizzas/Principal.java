public class Principal {
    public static void main(String[] args) {
        Pizza[] pizzas = new Pizza[2];
        
        // Polimorfismo de inclusão e de coerção upcast
        pizzas[0] = new PizzaDeQueijo(50.99);
        pizzas[1] = new PizzaNapolitana(65.99);

        // Polimorfismo de coerção downcast
        if (pizzas[0] instanceof PizzaDeQueijo) {
            PizzaDeQueijo pizzaqueijo = (PizzaDeQueijo) pizzas[0];
            pizzaqueijo.descricao();
        }

        // Polimorfismo de coerção downcast
        if (pizzas[1] instanceof PizzaNapolitana) {
            PizzaNapolitana pizzanapolitana = (PizzaNapolitana) pizzas[1];
            pizzanapolitana.descricao();
        }
    }
}