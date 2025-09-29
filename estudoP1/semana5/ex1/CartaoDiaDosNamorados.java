public class CartaoDiaDosNamorados extends CartaoWeb {
    // Atributo
        // herdado

    // Construtor
    public CartaoDiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    // Método
    public void retornarMensagem(String remetente) {
        System.out.println("Feliz dia dos namorados " + this.destinatario + "!!!");
        System.out.println("Assinado: " + remetente);
    }
}