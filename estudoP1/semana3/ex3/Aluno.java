public class Aluno {
    // Atributos
    private String nome;
    private int GRR;

    // Construtores
    public Aluno(String nome, int GRR) {
        if (nome != null)
            this.nome = nome;
        if (GRR > 0)
            this.GRR = GRR;
    }

    // Métodos
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null)
            this.nome = nome;
    }

    public int getGRR() {
        return this.GRR;
    }

    public void setGRR(int GRR) {
        if (GRR > 0)
            this.GRR = GRR;
    }
}