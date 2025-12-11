public class Principal {
    public static void main(String[] args) {
        Forno forno = new Forno();

        // Modo 1
        Pizza[] pizzas = new Pizza[2];

        // Polimorfismo de inclusão e coerção upcast
        pizzas[0] = new PizzaDeQueijo(50.99);
        pizzas[1] = new PizzaNapolitana(65.99);

        // Polimorfismo de inclusão 
        // (PizzaDeQueijo e PizzaNapolitana(subclasse) são tratados apenas como Pizza(superclasse))
        forno.adicionarPizza(pizzas[0]);
        forno.adicionarPizza(pizzas[1]);

        forno.assar(pizzas[0]);
        forno.assar(pizzas[1]);

        // Modo 2
        // Polimorfismo de inclusão e coerção upcast
        //Pizza pizza1 = new PizzaDeQueijo(50.99);
        //Pizza pizza2 = new PizzaNapolitana(65.99);

        //// Polimorfismo de inclusão 
        //// (PizzaDeQueijo e PizzaNapolitana(subclasse) são tratados apenas como Pizza(superclasse))
        //forno.adicionarPizza(pizza1);
        //forno.adicionarPizza(pizza2);

        //forno.assar(pizza1);
        //forno.assar(pizza2);
    }
}