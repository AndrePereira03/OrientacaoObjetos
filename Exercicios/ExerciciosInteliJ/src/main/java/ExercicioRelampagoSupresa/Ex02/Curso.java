package ExercicioRelampagoSupresa.Ex02;

public class Curso
{
    private TipoEnsino ensino;
    private Professor coordenador;
    private Escola escola;

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

    public Escola getEscola()
    {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public String getEscolaridadeCoordenadorCurso()
    {
        return coordenador.getTitulacaoProfessor();
    }

}
