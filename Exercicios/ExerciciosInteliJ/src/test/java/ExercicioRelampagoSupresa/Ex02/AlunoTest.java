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


    @BeforeEach
    void setUp()
    {
        aluno = new Aluno();
        cidade = new Cidade();
        estado = new Estado();
    }

    @Test
    void deveRetornarEstadoAluno()
    {
        aluno.setCidade(cidade);
        aluno.getCidade().setEstado(estado);
        aluno.getCidade().getEstado().setNome("Roraima");
        assertEquals("Roraima", aluno.getEstadoNaturalidade());
    }

    @Test
    void deveRetornarEstadoAlunoEstuda()
    {
        curso = new Curso();
        escola = new Escola();
        aluno.setCurso(curso);
        aluno.getCurso().setEscola(escola);
        aluno.getCurso().getEscola().setCidade(cidade);
        aluno.getCurso().getEscola().getCidade().setEstado(estado);
        aluno.getCurso().getEscola().getCidade().getEstado().setNome("Juiz de fora");
        assertEquals("Juiz de fora", aluno.getEstadoEscolaAluno());
    }
}