import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int estado;

        Scanner input = new Scanner(System.in);

        LampadaFluorescente fluor = new LampadaFluorescente(true, 15);
        LampadaLed led = new LampadaLed(false);
        
        fluor.estado();
        led.estado();

        System.out.println("Escolha uma lampada: ");
        System.out.println("(1) Fluorescente");
        System.out.println("(2) Led");
        estado = input.nextInt();

        if (estado == 1) {
            fluor.ligaDesliga();
            fluor.estado();
        } else {
            led.ligaDesliga();
            led.estado();
        }

        input.close();
    }
}