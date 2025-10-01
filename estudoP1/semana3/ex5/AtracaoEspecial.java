public class AtracaoEspecial {
    // Atributos
    private String nomeAtracao;
    private int capacidadeMax;
    private int qtdPresentes;

    // Construtor
    public AtracaoEspecial(String nomeAtracao, int capacidadeMax, int qtdPresentes) {
        this.nomeAtracao = nomeAtracao;
        this.capacidadeMax = capacidadeMax;
        this.qtdPresentes = qtdPresentes;
    }

    // Método
    public void ultrapassouCap() {
        if (this.qtdPresentes > this.capacidadeMax)
            System.out.println("O número de pessoas ultrapassou a capacidade máxima!");
        else
            System.out.println("A capacidade máxima ainda não foi atingida");
    }
}