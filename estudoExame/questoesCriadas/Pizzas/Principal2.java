public class Principal2 {
    public static void main(String[] args) {
        Forno forno = new Forno();

        // Polimorfismo de inclusão e coerção upcast
        Pizza pizza1 = new PizzaDeQueijo(50.99);
        Pizza pizza2 = new PizzaNapolitana(65.99);

        // Polimorfismo de inclusão 
        // (PizzaDeQueijo e PizzaNapolitana(subclasse) são tratados apenas como Pizza(superclasse))
        forno.adicionarPizza(pizza1);
        forno.adicionarPizza(pizza2);

        forno.assar();
    }
}