public class Principal {
    public static void main(String[] args) {
        IngressoNormal i1 = new IngressoNormal(20);
        IngressoVip i2 = new IngressoVip(20,25);
        IngressoCamarote i3 = new IngressoCamarote(20,25,55);

        double valorVip = i2.valorComAdicionalVip();
        double valorCamarote = i3.valorComAdicionalCamarote();

        i1.imprimirValor();
        i1.imprimirNormal();
        System.out.print("\nValor do Ingresso (Vip): " + valorVip);
        System.out.print("\nValor do Ingresso (Camarote): " + valorCamarote + "\n");
    }
}