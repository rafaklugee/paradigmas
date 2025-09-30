public class LampadaLed extends Lampada {
    // Atributo

    // Construtor
    public LampadaLed(boolean estado) {
        super(estado);
    }

    // Método
    public void estado() {
        if (this.estado == true)
            System.out.println("A lâmpada led está ligada.");
        else
            System.out.println("A lâmpada led está desligada.");
    }
}