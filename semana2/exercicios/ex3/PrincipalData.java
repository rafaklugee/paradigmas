import java.util.Scanner;

public class PrincipalData {
    public static void main (String[] args) {
        int dia, mes, ano;

        Scanner input = new Scanner(System.in);

        Data[] data = new Data[3];

        for (int i = 0; i < 3; i++) {
            data[i] = new Data();
            
            System.out.print("Digite o dia: ");
            dia = input.nextInt();
            data[i].setDia(dia);

            System.out.print("Digite o mes: ");
            mes = input.nextInt();
            data[i].setMes(mes);

            System.out.print("Digite o ano: ");
            ano = input.nextInt();
            data[i].setAno(ano);
        }

        Data menorData = data[0];
        Data maiorData = data[0];

        for (int i = 0; i < 3; i++) {
            if (data[i].posterior(maiorData))
                maiorData = data[i];
            if (data[i].anterior(menorData))
                menorData = data[i];
        }

        System.out.println("Maior data: " + maiorData.toString());
        System.out.println("Menor data: " + menorData.toString());
    }
}