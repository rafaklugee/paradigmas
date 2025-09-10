public class CartaoAniversario extends CartaoWeb {
    // Atributos

    // Construtor
    public CartaoAniversario(String destinatario) {
        super(destinatario);
    }

    // Métodos
    public void retornarMensagem(String remetente) {
        System.out.println("Feliz aniversário " + this.destinatario + "!!!");
        System.out.println("Assinado: " + remetente);
        System.out.println();
    }
}