public class Data {
    // Atributos
    private int dia;
    private int mes;
    private int ano;

    // Métodos
    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia < 31)
            this.dia = dia;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12)
            this.mes = mes;
    }

    public void setAno(int ano) {
        if (ano >= 0)
            this.ano = ano;
    }

    public boolean posterior(Data data) {
        if (this.ano > data.ano)
            return true;
        else if (this.ano == data.ano && this.mes > data.mes)
            return true;
        else if (this.ano == data.ano && this.mes == data.mes && this.dia > data.dia)
            return true;
        else
            return false;
    }

    public boolean anterior(Data data) {
        if (this.ano < data.ano)
            return true;
        else if (this.ano == data.ano && this.mes < data.mes)
            return true;
        else if (this.ano == data.ano && this.mes == data.mes && this.dia < data.dia)
            return true;
        else
            return false;
    }

    public boolean equals(Data data) {
        if (this.dia == data.dia && this.mes == data.mes && this.ano == data.ano)
            return true;
        else
            return false;
    }

    public String toString() {
        return String.format("%02d/%02d/%d", this.dia, this.mes, this.ano);
    }
}