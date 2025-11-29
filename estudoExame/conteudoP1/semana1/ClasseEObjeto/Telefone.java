public class Telefone {
    // Atributos
    int codigoPais;
    int codigoArea;
    int numero;

    // Construtor
    public Telefone (int codigoPais, int codigoArea, int numero) {
        this.codigoPais = codigoPais;
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    // Métodos
    public void exibir () {
        System.out.print("\nExibindo: " +  "+" + codigoPais + "(" + codigoArea + ")" + numero);
    }
}