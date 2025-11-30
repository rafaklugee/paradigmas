public class Data {
    // Atributos
    private int dia;
    private int mes;
    private int ano;

    // Métodos
    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31)
            this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12)
            this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        if (ano > 0)
            this.ano = ano;
    }

    public boolean anterior(int dia, int mes, int ano) {
        if (ano < this.ano)
            return true;
        else if (ano == this.ano && mes < this.mes)
            return true;
        else if (ano == this.ano && mes == this.mes && dia < this.dia)
            return true;
        else
            return false;
    }

    public boolean posterior(int dia, int mes, int ano) {
        if (ano > this.ano)
            return true;
        else if (ano == this.ano && mes > this.mes)
            return true;
        else if (ano == this.ano && mes == this.mes && dia > this.dia)
            return true;
        else
            return false;
    }

    public boolean equals(int dia, int mes, int ano) {
        if (ano == this.ano && mes == this.mes && dia == this.dia)
            return true;
        else
            return false;
    }

    public String toString() {
        return String.format("\n%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }
}