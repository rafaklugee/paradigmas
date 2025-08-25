public class Atracao {
    // Atributos
    String nome;
    int capacidade;
    int pessoasPresentes;

    // Construtores
    public Atracao(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.pessoasPresentes = 0;
    }

    // Métodos
    public void verificaCapacidade(int pessoasPresentes) {
        if (pessoasPresentes < capacidade) {
            System.out.println("Acesso permitido à atração!");
        } else {
            System.out.println("Acesso negado à atração!");
        }
    }
}