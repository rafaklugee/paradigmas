import java.util.*;

public class Principal {
    public static void main(String[] args) {
        String nome;

        Personagem[] personagens = new Personagem[3];

        Scanner input = new Scanner(System.in);

        TreeSet<Personagem> p = new TreeSet<Personagem>();

        for (int i = 0; i < 3; i++) {
            System.out.print("\nDigite o nome do personagem: ");
            nome = input.next();

            if (i == 0) {
                personagens[i] = new Guerreiro(nome, 10, 10);
                p.add(personagens[i]);
            }
            else if (i == 1) {
                personagens[i] = new Mago(nome, 10, 10);
                p.add(personagens[i]);
            }
            else {
                personagens[i] = new Arqueiro(nome, 10, 10);
                p.add(personagens[i]);
            }
        }

        for(Personagem personagem : p) {
            System.out.print("\n" + personagem.getNome() + " | Dano: " + personagem.calcularDano());
        }
        System.out.print("\n");
        input.close();
    }
}