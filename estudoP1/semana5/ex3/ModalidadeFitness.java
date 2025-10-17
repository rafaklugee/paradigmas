public abstract class ModalidadeFitness implements Modalidade {
    // Atributos
        protected int horas;
        protected int min;

    // Construtor
    public ModalidadeFitness(int horas, int min) {
        this.horas = horas;
        this.min = min;
    }

    // Métodos
    public String getObjetivos() {
        return "Melhora do condicionamento físico";
    }

    public String getRegras() {
        return "Principio da progressão";
    }
}