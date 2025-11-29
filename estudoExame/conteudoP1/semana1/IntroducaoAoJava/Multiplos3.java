public class Multiplos3 {
    public static void main(String args[]) {
        int cont = 0;
        int num = 0;
        int soma = 0;
        
        while (cont < 10) {
            if (num % 3 == 0) {
                soma += num;
                cont++;
            }
            num++;
        }

        System.out.print("Soma: " + soma);
    }
}