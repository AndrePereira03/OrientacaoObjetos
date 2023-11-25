package ExercicioRelampagoSupresa.Ex02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    Professor professor;
    Escolaridade escolaridade;
    Cidade cidade;
    Curso curso;
    TipoEnsino tipoEnsino;

    @Test
    void deveRetornarEscolaridadeCordenador()
    {
        professor = new Professor();
        escolaridade = new Escolaridade();
        professor.setEscolaridade(escolaridade);
        professor.getEscolaridade().setTitulacao("Mestrado");
        assertEquals("Mestrado", professor.getTitulacaoProfessor());
    }

    @Test
    void deveRetornarCidadeProfessor()
    {
        professor = new Professor();
        cidade = new Cidade();
        professor.setCidade(cidade);
        professor.getCidade().setNome("Juiz de Fora");
        assertEquals("Juiz de Fora", professor.getCidadeProfessor());
    }

    @Test
    void deveRetornarTipoEnsinoContratado()
    {
        Professor contratado;
        contratado = new Professor();
        curso = new Curso();
        tipoEnsino = new TipoEnsino();
        contratado.setContratado(curso);
        contratado.getContratado().setEnsino(tipoEnsino);
        contratado.getContratado().getEnsino().setNivel("Superior");
        assertEquals("Superior", contratado.getTipoEnsinoContratado());
    }

    @Test
    void deveRetornarDiretorProfessor()
    {
        Escola escola;
        Professor diretor;
        professor = new Professor();
        curso = new Curso();
        escola = new Escola();
        diretor = new Professor();
        professor.setContratado(curso);
        professor.getContratado().setEscola(escola);
        professor.getContratado().getEscola().setDiretor(diretor);
        professor.getContratado().getEscola().getDiretor().setNome("Joao");
        assertEquals("Joao", professor.getDiretorProfessor());
    }

    @Test
    void deveRetornarCoordenadorProfessor()
    {
        Professor coordenador;
        professor = new Professor();
        coordenador = new Professor();
        curso = new Curso();
        professor.setContratado(curso);
        professor.getContratado().setCoordenador(coordenador);
        professor.getContratado().getCoordenador().setNome("Iandra");
        assertEquals("Iandra", professor.getCoordenadorProfessor());
    }


}