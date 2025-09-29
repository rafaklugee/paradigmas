import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nome;
        int numeroVoo;
        
        Scanner input = new Scanner(System.in);

        Passageiro[] passageiros = new Passageiro[2];

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.print("Nome: ");
                nome = input.nextLine();
                System.out.print("Número do voo: ");
                numeroVoo = input.nextInt();
                input.nextLine(); // Limpar o buffer

                passageiros[i] = new PassageiroEco(nome, numeroVoo);
            }
            else {
                System.out.print("Nome: ");
                nome = input.nextLine();
                System.out.print("Número do voo: ");
                numeroVoo = input.nextInt();
                input.nextLine(); // Limpar o buffer

                passageiros[i] = new PassageiroExe(nome, numeroVoo);
            }
        }

        for (int i = 0; i < 2; i++) {
            passageiros[i].preEmbarque();

            // Verifica se o passageiro é da classe economica (coerção downcast)
            if (passageiros[i] instanceof PassageiroEco) {
                PassageiroEco passageiroEconomico = (PassageiroEco) passageiros[i];
                passageiroEconomico.ecoEmbarque();
            }
            
            // Verifica se o passageiro é da classe executiva e tem privilégios (coerção downcast)
            if (passageiros[i] instanceof PassageiroExe) {
                PassageiroExe passageiroExecutivo = (PassageiroExe) passageiros[i];
                passageiroExecutivo.salaVip();
                passageiroExecutivo.prioridadeEmbarque();
            }
        }
    }
}