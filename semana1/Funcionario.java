public class Funcionario {
    String nome;
    int ano;
    double salario;

    public void cadastrar(String nome, int ano, double salario) {
        this.nome = nome;
        this.ano = ano;
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("Nome" + this.nome);
        System.out.println("Ano: " + this.ano);
        System.out.println("Salario: " + this.salario);
    }
}