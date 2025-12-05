public class MonitorPET extends Monitor {
    // Construtor
    public MonitorPET(String nome, String disciplina, int matricula) {
        super(nome, disciplina, matricula);
    }

    // Métodos
    public void metodo() {
        System.out.print("\nO método dos monitores do PET é: Resolver exercícios");
    }

    public void relatorioAtividades() {
        System.out.print("\nEsse monitor não precisa mandar relatório de atividades.");
    }
}