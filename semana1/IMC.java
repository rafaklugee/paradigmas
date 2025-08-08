import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner input;
        double peso;
        double altura;
        double imc;
        int cont;

        input = new Scanner(System.in);
        cont = 0;

        while (true) {
            System.out.print("Digite seu peso (kg) ou -1 para sair: ");
            peso = input.nextDouble();
            
            if (peso == -1) {
                break;
            }

            System.out.print("Digite sua altura (m): ");
            altura = input.nextDouble();

            imc = peso / (altura * altura);
            
            if (imc <= 25)
                System.out.println("Seu peso está normal.");
            else {
                cont++;
                System.out.println("Seu peso está acima do normal.");
            }
            System.out.println();
        }
        
        input.close();
        System.out.println("Há " + cont + " pessoa(s) acima do peso normal.");
    }
}