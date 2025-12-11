import java.util.*;

public class Forno {
    // Atributos
    protected ArrayList<Pizza> forno = new ArrayList<>();

    // Construtor
    
    // Métodos
    public void adicionarPizza(Pizza p) {
        forno.add(p);
    }

    public void assar() {
        System.out.print("\n=== FORNO DE PIZZAS ===");
        for (Pizza p : forno) {
            System.out.print("\nAssando pizza: " + p.getSabor());
            System.out.print("\nTempo de forno: " + p.minutosForno());
            System.out.print("\n");
        }
    }
}