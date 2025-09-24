public class Visitante {
    // Atributos
    String nome;
    double saldo;
    int idade;
    double altura;

    // Construtores
    public Visitante(String nome, double saldo, int idade, double altura) {
        this.nome = nome;
        this.saldo = saldo;
        this.idade = idade;
        this.altura = altura;
    }

    // Métodos
    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void reduzSaldo(double valor) {
        this.saldo -= valor;
    }
}