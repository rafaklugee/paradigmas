public class Pessoa {
    // Atributos
    String nome;
    int idade;
    int dia;
    int mes;
    int ano;

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Métodos
    public void ajustarDataDeNascimento(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String retornarNome() {
        return this.nome;
    }

    public int retornarIdade() {
        return this.idade;
    }

    public void calcularIdade(int dia, int mes, int ano) {
        this.idade = ano - this.ano;
    }
}