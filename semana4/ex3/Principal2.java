public class Principal2 {
    public static void main(String[] args) {
        IngressoVip[] vips = new IngressoVip[25];
        IngressoNormal[] normais = new IngressoNormal[25];
        IngressoCamarote[] camarotes = new IngressoCamarote[25];

        // Inicializa os objetos
        for (int i = 0; i < 25; i++) {
            vips[i] = new IngressoVip(50, 15);
            normais[i] = new IngressoNormal(50);
            camarotes[i] = new IngressoCamarote(50, 15, 35);

            // Atualiza o valor dos ingressos Vip e Camarote
            double totalVip = vips[i].adicionar(15);
            double totalCamarote = camarotes[i].addValorCamarote(35);

            vips[i].setValorVip(totalVip);
            camarotes[i].setValorCamarote(totalCamarote);
        }

        // Imprime os valores dos ingressos Vip
        for (int i = 0; i < 25; i++) {
            vips[i].imprimirValor();
        }

        // Imprime os valores dos ingressos Normais
        for (int i = 0; i < 25; i++) {
            normais[i].imprimirValor();
            // normais[i].imprimeNormal();
        }

        // Imprime os valores dos ingressos Camarote
        for (int i = 0; i < 25; i++) {
            camarotes[i].imprimirValor();
        }
    }
}