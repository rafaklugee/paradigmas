public class Principal {
    public static void main(String[] args) {
        // Passageiro da classe Executiva
        PassageiroExe passageiroExe = new PassageiroExe("Maria", 101);
        Executiva executiva = new Executiva(true);

        System.out.println("=== Passageiro Executiva ===");
        passageiroExe.dadosVoo(passageiroExe.nome, passageiroExe.numeroVoo);
        executiva.imprimirDados();
        executiva.ficarNaVip(executiva.salaVip);
        executiva.fazerCheckIn();
        executiva.controleSeguranca();

        System.out.println();

        // Passageiro da classe Econômica
        PassageiroEco passageiroEco = new PassageiroEco("Rafael", 202);
        Economica economica = new Economica(true, true);

        System.out.println("=== Passageiro Econômica ===");
        passageiroEco.dadosVoo(passageiroEco.nome, passageiroEco.numeroVoo);
        economica.imprimirDados();
        economica.despacho(economica.despachar, economica.malaPequena);
        economica.fazerCheckIn();
        economica.controleSeguranca();
    }
}