public class Autor {
    // Atributos
    private String nome;
    private String nacionalidade;

    // Construtores
    public Autor(String nome) {
        this.setNome(nome);
    }

    public Autor(String nome, String nacionalidade) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
    }

    // Métodos
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null)
            this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        if (nacionalidade != null)
            this.nacionalidade = nacionalidade;
    }

}