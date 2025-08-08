import java.util.Scanner;

public class ParImpar {
    public static void main(String args[]) {
        Scanner input;
        int num;
        
        System.out.print("Digite um número: ");

        input = new Scanner(System.in);
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par.");
        } else {
            System.out.println("O número " + num + " é ímpar.");
        }
        input.close();
    }
}