public class MonitorEdital extends Monitor {
    // Atributos
        // herdados

    // Construtor
    public MonitorEdital(String nome, int matricula, String disciplina) {
        super(nome, matricula, disciplina);
    }

    // Método
    public void relatorioAtividades() {
        System.out.println("[EDITAL] " + this.nome + " precisa mandar um relatório.");
    }
}