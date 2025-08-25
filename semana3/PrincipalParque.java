import java.util.Scanner;

public class PrincipalParque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Brinquedo[] brinquedos = new Brinquedo[2];
        Atracao[] atracoes = new Atracao[2];
        Visitante[] visitantes = new Visitante[2];

        for (int i = 0; i < 2; i++) {
            // Brinquedo
            System.out.print("Digite o nome do brinquedo: ");
            String nomeBrinquedo = input.nextLine();
            System.out.print("Digite a altura mínima para o brinquedo: ");
            double alturaMin = input.nextDouble();
            System.out.print("Digite o preço do brinquedo: ");
            double preco = input.nextDouble();
            input.nextLine();
            brinquedos[i] = new Brinquedo(nomeBrinquedo, alturaMin, preco);

            // Atração
            System.out.print("Digite o nome da atração: ");
            String nomeAtracao = input.nextLine();
            System.out.print("Digite a capacidade da atração: ");
            int capacidade = input.nextInt();
            input.nextLine();
            atracoes[i] = new Atracao(nomeAtracao, capacidade);

            // Visitante
            System.out.print("Digite o nome do visitante: ");
            String nomeVisitante = input.nextLine();
            System.out.print("Digite o saldo do visitante: ");
            double saldo = input.nextDouble();
            System.out.print("Digite a idade do visitante: ");
            int idade = input.nextInt();
            System.out.print("Digite a altura atual do visitante: ");
            double alturaAtual = input.nextDouble();
            input.nextLine();
            visitantes[i] = new Visitante(nomeVisitante, saldo, idade, alturaAtual);
        }

        Parque parque = new Parque(brinquedos, atracoes, visitantes);

        // i. Verificar se um visitante pode usar um brinquedo
        for (int i = 0; i < 2; i++) {
            Visitante visitante = parque.visitantes[i];
            for (int j = 0; j < 2; j++) {
                Brinquedo brinquedo = parque.brinquedos[j];
                if (visitante.getAltura() >= brinquedo.alturaMin) {
                    System.out.println(visitante.nome + " pode usar o brinquedo " + brinquedo.nome);
                } else {
                    System.out.println(visitante.nome + " não pode usar o brinquedo " + brinquedo.nome);
                }
            }
        }

        // ii. Adicionar um número X pessoas a uma atração especial e verificar se respeita a capacidade máxima.
        for (int i = 0; i < 2; i++) {
            Atracao atracao = parque.atracoes[i];
            System.out.print("Digite o número de pessoas a adicionar na atração " + atracao.nome + ": ");
            int x = input.nextInt();
            if (atracao.pessoasPresentes + x <= atracao.capacidade) {
                atracao.pessoasPresentes += x;
                System.out.println("Pessoas adicionadas com sucesso! Total de pessoas presentes: " + atracao.pessoasPresentes);
            } else {
                System.out.println("Não é possível adicionar " + x + " pessoas. Capacidade máxima excedida!");
            }
        }

        // iii. Comprar um ingresso para um brinquedo e exibir o saldo do visitante antes e depois da compra.
        for (int i = 0; i < 2; i++) {
            Visitante visitante = parque.visitantes[i];
            for (int j = 0; j < 2; j++) {
                Brinquedo brinquedo = parque.brinquedos[j];
                System.out.println("Visitante: " + visitante.nome);
                System.out.println("Saldo antes da compra: " + visitante.saldo);
                if (visitante.saldo >= brinquedo.preco) {
                    visitante.saldo -= brinquedo.preco;
                    System.out.println("Compra realizada com sucesso!");
                } else {
                    System.out.println("Saldo insuficiente para comprar o ingresso.");
                }
                System.out.println("Saldo depois da compra: " + visitante.saldo);
            }
        }
    }
}