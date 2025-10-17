public class Principal {
    public static void main(String[] args) {
        IngressoVip vip = new IngressoVip(30, 20);
        IngressoNormal normal = new IngressoNormal(30);
        IngressoCamarote camarote = new IngressoCamarote(30, 20, 50);
        
        Ingresso[] ingressos = {vip, normal, camarote};

        for (int i = 0; i < 3; i++) {
            ingressos[i].imprimirValor();
        }

        // vip.imprimirValor();
        // normal.imprimirValor();
        // camarote.imprimirValor();
    }
}