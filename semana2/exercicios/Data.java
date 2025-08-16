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

    public void setAno(int Ano) {
        if (ano >= 0)
            this.ano = ano;
    }

    public boolean posterior(int dia, int mes, int ano) {
        if (this.ano > ano)
            return true;
        else if (this.ano == ano && this.mes > mes)
            return true;
        else if (this.ano == ano && this.mes == mes && this.dia > dia)
            return true;
        else
            return false;
    }

    public boolean anterior(int dia, int mes, int ano) {
        if (this.ano < ano)
            return true;
        else if (this.ano == ano && this.mes < mes)
            return true;
        else if (this.ano == ano && this.mes == mes && this.dia < dia)
            return true;
        else
            return false;
    }

    public boolean equals(int dia, int mes, int ano) {
        if (this.dia == dia && this.mes == mes && this.ano == ano)
            return true;
        else
            return false;
    }

    public String toString() {
        return String.format("%02d/%02d/%d", this.dia, this.mes, this.ano);
    }
}