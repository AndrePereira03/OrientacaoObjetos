package ExercicioRelampagoSupresa.Ex02;

public class Aluno extends Pessoa
{
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getEstadoNaturalidade()
    {
        return getCidade().getEstado().getNome();
    }

    public String getEstadoEscolaAluno()
    {
        return getCurso().getEscola().getCidade().getEstado().getNome();
    }

    public String getCoordenadorCursoAluno()
    {
        return getCurso().getCoordenador().getNome();
    }

}
