import java.util.Scanner;

public class PrincipalBancario {
    public static void main(String args[]) {
        String nome, nomeMenorSaldo;
        double saldo, limite, saldoTotal, maiorSaldo, menorSaldo;

        ContaBancaria[] contas = new ContaBancaria[3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            contas[i] = new ContaBancaria();

            System.out.print("Nome: ");
            nome = input.next();
            contas[i].setNome(nome);

            System.out.print("Saldo: ");
            saldo = input.nextDouble();
            contas[i].setSaldo(saldo);

            System.out.print("Limite: ");
            limite = input.nextDouble();
            contas[i].setLimite(limite);
        }

        saldoTotal = 0;
        maiorSaldo = contas[0].getSaldo();
        menorSaldo = contas[0].getSaldo();
        nomeMenorSaldo = contas[0].getNome();

        for (int i = 0; i < 3; i++) {
            if (contas[i].getSaldo() > maiorSaldo)
                maiorSaldo = contas[i].getSaldo();
            if (contas[i].getSaldo() < menorSaldo) {
                menorSaldo = contas[i].getSaldo();
                nomeMenorSaldo = contas[i].getNome();
            }
            saldoTotal += contas[i].getSaldo();
        }

        System.out.print("\nSaldo total: " + saldoTotal);
        System.out.print("\nMaior saldo: " + maiorSaldo);
        System.out.print("\nNome do titular com menor saldo: " + nomeMenorSaldo);

        input.close();
    }
}