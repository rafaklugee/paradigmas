public class CartaoNatal extends CartaoWeb {
    // Atributo
        // herdado

    // Construtor
    public CartaoNatal(String destinatario) {
        super(destinatario);
    }

    // Método
    public void retornarMensagem(String remetente) {
        System.out.println("Feliz Natal " + this.destinatario + "!!!");
        System.out.println("Assinado: " + remetente);
    }
}