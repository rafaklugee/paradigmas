import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int horas, min, tempoSubmerso;
        String equipamentos, vestuarios, estrategias;

        Scanner input = new Scanner(System.in);

        ModalidadeFitness[] fitness = new ModalidadeFitness[2];
        ModalidadeLuta[] lutas = new ModalidadeLuta[2];
        ModalidadeAquatica[] aquaticos = new ModalidadeAquatica[2];

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.print("[AQU] Tempo submerso: ");
                tempoSubmerso = input.nextInt();
                aquaticos[i] = new PoloAquatico(tempoSubmerso);
                input.nextLine(); // Limpar o buffer

                System.out.print("[FIT] Horas: ");
                horas = input.nextInt();
                System.out.print("[FIT] Minutos: ");
                min = input.nextInt();
                fitness[i] = new Spinning(horas, min);
                input.nextLine(); // Limpar o buffer

                System.out.print("[LUT] Equipamentos: ");
                equipamentos = input.nextLine();
                System.out.print("[LUT] Vestuarios: ");
                vestuarios = input.nextLine();
                System.out.print("[LUT] Estrategias: ");
                estrategias = input.nextLine();
                lutas[i] = new Boxe(equipamentos, vestuarios, estrategias);
            }
            else {
                System.out.print("[AQU] Tempo submerso: ");
                tempoSubmerso = input.nextInt();
                aquaticos[i] = new PoloAquatico(tempoSubmerso);
                input.nextLine(); // Limpar o buffer
                
                System.out.print("[FIT] Horas: ");
                horas = input.nextInt();
                System.out.print("[FIT] Minutos: ");
                min = input.nextInt();
                fitness[i] = new Musculacao(horas, min);
                input.nextLine(); // Limpar o buffer

                System.out.print("[LUT] Equipamentos: ");
                equipamentos = input.nextLine();
                System.out.print("[LUT] Vestuarios: ");
                vestuarios = input.nextLine();
                System.out.print("[LUT] Estrategias: ");
                estrategias = input.nextLine();
                lutas[i] = new MuayThai(equipamentos, vestuarios, estrategias);
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("[AQU] Objetivos: " + aquaticos[i].getObjetivos());
            System.out.println("[AQU] Regras: " + aquaticos[i].getRegras());
            System.out.println("");
            System.out.println("[FIT] Objetivos: " + fitness[i].getObjetivos());
            System.out.println("[FIT] Regras: " + fitness[i].getRegras());
            System.out.println("");
            System.out.println("[LUT] Objetivos: " + lutas[i].getObjetivos());
            System.out.println("[LUT] Regras: " + lutas[i].getRegras());
            System.out.println("");
        }

        input.close();
    }
}