public class Contador {
    // Atributos
    private int contagem;

    // Métodos
    public int getContagem() {
        return this.contagem;
    }

    public void setContagem(int contagem) {
        if (contagem >= 0)
            this.contagem = contagem;
    }


    public void zerarContagem() {
        this.contagem = 0;
    }

    public void incrementarContagem() {
        if (this.contagem >= 0)
            this.contagem++;
    }

    public void decrementarContagem() {
        if (this.contagem > 0)
            this.contagem--;
    }
}