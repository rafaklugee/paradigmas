public class CartaoDiaDosNamorados extends CartaoWeb {
    // Construtor
    public CartaoDiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    // Método
    public void retornarMensagem(String remetente) {
        System.out.print("\nFeliz Dia dos Namorados, " + this.destinatario + "!!!");
        System.out.print("\nAssinado: " + remetente + "\n");
    }
}