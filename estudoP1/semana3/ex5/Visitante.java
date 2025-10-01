public class Visitante {
    // Atributos
    private String nome;
    private int idade;
    private double saldo;

    public Visitante(String nome, int idade, double saldo) {
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
    }

    // Método
    public void compraDeIngresso(int valor) {
        this.saldo -= valor;
        System.out.println("Seu saldo agora é: R$" + this.saldo);
    }
}