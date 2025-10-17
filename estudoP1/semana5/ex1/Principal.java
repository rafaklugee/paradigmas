import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String destinatario, remetente;

        Scanner input = new Scanner(System.in);

        CartaoWeb[] cartoes = new CartaoWeb[3];

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.print("Nome do destinatario: ");
                destinatario = input.nextLine();
                cartoes[i] = new CartaoDiaDosNamorados(destinatario);
            } else if (i == 1) {
                System.out.print("Nome do destinatario: ");
                destinatario = input.nextLine();
                cartoes[i] = new CartaoAniversario(destinatario);
            } else {
                System.out.print("Nome do destinatario: ");
                destinatario = input.nextLine();
                cartoes[i] = new CartaoNatal(destinatario);
            }
        }

        System.out.print("Digite o nome do remetente: ");
        remetente = input.nextLine();

        for (int i = 0; i < 3; i++) {
            cartoes[i].retornarMensagem(remetente);
        }
    }
}