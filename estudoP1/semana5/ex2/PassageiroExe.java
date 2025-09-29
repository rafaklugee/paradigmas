public class PassageiroExe extends Passageiro implements Privilegios {
    // Atributos
        // herdados

    // Construtor
    public PassageiroExe(String nome, int numeroVoo) {
        super(nome, numeroVoo);
    }

    // Métodos
    public void salaVip() {
        System.out.println("[EXE] Entrando na sala VIP!");
    }

    public void prioridadeEmbarque() {
        System.out.println("[EXE] Você tem prioridade de embarque!");
    }
}