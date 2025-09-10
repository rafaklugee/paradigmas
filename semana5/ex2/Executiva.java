public class Executiva implements Classe {
    // Atributos
    boolean salaVip;

    // Construtor
    public Executiva(boolean salaVip) {
        this.salaVip = salaVip;
    }

    // Métodos
    public void fazerCheckIn() {
        System.out.println("Check-in feito!");
    }

    public void controleSeguranca() {
        System.out.println("Controle de segurança feito!");
    }

    public void ficarNaVip(boolean salaVip) {
        if (salaVip)
            System.out.println("Você está na sala VIP!");
        else
            System.out.println("Você optou por não ficar na sala VIP.");
    }

    public void imprimirDados() {
        if (this.salaVip)
            System.out.println("[EXE] Esse passageiro vai ficar na sala VIP.");
        else
            System.out.println("[EXE] Esse passageiro não vai ficar na sala VIP.");
    }
}