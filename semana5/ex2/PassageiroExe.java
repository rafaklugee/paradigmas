public class PassageiroExe extends Passageiro {
    // Atributos

    // Construtor
    public PassageiroExe(String nome, int numeroVoo) {
        super(nome, numeroVoo);
    }

    // Métodos
    public void dadosVoo(String nome, int numeroVoo) {
        System.out.println("Nome: " + nome);
        System.out.println("Número do voo: " + numeroVoo);
        System.out.println("Você está na classe executiva.");
    }
}