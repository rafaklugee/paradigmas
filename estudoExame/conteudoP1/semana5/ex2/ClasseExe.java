public class ClasseExe implements Classe {
    // Atributo
    private String nome;

    // Construtor
    public ClasseExe(String nome) {
        this.nome = nome;
    }

    // Método
    public void fazerCheckIn() {
        System.out.print("\n[EXE] Fazendo check-in...");
    }

    public void passarControleSeguranca() {
        System.out.print("\n[EXE] Passando pelo controle de segurança...");
    }
}