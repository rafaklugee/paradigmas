import java.util.Scanner;
import java.util.TreeSet;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {
        int numPersonagens;

        Scanner input = new Scanner(System.in);

    // Comparador para ordenar por dano decrescente
    TreeSet<Personagem> personagens = new TreeSet<>(new ComparadorDano());

        System.out.print("Quantos personagens deseja inserir? ");
        numPersonagens = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numPersonagens; i++) {
            System.out.println("\nPersonagem #" + (i+1));
            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Nível: ");
            int nivel = input.nextInt();

            System.out.print("Força: ");
            int forca = input.nextInt();

            input.nextLine();

            Personagem p;
            if (i % 3 == 0) {
                p = new Guerreiro(nome, nivel, forca);
            } else if (i % 3 == 1) {
                p = new Mago(nome, nivel, forca);
            } else {
                p = new Arqueiro(nome, nivel, forca);
            }
            personagens.add(p);
        }

        System.out.println("\nPersonagens em ordem decrescente de dano:");
        for (Personagem p : personagens) {
            p.calcularDano();
            String tipo;
            if (p instanceof Guerreiro) {
                tipo = "Guerreiro";
            } else if (p instanceof Mago) {
                tipo = "Mago";
            } else if (p instanceof Arqueiro) {
                tipo = "Arqueiro";
            } else {
                tipo = "Desconhecido";
            }
            System.out.println(p.nome + " (" + tipo + ") - Dano: " + p.dano);
        }
    }
}