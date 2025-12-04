public class Principal {
    public static void main(String[] args) {
        // Passageiro da classe Executiva
        PassageiroExe passageiroExe = new PassageiroExe("Maria", 101);
        ClasseExe executiva = new ClasseExe("Maria");

        System.out.println("=== Passageiro Executiva ===");
        executiva.fazerCheckIn();
        executiva.passarControleSeguranca();
        passageiroExe.acessarSalaVip();
        passageiroExe.prioridadeEmbarque();

        System.out.println("\n");

        // Passageiro da classe Econômica
        PassageiroEco passageiroEco = new PassageiroEco("Rafael", 202);
        ClasseEco economica = new ClasseEco("Rafael");

        System.out.println("=== Passageiro Econômica ===");
        economica.fazerCheckIn();
        economica.passarControleSeguranca();
        passageiroEco.despacharMalaPequena();
        passageiroEco.prioridadeEmbarque();

        System.out.println("\n");
    }
}