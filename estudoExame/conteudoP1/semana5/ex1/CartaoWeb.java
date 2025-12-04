public abstract class CartaoWeb {
    // Atributo
    protected String destinatario;

    // Construtor
    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
        // this.setDestinatario(destinatario);
    }

    public abstract void retornarMensagem(String remetente);
}