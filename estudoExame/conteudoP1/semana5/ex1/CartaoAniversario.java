public class CartaoAniversario extends CartaoWeb {
    // Construtor
    public CartaoAniversario(String destinatario) {
        super(destinatario);
    }

    // Método
    public void retornarMensagem(String remetente) {
        System.out.print("\nFeliz Aniversário, " + this.destinatario + "!!!");
        System.out.print("\nAssinado: " + remetente + "\n");
    }
}