import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nome;
        int matricula;
        String disciplina;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        System.out.print("Digite sua matricula: ");
        matricula = input.nextInt();
        input.nextLine(); // Limpa o buffer

        System.out.print("Digite a disciplina: ");
        disciplina = input.nextLine();

        // Polimorfismo de inclusão
        Monitor m1 = new MonitorEdital(nome, matricula, disciplina);
            
        System.out.print("Digite seu nome: ");
        nome = input.nextLine();
        
        System.out.print("Digite sua matricula: ");
        matricula = input.nextInt();
        input.nextLine(); // Limpa o buffer
        
        System.out.print("Digite a disciplina: ");
        disciplina = input.nextLine();

        // Polimorfismo de coerção downcast
        Monitor m2 = new MonitorPET(nome, matricula, disciplina);
        if (m2 instanceof MonitorPET) {
            MonitorPET monitorPET = (MonitorPET) m2;
            // Chamar métodos específicos de MonitorPET
        }

        m1.relatorioAtividades();
        m2.relatorioAtividades();  
    }
}
