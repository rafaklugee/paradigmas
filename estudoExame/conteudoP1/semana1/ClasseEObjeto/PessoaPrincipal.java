public class PessoaPrincipal {
    public static void main(String args[]) {
        int idade1;
        int idade2;

        Pessoa graceHopper = new Pessoa("Grace Hopper");
        Pessoa adaLovelace = new Pessoa("Ada Lovelace");

        graceHopper.ajustarDataDeNascimento(19, 12, 1906);
        adaLovelace.ajustarDataDeNascimento(10, 12, 1815);

        graceHopper.calcularIdade(29, 11, 2025);
        adaLovelace.calcularIdade(29, 11, 2025);

        idade1 = graceHopper.retornarIdade();
        idade2 = adaLovelace.retornarIdade();

        System.out.print("Idade da " + graceHopper.retornarNome() + ": " + idade1);
        System.out.print("\nIdade da " + adaLovelace.retornarNome() + ": " + idade2);
    }
}