import java.util.Scanner;

public class PrincipalData {
    public static void main (String[] args) {
        int dia, mes, ano;

        Scanner input = new Scanner(System.in);

        Data[] data = new Data[3];

        for (int i = 0; i < 3; i++) {
            data[i] = new Data();
            
            System.out.print("Digite o dia: ")
            dia = input.nextInt();
            data[i].setDia(dia);

            System.out.print("Digite o mes: ")
            mes = input.nextInt();
            data[i].setMes(mes);

            System.out.print("Digite o ano: ")
            ano = input.nextInt();
            data[i].setAno(ano);
        }

        Data[1] menorData = data[0];
        Data[1] maiorData = data[0];
    //2020 1900 2070
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (data[i].posterior(data[j].dia, data[j].mes, data[j].ano));
                    maiorData = data[i];
            }
        }




    }
}