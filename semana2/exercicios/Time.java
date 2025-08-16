public class Time {
    // Atributos
    private int h;
    private int m;

    // Métodos
    public int getHoras() {
        return this.h;
    }

    public int getMinutos() {
        return this.m;
    }

    public void setHoras(int h) {
        if (h >= 0 && h <= 24)
            this.h = h;
    }

    public void setMinutos(int m) {
        if (m >= 0 && m <= 60)
            this.m = m;
    }

    public boolean posterior (int h, int m) {
        if (h < this.h)
            return true;
        if (h == this.h && m < this.m)
            return true;
        else
            return false;
    }

    public boolean anterior (int h, int m) {
        if (h > this.h)
            return true;
        if (h == this.h && m > this.m)
            return true;
        else
            return false;
    }

    public boolean equals (int h, int m) {
        if (h == this.h && m == this.m)
            return true;
        else
            return false;
    }

    public String toString() {
        return String.format("%02d:%02d", this.h, this.m);
    }

}