package ExercicioRelampagoSupresa.Ex02;

public class Pessoa
{
    private Cidade naturalidade;
    private Escolaridade escolaridade;
    private String nome;

    public Cidade getCidade() {
        return naturalidade;
    }

    public void setCidade(Cidade naturalidade) {
        if(naturalidade == null)
        {
            throw new IllegalArgumentException("naturalidade nao definida");
        }
        this.naturalidade = naturalidade;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        if(escolaridade == null)
        {
            throw new IllegalArgumentException("escolaridade nao definida");
        }
        this.escolaridade = escolaridade;
    }

    public Cidade getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
