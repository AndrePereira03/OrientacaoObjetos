package ExercicioRelampagoSupresa.Ex02;

public class Curso
{
    private TipoEnsino ensino;
    private Professor coordenador;

    public TipoEnsino getEnsino() {
        return ensino;
    }

    public void setEnsino(TipoEnsino ensino) {
        this.ensino = ensino;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    /*public String getCoordenadorEscolaridade()
    {
        return coordenador.titulacaoProfessor();
    }*/
}
