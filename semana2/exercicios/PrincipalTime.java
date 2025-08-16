import java.util.Scanner;

public class PrincipalTime {
    public static void main (String[] args) {
        int horas, minutos;

        Scanner input = new Scanner(System.in);

        Time[] horario = new Time[2];

        horario[0] = new Time();
        horario[1] = new Time();

        System.out.print("Hora1: ");
        horas = input.nextInt();
        horario[0].setHoras(horas);

        System.out.print("Minutos1: ");
        minutos = input.nextInt();
        horario[0].setMinutos(minutos);

        System.out.print("Hora2: ");
        horas = input.nextInt();
        horario[1].setHoras(horas);

        System.out.print("Minutos2: ");
        minutos = input.nextInt();
        horario[1].setMinutos(minutos);
        
        System.out.println(horario[0].toString());
        System.out.println(horario[1].toString());

        boolean Anterior = horario[0].anterior(horario[1].getHoras(), horario[1].getMinutos());
        boolean Posterior = horario[0].posterior(horario[1].getHoras(), horario[1].getMinutos());
        boolean Equal = horario[0].equals(horario[1].getHoras(), horario[1].getMinutos());

        if (Anterior)
            System.out.println("Anterior");
        if (Posterior)
            System.out.println("Posterior");
        if (Equal)
            System.out.println("Igual");


    }
}