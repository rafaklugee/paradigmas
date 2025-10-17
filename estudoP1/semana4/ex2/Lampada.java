public class Lampada {
    // Atributo (protected pois é super classe)
    protected boolean estado;

    // Construtor
    public Lampada(boolean estado) {
        if (estado == true || estado == false)
            this.estado = estado;
    }

    // Método
    public void ligaDesliga() {
        this.estado = !this.estado;
    }
}