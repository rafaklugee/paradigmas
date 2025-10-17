public abstract class CartaoWeb {
    // Atributo (protected pois é abstrato)
    protected String destinatario;

    // Construtor
    public CartaoWeb(String destinatario) {
        if (destinatario != null)
            this.destinatario = destinatario;
    }

    // Método
    public abstract void retornarMensagem(String remetente);
}