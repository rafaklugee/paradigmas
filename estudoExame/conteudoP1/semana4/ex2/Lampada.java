public class Lampada {
    // Atributo
    protected boolean ativo;

    // Construtor
    public Lampada(boolean ativo) {
        this.ativo = ativo;
    }

    // Métodos
    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        if (ativo == true || ativo == false)
            this.ativo = ativo;
    }

    public void ligaDesliga() {
        if (this.ativo == true)
            this.ativo = false;
        else
            this.ativo = true;
    }

}