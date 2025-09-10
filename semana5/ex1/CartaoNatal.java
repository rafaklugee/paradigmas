public class CartaoNatal extends CartaoWeb {
    // Atributos

    // Construtor
    public CartaoNatal(String destinatario) {
        super(destinatario);
    }

    // Métodos
    public void retornarMensagem(String remetente) {
        System.out.println("Feliz e aconchegante Natal " + this.destinatario + "!");
        System.out.println("Assinado: " + remetente);
    }
}