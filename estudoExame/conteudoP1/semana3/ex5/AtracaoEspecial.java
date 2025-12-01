public class AtracaoEspecial {
    // Atributos
    private String nomeAtracao;
    private int capacidadeMax;
    private int qtdePessoas;

    // Construtor
    public AtracaoEspecial(String nomeAtracao, int capacidadeMax, int qtdePessoas) {
        this.setNomeAtracao(nomeAtracao);
        this.setCapacidadeMax(capacidadeMax);
        this.setQtdePessoas(qtdePessoas);
    }

    // Métodos
    public String getNomeAtracao() {
        return this.nomeAtracao;
    }

    public void setNomeAtracao(String nomeAtracao) {
        if (nomeAtracao != null)
            this.nomeAtracao = nomeAtracao;
    }

    public int getCapacidadeMax() {
        return this.capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        if (capacidadeMax > 0)
            this.capacidadeMax = capacidadeMax;
    }

    public int getQtdePessoas() {
        return this.qtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        if (qtdePessoas > 0)
            this.qtdePessoas = qtdePessoas;
    }

    public void verificaCapacidadeMax() {
        if (this.qtdePessoas > this.capacidadeMax)
            System.out.print("\nUltrapassou a quantidade máxima de pessoas.");
        else
            System.out.print("\nNão ultrapassou a quantidade máxima de pessoas.");
    }

    public void adicionarPessoas(int qtde) {
        if (this.qtdePessoas + qtde <= this.capacidadeMax)
            this.qtdePessoas += qtde;
        else
            System.out.print("\nNão foi possível adicionar essa quantidade de pessoas.");
    } 
}