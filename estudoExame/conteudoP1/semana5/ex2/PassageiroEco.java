public class PassageiroEco extends Passageiro {
    // Construtor
    public PassageiroEco(String nome, int numVoo) {
        super(nome, numVoo);
    }

    // Método
    public void despacharMalaPequena() {
        System.out.print("\n[ECO] Despachando mala pequena...");
    }
}