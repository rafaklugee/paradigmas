public class PassageiroEco extends Passageiro {
    // Atributos
        // herdados

    // Construtor
    public PassageiroEco(String nome, int numeroVoo) {
        super(nome, numeroVoo);
    }

    // Método
    public void ecoEmbarque() {
        System.out.println("[ECO] Despachando mala pequena!");
    }
}