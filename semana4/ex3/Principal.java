public class Principal {
    public static void main(String[] args) {
        double totalVip;
        double totalCamarote;

        IngressoVip vip = new IngressoVip(50, 15);
        IngressoNormal normal = new IngressoNormal(50);
        IngressoCamarote camarote = new IngressoCamarote(50, 15, 35);
        
        totalVip = vip.adicionar(15);
        totalCamarote = camarote.addValorCamarote(35);

        vip.setValorVip(totalVip);
        camarote.setValorCamarote(totalCamarote);

        vip.imprimirValor();
        normal.imprimirValor();
        camarote.imprimirValor();
    }
}