public abstract class Personagem implements Comparable<Personagem>{
    // Atributos (protected pois é abstrato)
    String nome;
    int nivel;
    int forcaBase;

    // Construtor
    public Personagem(String nome, int nivel, int forcaBase) {
        this.nome = nome;
        this.nivel = nivel;
        this.forcaBase = forcaBase;
    }

    // Métodos
    public abstract double calcularDano();

    public String getNome() {
        return nome;
    }

    public int compareTo(Personagem p) {
        int resultado = Integer.compare(this.nivel, p.nivel);
        if (resultado == 0)
            resultado = this.nome.compareTo(p.nome);

        return resultado;
    }
}