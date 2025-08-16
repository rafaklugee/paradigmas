public class Estudante {
    // Atributos
    private String nome;
    private double notaFinal;

    // Métodos (get e set)
    public String getNome() {
        return this.nome;
    }

    public double getNotaFinal() {
        return this.notaFinal;
    }

    public void setNome(String nome) {
        if (nome != null)
            this.nome = nome;
    }

    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0 && notaFinal <= 100)
            this.notaFinal = notaFinal;
    }

    // Outros métodos
    public void exibirDados() {
        System.out.println("Nome: " + this.nome + "\nNota Final: " + this.notaFinal);
    }
}