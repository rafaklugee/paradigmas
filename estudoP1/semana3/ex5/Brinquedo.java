public class Brinquedo {
    // Atributos
    private String nomeBrinquedo;
    private double alturaMin;
    private double precoIngresso;

    // Construtor
    public Brinquedo(String nomeBrinquedo, double alturaMin, double precoIngresso) {
        this.nomeBrinquedo = nomeBrinquedo;
        this.alturaMin = alturaMin;
        this.precoIngresso = precoIngresso;
    }

    // Método
    public void possuiAlturaMin(double altura) {
        if (altura >= this.alturaMin)
            System.out.println("Pode entrar!");
        else
            System.out.println("Não tem a altura mínima.");
    }
}