package ExercicioRelampagoSupresa.Ex02;

public class Professor extends Pessoa
{
    private Curso contratado;

    public Curso getContratado() {
        return contratado;
    }

    public void setContratado(Curso contratado) {
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


}
