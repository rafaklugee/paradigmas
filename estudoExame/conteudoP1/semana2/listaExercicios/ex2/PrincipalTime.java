import java.util.Scanner;

public class PrincipalTime {
    public static void main(String args[]) {
        int hora1, hora2, minuto1, minuto2;

        Time[] horario = new Time[2];

        horario[0] = new Time();
        horario[1] = new Time();

        Scanner input = new Scanner(System.in);

        System.out.print("Hora(1): ");
        hora1 = input.nextInt();
        horario[0].setHora(hora1);

        System.out.print("Minuto(1): ");
        minuto1 = input.nextInt();
        horario[0].setMinuto(minuto1);

        System.out.print("Hora(2): ");
        hora2 = input.nextInt();
        horario[1].setHora(hora2);

        System.out.print("Minuto(2): ");
        minuto2 = input.nextInt();
        horario[1].setMinuto(minuto2);

        System.out.print(horario[0].toString());
        System.out.print(horario[1].toString());

        if (horario[0].anterior(horario[1].getHora(), horario[1].getMinuto()))
            System.out.print("\nHorário 2 é anterior ao Horário 1\n");
        if (horario[0].posterior(horario[1].getHora(), horario[1].getMinuto()))
            System.out.print("\nHorário 2 é posterior ao Horário 1\n");
        if (horario[0].equals(horario[1].getHora(), horario[1].getMinuto()))
            System.out.print("\nHorário 2 é igual ao Horário 1\n");

        input.close();
    }
}