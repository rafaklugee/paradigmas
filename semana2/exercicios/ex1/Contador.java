public class Contador {
    // Atributos
    private int contador;

    // Métodos
    public int getValorAtual() {
        return this.contador;
    }

    public void setValorContador(int contador) {
        if (contador >= 0)
            this.contador = contador;
    }

    public void zerarContador() {
        this.contador = 0;
    }

    public void incrementaContador() {
        this.contador++;
    }

    public void decrementaContador() {
        if (this.contador > 0)
            this.contador--;
    }
}