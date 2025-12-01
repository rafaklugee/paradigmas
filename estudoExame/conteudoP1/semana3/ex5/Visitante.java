public class Visitante {
    // Atributos
    private String nome;
    private int idade;
    private double saldo;
    private double altura;

    // Construtor
    public Visitante(String nome, int idade, double saldo, double altura) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSaldo(saldo);
        this.setAltura(altura);
    }

    // Métodos
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setNome(String nome) {
        if (nome != null)
            this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 0)
            this.idade = idade;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0)
            this.saldo = saldo;
    }

    public void setAltura(double altura) {
        if (altura > 0)
            this.altura = altura;
    }

    public void comprarIngresso(double valorIngresso) {
        if (valorIngresso <= this.saldo)
            this.saldo -= valorIngresso;
        else
            System.out.print("Você não tem saldo suficiente.");
    }
}