public class Aluno {
    // Atributos
    private String nome;
    private int GRR;

    // Construtores
    public Aluno(String nome) {
        this.setNome(nome);
    }

    public Aluno(String nome, int GRR) {
        this.setNome(nome);
        this.setGRR(GRR);
    }

    // Métodos
    public String getNome() {
        return this.nome;
    }

    public int getGRR() {
        return this.GRR;
    }

    public void setNome(String nome) {
        if (nome != null)
            this.nome = nome;
    }

    public void setGRR(int GRR) {
        if (GRR > 0)
            this.GRR = GRR;
    }
}