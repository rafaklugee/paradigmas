public abstract class Passageiro {
    // Atributos
    protected String nome;
    protected int numVoo;

    // Construtor
    public Passageiro(String nome, int numVoo) {
        this.nome = nome;
        this.numVoo = numVoo;
    }

    // Métodos
    public void prioridadeEmbarque() {
        System.out.print("\nA prioridade de embarque é normal.");
    }
}