public class IngressoNormal extends Ingresso {
    // Atributo

    // Construtor
    public IngressoNormal(double valor) {
        super(valor);
    }

    // Método
    public void imprimirValor() {
        super.imprimirValor();
        System.out.println("[NORMAL] Esse ingresso é normal.");
    }
}