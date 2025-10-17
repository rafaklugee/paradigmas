import java.util.*;

public class Principal {
    public static void main(String[] args) {
        String nome;
        int nivel;
        int forcaBase;
        
        Scanner input = new Scanner(System.in);

        Collection<Personagem> personagens = new TreeSet<Personagem>();

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.print("Digite o nome: ");
                nome = input.nextLine();

                System.out.print("Digite o nivel: ");
                nivel = input.nextInt();

                System.out.print("Digite a força base: ");
                forcaBase = input.nextInt();
                input.nextLine(); // Limpar o buffer

                personagens.add(new Guerreiro(nome, nivel, forcaBase));
            }
            else if (i == 1) {
                System.out.print("Digite o nome: ");
                nome = input.nextLine();

                System.out.print("Digite o nivel: ");
                nivel = input.nextInt();

                System.out.print("Digite a força base: ");
                forcaBase = input.nextInt();
                input.nextLine(); // Limpar o buffer

                personagens.add(new Mago(nome, nivel, forcaBase));
            }
            else {
                System.out.print("Digite o nome: ");
                nome = input.nextLine();

                System.out.print("Digite o nivel: ");
                nivel = input.nextInt();

                System.out.print("Digite a força base: ");
                forcaBase = input.nextInt();
                input.nextLine(); // Limpar o buffer

                personagens.add(new Arqueiro(nome, nivel, forcaBase));
            }
        }
        Iterator<Personagem> iterator = personagens.iterator();
        while (iterator.hasNext()) {
            Personagem personagem = iterator.next();
            System.out.println("[" + personagem.getClass().getSimpleName() + "] Dano: " + personagem.calcularDano());
        }

        input.close();
    }
}