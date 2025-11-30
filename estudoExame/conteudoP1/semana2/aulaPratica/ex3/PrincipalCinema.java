public class PrincipalCinema {
    public static void main(String args[]) {
        String nomeMaisCaro;
        double soma, precoMaisCaro;
        int totalIngressos;

        Ingresso[] ingressos = new Ingresso[5];

        ingressos[0] = new Ingresso();
        ingressos[1] = new Ingresso();
        ingressos[2] = new Ingresso();
        ingressos[3] = new Ingresso();
        ingressos[4] = new Ingresso();

        ingressos[0].setNomeFilme("A Bela e a fera");
        ingressos[0].setNumSala(1);
        ingressos[0].setPreco(25);

        ingressos[1].setNomeFilme("Mágico de Oz");
        ingressos[1].setNumSala(2);
        ingressos[1].setPreco(30);

        ingressos[2].setNomeFilme("Oppenheimer");
        ingressos[2].setNumSala(3);
        ingressos[2].setPreco(50);

        ingressos[3].setNomeFilme("Interestelar");
        ingressos[3].setNumSala(4);
        ingressos[3].setPreco(55.5);

        ingressos[4].setNomeFilme("O Discurso do Rei");
        ingressos[4].setNumSala(5);
        ingressos[4].setPreco(20);

        soma = 0;
        totalIngressos = 0;
        nomeMaisCaro = ingressos[0].getNomeFilme();
        precoMaisCaro = ingressos[0].getPreco();

        for (int i = 0; i < 5; i++) {
            ingressos[i].exibir();

            if (ingressos[i].getPreco() > precoMaisCaro) {
                precoMaisCaro = ingressos[i].getPreco();
                nomeMaisCaro = ingressos[i].getNomeFilme();
            }
            soma += ingressos[i].getPreco();
            totalIngressos++;
        }

        System.out.print("\nValor total arrecadado: " + soma);
        System.out.print("\nNome e preco do ingresso mais caro: " + nomeMaisCaro + " | " + precoMaisCaro);
        System.out.print("\nTotal de ingressos: " + totalIngressos);
    }
}