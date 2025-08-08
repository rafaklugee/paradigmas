public class MultiplosTres {
    public static void main(String args[]) {
        int cont;
        int num;
        int soma;


        cont = 0;
        num = 0;
        soma = 0;

        while (cont < 10) {
            if (num % 3 == 0) {
                System.out.println(cont + " - O número " + num + " é múltiplo de 3.");
                soma += num;
                cont++;
            }
            num++;
        }
        System.out.println("A soma dos 10 primeiros múltiplos de 3 é: " + soma);
    }
}