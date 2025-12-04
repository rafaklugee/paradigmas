public class CartaoNatal extends CartaoWeb {
    // Construtor
    public CartaoNatal(String destinatario) {
        super(destinatario);
    }

    // Método
    public void retornarMensagem(String remetente) {
        System.out.print("\nFeliz Natal, " + this.destinatario + "!!!");
        System.out.print("\nAssinado: " + remetente + "\n");
    }
}