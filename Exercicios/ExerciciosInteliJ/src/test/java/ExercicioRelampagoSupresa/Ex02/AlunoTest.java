package ExercicioRelampagoSupresa.Ex02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    Aluno aluno;
    Cidade cidade;
    Estado estado;
    Curso curso;
    Escola escola;
    Professor coordenador;


    @BeforeEach
    void setUp()
    {
        aluno = new Aluno();
    }

    @Test
    void deveRetornarEstadoAluno()
    {
        cidade = new Cidade();
        estado = new Estado();
        aluno.setCidade(cidade);
        aluno.getCidade().setEstado(estado);
        aluno.getCidade().getEstado().setNome("Roraima");
        assertEquals("Roraima", aluno.getEstadoNaturalidade());
    }

    @Test
    void deveRetornarEstadoAlunoEstuda()
    {
        cidade = new Cidade();
        estado = new Estado();
        curso = new Curso();
        escola = new Escola();
        aluno.setCurso(curso);
        aluno.getCurso().setEscola(escola);
        aluno.getCurso().getEscola().setCidade(cidade);
        aluno.getCurso().getEscola().getCidade().setEstado(estado);
        aluno.getCurso().getEscola().getCidade().getEstado().setNome("Juiz de fora");
        assertEquals("Juiz de fora", aluno.getEstadoEscolaAluno());
    }

    @Test
    void deveRetornarCoordenadorCursoAluno()
    {
        curso = new Curso();
        coordenador = new Professor();
        aluno.setCurso(curso);
        aluno.getCurso().setCoordenador(coordenador);
        aluno.getCurso().getCoordenador().setNome("Iandra");
        assertEquals("Iandra", aluno.getCoordenadorCursoAluno());
    }


}