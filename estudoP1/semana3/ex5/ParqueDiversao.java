public class ParqueDiversao {
    public static void main(String[] args) {
        Visitante vis1 = new Visitante("Rafael", 20, 700);
        Visitante vis2 = new Visitante("André", 23, 4000);

        Brinquedo brin1 = new Brinquedo("Kamikaze", 1.70, 20);
        Brinquedo brin2 = new Brinquedo("Xícara Maluca", 1.50, 10);

        AtracaoEspecial atra1 = new AtracaoEspecial("Drift de Carros", 150, 140);
        AtracaoEspecial atra2 = new AtracaoEspecial("Madagascar", 150, 180);

        brin1.possuiAlturaMin(1.70);
        brin2.possuiAlturaMin(1.49);

        atra1.ultrapassouCap();
        atra2.ultrapassouCap();

        vis1.compraDeIngresso(20);
        vis2.compraDeIngresso(10);
    }
}