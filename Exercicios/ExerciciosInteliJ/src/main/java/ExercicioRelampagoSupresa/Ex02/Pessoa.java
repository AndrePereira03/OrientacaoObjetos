package ExercicioRelampagoSupresa.Ex02;

public class Pessoa
{
    private Cidade naturalidade;
    private Escolaridade escolaridade;

    public Cidade getCidade() {
        return naturalidade;
    }

    public void setCidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }
}
