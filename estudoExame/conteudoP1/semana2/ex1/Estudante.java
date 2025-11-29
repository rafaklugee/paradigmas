public class Estudante {
    // Atributos
    private String nome;
    private int nota;

    // Métodos
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null)
            this.nome = nome;
    }

    public int getNota() {
        return this.nota;
    }

    public void setNota(int nota) {
        if (nota >= 0 && nota <=100)
            this.nota = nota;
    }

    // Outros métodos
    public void exibir() {
        System.out.print("\nNome: " + this.nome);
        System.out.print(" Nota: " + this.nota);
    }
}