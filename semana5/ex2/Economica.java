public class Economica implements Classe {
    // Atributos
    boolean despachar;
    boolean malaPequena;

    // Construtor
    public Economica(boolean despachar, boolean malaPequena) {
        this.despachar = despachar;
        this.malaPequena = malaPequena;
    }

    // Métodos
    public void fazerCheckIn() {
        System.out.println("Check-in feito!");
    }

    public void controleSeguranca() {
        System.out.println("Controle de segurança feito!");
    }

    public void despacho(boolean despachar, boolean malaPequena) {
        if(despachar && malaPequena)
            System.out.println("Mala despachada!");
        else
            System.out.println("Mala não será despachada.");
    }

    public void imprimirDados() {
        if (this.despachar && this.malaPequena)
            System.out.println("[ECO] Esse passageiro vai despachar sua mala pequena.");
        else if (!this.despachar && this.malaPequena)
            System.out.println("[ECO] Esse passageiro não vai despachar sua mala pequena.");
        else
            System.out.println("[ECO] Esse passageiro tem mala grande.");
    }
}