import java.util.Scanner;

public class PesoAltura {
    public static void main(String args[]) {
        double peso;
        double altura;
        int cont = 0;
        
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Digite o peso: ");
            peso = input.nextDouble();
            if (peso == -1) {
                break;
            }

            System.out.print("Digite a altura: ");
            altura = input.nextDouble();
            if (altura == -1) {
                break;
            }

            if (peso/(altura*altura) <= 25) {
                System.out.print("Está no peso normal");
            }
            else {
                System.out.print("Está acima do peso");
                cont++;
            }
            System.out.print("\nHá " + cont + " pessoas acima do peso\n");
        } while (true);
        input.close();
    }
}