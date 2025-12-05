public abstract class Personagem implements Comparable<Personagem>{
    // Atributos
    protected String nome;
    protected int nivel;
    protected double forcaBase;

    // Construtor
    public Personagem(String nome, int nivel, double forcaBase) {
        this.nome = nome;
        // this.setNome(nome);
        this.nivel = nivel;
        // this.setNivel(nivel);
        this.forcaBase = forcaBase;
        // this.setForcaBase(forcaBase);
    }

    // Métodos
    public abstract double calcularDano();

    public String getNome() {
        return this.nome;
    }

    public int compareTo(Personagem p) {
        int resultado = Integer.compare(this.nivel, p.nivel);
        if (resultado == 0)
            resultado = this.nome.compareTo(p.nome);

        return resultado;
    }
}