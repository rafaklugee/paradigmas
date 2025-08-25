public class Aluno {
    // Atributos
    private String nome;
    private double CR;

    // Construtores
    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, double CR) {
        this.nome = nome;
        this.CR = CR;
    }

    // Métodos
    public String getNome() {
        return this.nome;
    }

    public double getCR() {
        return this.CR;
    }

    public void setNome(String nome) {
        if(nome != null)
            this.nome = nome;
    }

    public void setCR(int CR) {
        if(CR >= 0)
            this.CR = CR;
    }
}