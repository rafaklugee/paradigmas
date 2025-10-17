public class MonitorPET extends Monitor {
    // Atributos

    // Construtor
    public MonitorPET(String nome, String disciplina, int matricula) {
        super(nome, disciplina, matricula);
    }

    // Método
    public void enviarRelatorio(String disciplina) {
        System.out.println("Com base no monitor, não é preciso relatório para disciplina de " + disciplina + "!");
    }

    public void petExclusivo() {
        System.out.println("Esse edital é exclusivo para alunos petianos!");
    }
}