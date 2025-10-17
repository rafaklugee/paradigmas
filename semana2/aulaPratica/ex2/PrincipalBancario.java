import java.util.Scanner;

public class PrincipalBancario {
    public static void main(String[] args) {
        double saldoTotal = 0.0;
        double maiorSaldo, menorSaldo, saldoAtual;
        String titularMenorSaldo, titularAtual;

        Scanner input = new Scanner(System.in);

        ContaBancaria[] contas = new ContaBancaria[3];

        for (int i = 0; i < 3; i++) {
            contas[i] = new ContaBancaria();
            
            System.out.print("Insira o nome do titular " + i + ": ");
            titularAtual = input.next();
            contas[i].setTitular(titularAtual);

            System.out.print("Insira o saldo da pessoa " + i + ": ");
            saldoAtual = input.nextDouble();
            contas[i].setSaldo(saldoAtual);
        }

        titularMenorSaldo = contas[0].getTitular();
        maiorSaldo = contas[0].getSaldo();
        menorSaldo = contas[0].getSaldo();

        for (int i = 0; i < 3; i++) {
            saldoTotal += contas[i].getSaldo();

            if (contas[i].getSaldo() > maiorSaldo)
                maiorSaldo = contas[i].getSaldo();

            if (contas[i].getSaldo() < menorSaldo) {
                menorSaldo = contas[i].getSaldo();
                titularMenorSaldo = contas[i].getTitular();
            }
        }

        System.out.println("Saldo total: R$" + saldoTotal);
        System.out.println("Maior saldo: R$" + maiorSaldo);
        System.out.println("Titular com menor saldo: " + titularMenorSaldo);
    }

}