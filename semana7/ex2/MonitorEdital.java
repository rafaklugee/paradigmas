public class MonitorEdital extends Monitor {
    // Atributos

    // Construtor
    public MonitorEdital(String nome, String disciplina, int matricula) {
        super(nome, disciplina, matricula);
    }

    // Método
    public void enviarRelatorio(String disciplina) {
        System.out.println("O relatorio da disciplina " + disciplina + " foi enviado com sucesso!");
    }
    
    public void editalExclusivo() {
        System.out.println("Esse é o edital exclusivo de monitoria!");
    }
}