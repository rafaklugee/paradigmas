public abstract class CartaoWeb {
    // Atributos (protegido pois é abstrato)
    protected String destinatario;

    // Construtor
    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }

    // Métodos
    public abstract void retornarMensagem(String remetente);
}