public class Time {
    private int hora;
    private int minuto;

    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <=23)
            this.hora = hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59)
            this.minuto = minuto;
    }

    public boolean anterior(int hora, int minuto) {
        if (hora < this.hora)
            return true;
        else if (hora == this.hora) {
            if (minuto < this.minuto)
                return true;
            else
                return false;
        }
        else
            return false;
    }

    public boolean posterior(int hora, int minuto) {
        if (hora > this.hora)
            return true;
        else if (hora == this.hora) {
            if (minuto > this.minuto)
                return true;
            else
                return false;
        }
        else
            return false;
    }

    public boolean equals(int hora, int minuto) {
        if (hora == this.hora && minuto == this.minuto)
            return true;
        else
            return false;
    }

    public String toString() {
        return String.format("\n%02d:%02d", this.hora, this.minuto);
    }
}