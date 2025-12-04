public class ClasseEco implements Classe {
    // Atributo
    private String nome;

    // Construtor
    public ClasseEco(String nome) {
        this.nome = nome;
    }

    // Método
    public void fazerCheckIn() {
        System.out.print("\n[ECO] Fazendo check-in...");
    }

    public void passarControleSeguranca() {
        System.out.print("\n[ECO] Passando pelo controle de segurança...");
    }
}