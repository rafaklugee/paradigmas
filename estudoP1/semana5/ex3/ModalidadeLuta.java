public abstract class ModalidadeLuta implements Modalidade {
    // Atributos
        protected String equipamentos;
        protected String vestuarios;
        protected String estrategias;

    // Construtor
    public ModalidadeLuta(String equipamentos, String vestuarios, String estrategias) {
        this.equipamentos = equipamentos;
        this.vestuarios = vestuarios;
        this.estrategias = estrategias;
    }

    // Métodos
    public String getObjetivos() {
        return "Autodefesa";
    }

    public String getRegras() {
        return "Segurança dos participantes";
    }
}