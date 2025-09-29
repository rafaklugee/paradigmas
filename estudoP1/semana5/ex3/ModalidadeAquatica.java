public abstract class ModalidadeAquatica implements Modalidade {
    // Atributos
        protected int segundosSubmerso;

    // Construtor
    public ModalidadeAquatica(int segundosSubmerso) {
        this.segundosSubmerso = segundosSubmerso;
    }

    // Métodos
    public String getObjetivos() {
        return "Melhora a respiração";
    }

    public String getRegras() {
        return "Não afogar-se";
    }
}