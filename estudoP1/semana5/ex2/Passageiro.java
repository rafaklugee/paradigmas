public abstract class Passageiro {
    // Atributos (protegido pois é abstract)
    String nome;
    int numeroVoo;

    // Construtor
    public Passageiro(String nome, int numeroVoo) {
        if (nome != null)
            this.nome = nome;
        if (numeroVoo > 0)
            this.numeroVoo = numeroVoo;
    }

    // Métodos
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null)
            this.nome = nome;
    }

    public int getNumeroVoo() {
        return this.numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        if (numeroVoo > 0) {
            this.numeroVoo = numeroVoo;
        }
    }

    // Tem implementação, portanto não é abstrato
    public void preEmbarque() {
        System.out.println("[GERAL] Fazendo check-in...");
        System.out.println("[GERAL] Passando pelo controle de segurança...");
    }
}