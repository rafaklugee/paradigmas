public class CartaoAniversario extends CartaoWeb {
    // Atributo
        // herdado

    // Construtor
    public CartaoAniversario(String destinatario) {
        super(destinatario);
    }

    // Método
    public void retornarMensagem(String remetente) {
        System.out.println("Feliz aniversário " + this.destinatario + "!!!");
        System.out.println("Assinado: " + remetente);
    }
}