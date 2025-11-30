import java.util.Scanner;

public class PrincipalData {
    public static void main(String args[]) {
        int dia, mes, ano;

        Data[] data = new Data[3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i ++) {
            data[i] = new Data();

            System.out.print("Dia(" + i + "): ");
            dia = input.nextInt();
            data[i].setDia(dia);

            System.out.print("Mês(" + i + "): ");
            mes = input.nextInt();
            data[i].setMes(mes);

            System.out.print("Ano(" + i + "): ");
            ano = input.nextInt();
            data[i].setAno(ano);
        }

        Data menorData = data[0];
        Data maiorData = data[0];

        for (int i = 0; i < 3; i++) {
            if (menorData.anterior(data[i].getDia(), data[i].getMes(), data[i].getAno()))
                menorData = data[i];
            if (maiorData.posterior(data[i].getDia(), data[i].getMes(), data[i].getAno()))
                maiorData = data[i];
        }

        System.out.print("\nMaior data: " + maiorData.toString());
        System.out.print("\nMenor data: " + menorData.toString() + "\n");
    }
}