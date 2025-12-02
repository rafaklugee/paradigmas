public class Principal {
    public static void main(String[] args) {
        LampadaFluorescente l1 = new LampadaFluorescente(true, 10);
        LampadaLed l2 = new LampadaLed(false);

        System.out.print("\nO estado inicial das lâmpadas é (true = ligada | false = desligada): " + l1.isAtivo() + " | " + l2.isAtivo());
        
        l1.ligaDesliga();
        l2.ligaDesliga();

        System.out.print("\nO estado final das lâmpadas é (true = ligada | false = desligada): " + l1.isAtivo() + " | " + l2.isAtivo() + "\n");
    }
}