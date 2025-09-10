public abstract class Passageiro {
    // Atributos
    String nome;
    int numeroVoo;

    // Construtor
    public Passageiro(String nome, int numeroVoo) {
        this.nome = nome;
        this.numeroVoo = numeroVoo;
    }

    // Métodos
    public abstract void dadosVoo(String nome, int numeroVoo);
}