import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String destinatario;
        
        CartaoWeb[] cartoes = new CartaoWeb[3];

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do destinatario: ");
        destinatario = input.next();    

        for (int i = 0; i < 3; i++) {
            if (i == 0)
                cartoes[0] = new CartaoDiaDosNamorados(destinatario);
            else if (i == 1)
                cartoes[1] = new CartaoNatal(destinatario);
            else
                cartoes[2] = new CartaoAniversario(destinatario);
        }

        for (int i = 0; i < 3; i++)
            cartoes[i].retornarMensagem("Rafael");

        input.close();
    }
}