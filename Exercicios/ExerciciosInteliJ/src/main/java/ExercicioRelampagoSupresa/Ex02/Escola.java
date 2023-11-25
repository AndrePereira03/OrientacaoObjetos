package ExercicioRelampagoSupresa.Ex02;

public class Escola
{
    private Cidade cidade;
    private Professor diretor;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        this.diretor = diretor;
    }

    public String getEscolaridadeDiretor()
    {
        return diretor.getTitulacaoProfessor();
    }

    /*public String getTitulacaoDiretor()
    {
        return diretor.titulacaoProfessor();
    }*/
}
