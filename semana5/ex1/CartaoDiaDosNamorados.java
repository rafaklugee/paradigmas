public class CartaoDiaDosNamorados extends CartaoWeb {
    // Atributos

    // Construtor
    public CartaoDiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    // Métodos
    public void retornarMensagem(String remetente) {
        System.out.println("Querida " + this.destinatario + ",");
        System.out.println("Feliz Dia dos Namorados!");
        System.out.println("Espero que esse tenha sido o único cartão do dia dos namorados que tenha ganhado nessa data!");
        System.out.println("De todo meu coração,");
        System.out.println(remetente);
        System.out.println();
    }
}