package ExercicioRelampagoSupresa.Ex02;

public class Professor extends Pessoa
{
    private Curso contratado;

    public Curso getContratado() {
        return contratado;
    }

    public void setContratado(Curso contratado) {
        if(contratado == null)
        {
            throw new IllegalArgumentException("professor contratado nao definido");
        }
        this.contratado = contratado;
    }

    public String getTitulacaoProfessor()
    {
        return getEscolaridade().getTitulacao();
    }

    public String getCidadeProfessor()
    {
        return getCidade().getNome();
    }

    public String getTipoEnsinoContratado()
    {
        return getContratado().getEnsino().getNivel();
    }

    public String getDiretorProfessor()
    {
        return getContratado().getEscola().getDiretor().getNome();
    }

    public String getCoordenadorProfessor()
    {
        return getContratado().getCoordenador().getNome();
    }


}
