import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String destinatario, remetente;

        Scanner input = new Scanner(System.in);

        CartaoWeb[] cartao = new CartaoWeb[3];

        System.out.print("Digite o nome do remetente: ");
        remetente = input.next();

        System.out.print("Digite o nome do destinatario: ");
        destinatario = input.next();

        for (int i = 0; i < 3; i++) {
            if (i == 1)
                cartao[i] = new CartaoDiaDosNamorados(destinatario);
            else if (i == 2)
                cartao[i] = new CartaoNatal(destinatario);
            else
                cartao[i] = new CartaoAniversario(destinatario);
        }

        for (int i = 0; i < 3; i++)
            cartao[i].retornarMensagem(remetente);

        input.close();
    }
}