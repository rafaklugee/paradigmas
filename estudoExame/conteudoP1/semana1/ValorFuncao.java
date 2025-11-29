import java.util.Scanner;

public class ValorFuncao {
    public static void main(String args[]) {
        Scanner input;
        int num;
        int func1, func2, func3;

        System.out.print("Digite um número: ");

        input = new Scanner(System.in);
        num = input.nextInt();

        func1 = num;
        func2 = 2*num + 1;
        func3 = num - 3;

        if (num >= 0 && num < 5)
            System.out.print("f(x) = " + func1);
        if (num >= 5 && num < 10)
            System.out.print("f(x) = " + func2);
        if (num >= 10)
            System.out.print("f(x) = " + func3);

        input.close();
    }
}