public class ParqueDeDiversao {
    public static void main(String[] args) {
        Brinquedo b1 = new Brinquedo("Kamikaze", 1.70, 20);
        Brinquedo b2 = new Brinquedo("Gira-Gira", 1.40, 10);

        AtracaoEspecial a1 = new AtracaoEspecial("Madagascar", 100, 80);
        AtracaoEspecial a2 = new AtracaoEspecial("Show do Enaldinho", 200, 195);

        Visitante v1 = new Visitante("Rafael", 20, 30, 1.71);
        Visitante v2 = new Visitante("Casimiro Miguel", 32, 20, 1.85);

        b1.verificaAltura(v1.getAltura());
        b2.verificaAltura(v1.getAltura());

        b1.verificaAltura(v2.getAltura());
        b2.verificaAltura(v2.getAltura());

        a1.adicionarPessoas(30);
        a2.adicionarPessoas(5);

        System.out.print("\nQuantidade de pessoas em " + a1.getNomeAtracao() + ": " + a1.getQtdePessoas());
        System.out.print("\nQuantidade de pessoas em " + a2.getNomeAtracao() + ": " + a2.getQtdePessoas());

        v1.comprarIngresso(b1.getPreco());
        v2.comprarIngresso(b2.getPreco());

        System.out.print("\nSaldo atual de " + v1.getNome() + ": " + v1.getSaldo());
        System.out.print("\nSaldo atual de " + v2.getNome() + ": " + v2.getSaldo() + "\n");
    }
}