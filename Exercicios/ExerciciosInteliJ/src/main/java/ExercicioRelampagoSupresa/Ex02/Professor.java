package ExercicioRelampagoSupresa.Ex02;

public class Professor extends Pessoa
{
    private Professor contratado;

    public Professor getContratado() {
        return contratado;
    }

    public void setContratado(Professor contratado) {
        this.contratado = contratado;
    }

    public String getTitulacaoProfessor()
    {
        return getEscolaridade().getTitulacao();
    }


}
