public class MonitorEdital extends Monitor {
    // Construtor
    public MonitorEdital(String nome, String disciplina, int matricula) {
        super(nome, disciplina, matricula);
    }

    // Métodos
    public void metodo() {
        System.out.print("\nO método dos monitores de edital é: Mostrar exemplos");
    }

    public void relatorioAtividades() {
        System.out.print("\nEsse monitor precisa mandar relatório de atividades!");
    }
}