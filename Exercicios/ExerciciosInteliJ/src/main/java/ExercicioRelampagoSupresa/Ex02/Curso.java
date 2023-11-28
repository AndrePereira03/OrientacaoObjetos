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
        if(ensino == null)
        {
            throw new IllegalArgumentException("tipo de ensino nao definido");
        }
        this.ensino = ensino;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        if(coordenador == null)
        {
            throw new IllegalArgumentException("coordenador nao definido");
        }
        this.coordenador = coordenador;
    }

    public Escola getEscola()
    {
        return escola;
    }

    public void setEscola(Escola escola) {
        if(escola == null)
        {
            throw new IllegalArgumentException("escola nao definida");
        }
        this.escola = escola;
    }

    public String getEscolaridadeCoordenadorCurso()
    {
        return coordenador.getTitulacaoProfessor();
    }

}
