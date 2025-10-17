public class LampadaFluorescente extends Lampada {
    // Atributos
    private int comprimento;

    // Construtor
    public LampadaFluorescente(boolean estado, int comprimento) {
        super(estado);
        if (comprimento > 0)
            this.comprimento = comprimento;
    }

    // Método
    public void estado() {
        if (this.estado == true)
            System.out.println("A lâmpada fluorescente está ligada.");
        else
            System.out.println("A lâmpada fluorescente está desligada.");
    }
}