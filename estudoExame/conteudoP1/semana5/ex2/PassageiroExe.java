public class PassageiroExe extends Passageiro {
    // Construtor
    public PassageiroExe(String nome, int numVoo) {
        super(nome, numVoo);
    }

    public void acessarSalaVip() {
        System.out.print("\n[EXE] Acessando sala VIP... ");
    }

    public void prioridadeEmbarque() {
        System.out.print("\n[EXE] Esse passageiro tem prioridade de embarque!");
    }
}