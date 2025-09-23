import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        String nome;
        String disciplina;
        int matricula;

        Monitor[] monitores = new Monitor[3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Nome do monitor: ");
            nome = input.next();

            System.out.print("Matrícula: ");
            matricula = input.nextInt();

            System.out.print("Nome da disciplina: ");
            disciplina = input.next();

            if (i == 0)
                monitores[i] = new MonitorEdital(nome, disciplina, matricula);
            else if (i == 1)
                monitores[i] = new MonitorEdital(nome, disciplina, matricula);
            else
                monitores[i] = new MonitorPET(nome, disciplina, matricula);

            monitores[i].enviarRelatorio(disciplina);
        }
        
        input.close();

        // Demonstração de downcast em Java
        // Vamos percorrer o array de monitores e identificar o tipo real de cada objeto.
        // Assim, podemos acessar métodos específicos de cada subclasse.

        for (Monitor m : monitores) {
            // Verifica se o monitor é do tipo MonitorEdital
            if (m instanceof MonitorEdital) {
                // Fazemos o downcast de Monitor para MonitorEdital
                MonitorEdital monitorEdital = (MonitorEdital) m;
                monitorEdital.editalExclusivo(); // Método exclusivo de MonitorEdital
            }
            // Verifica se o monitor é do tipo MonitorPET
            else if (m instanceof MonitorPET) {
                // Fazemos o downcast de Monitor para MonitorPET
                MonitorPET monitorPET = (MonitorPET) m;
                monitorPET.petExclusivo(); // Método exclusivo de MonitorPET
            }
        }
    }
}