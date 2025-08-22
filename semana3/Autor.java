public class Autor {
    // Atributos
    private String nome;
    private String nacionalidade;

    // Construtores
    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    // Métodos
    public String getNome() {
        return this.nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNome(String nome) {
        if(!nome.equals(null))
            this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        if(!nacionalidade.equals(null))    
            this.nacionalidade = nacionalidade;
    }


    
}
