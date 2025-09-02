public class Lampada {
    // Atributos
    protected boolean estado;

    // Construtores
    public Lampada(boolean estado) {
        this.estado = estado;
    }

    // Métodos
    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void ligaDesliga(boolean estado) {
        if(estado == true)
            this.estado = true; // Ligada
        else
            this.estado = false; // Desligada
    }
}