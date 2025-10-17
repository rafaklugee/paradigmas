public class MonitorPET extends Monitor {
    // Atributos
        // herdados

    // Construtor
    public MonitorPET(String nome, int matricula, String disciplina) {
        super(nome, matricula, disciplina);
    }

    // Método
    public void relatorioAtividades() {
        System.out.println("[PET] " + this.nome + " não precisa mandar relatório.");
    }
}