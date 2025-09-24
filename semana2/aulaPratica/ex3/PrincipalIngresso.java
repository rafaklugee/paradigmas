import java.util.Scanner;

public class PrincipalIngresso {
    public static void main(String[] args) {
        double valorTotal = 0.0;
        double precoMaisCaro, preco;
        String nomeMaisCaro, nome;
        int ingressosPorFilme, sala;

        Scanner input = new Scanner(System.in);

        Ingresso[] ingressos = new Ingresso[3];

        for (int i = 0; i < 3; i++) {
            ingressos[i] = new Ingresso();

            System.out.print("Nome do filme: ");
            nome = input.next();
            ingressos[i].setNomeFilme(nome);

            System.out.print("Sala: ");
            sala = input.nextInt();
            ingressos[i].setNumSala(sala);

            System.out.print("Preco: ");
            preco = input.nextDouble();
            ingressos[i].setPreco(preco);
        }

        precoMaisCaro = ingressos[0].getPreco();
        nomeMaisCaro = ingressos[0].getNomeFilme();

        for (int i = 0; i < 3; i++) {
            valorTotal += ingressos[i].getPreco();

            if (ingressos[i].getPreco() > precoMaisCaro) {
                precoMaisCaro = ingressos[i].getPreco();
                nomeMaisCaro = ingressos[i].getNomeFilme();
            }

            ingressosPorFilme = 0;
            ingressos[i].setIngressosPorFilme(0);
            for (int j = 0; j < 3; j++) {
                if (ingressos[j].getNomeFilme().equals(ingressos[i].getNomeFilme())) {
                    ingressosPorFilme++;
                }
            }
            ingressos[i].setIngressosPorFilme(ingressosPorFilme);
       }


        for (int i = 0; i < 3; i++) {
            ingressos[i].exibirDados();
        }
        System.out.println("Valor total arrecadado: " + valorTotal);
        System.out.println("Nome: " + nomeMaisCaro + " Preco: " + precoMaisCaro + " -> mais caro");
        for (int i = 0; i < 3; i++) {
            System.out.println("Quantidade de ingressos para o filme: " + ingressos[i].getNomeFilme() + " -> " + ingressos[i].getIngressosPorFilme());
        }
    }
}