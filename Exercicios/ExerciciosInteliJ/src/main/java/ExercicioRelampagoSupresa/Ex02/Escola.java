package ExercicioRelampagoSupresa.Ex02;

public class Escola
{
    private Cidade cidade;
    private Professor diretor;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        if(cidade == null)
        {
            throw new IllegalArgumentException("cidade nao definida");
        }
        this.cidade = cidade;
    }

    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        if(diretor == null)
        {
            throw new IllegalArgumentException("diretor nao definido");
        }
        this.diretor = diretor;
    }

    public String getEscolaridadeDiretor()
    {
        return diretor.getTitulacaoProfessor();
    }
}
