import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int lampada;

        Scanner input = new Scanner(System.in);

        Fluorescente fluorescente = new Fluorescente(false, 10);
        Led led = new Led(false);

        System.out.println("Escolha uma lampada:");
        System.out.println("(1) Lâmpada fluorescente");
        System.out.println("(2) Lâmpada led");
        lampada = input.nextInt();

        if(lampada == 1) {
            fluorescente.setEstado(!fluorescente.getEstado());
            if(fluorescente.getEstado() == true)
                System.out.println("Agora a lampada fluorescente está ligada");
            else
                System.out.println("Agora a lampada fluorescente está desligada");
        }
        else if(lampada == 2) {
            led.setEstado(!led.getEstado());
            if(led.getEstado() == true)
                System.out.println("Agora a lampada led está ligada");
            else
                System.out.println("Agora a lampada led está desligada");
        }
        else
            System.out.println("Estado incorreto!");
        
        input.close();
    }
}
