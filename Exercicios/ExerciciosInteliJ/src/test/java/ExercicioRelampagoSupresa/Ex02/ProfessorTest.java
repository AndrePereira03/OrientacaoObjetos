package ExercicioRelampagoSupresa.Ex02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    Professor professor;
    Escolaridade escolaridade;
    Cidade cidade;

    @BeforeEach
    void setUp() {
        professor = new Professor();
    }

    @Test
    void deveRetornarEscolaridadeCordenador()
    {
        escolaridade = new Escolaridade();
        professor.setEscolaridade(escolaridade);
        professor.getEscolaridade().setTitulacao("Mestrado");
        assertEquals("Mestrado", professor.getTitulacaoProfessor());
    }

    @Test
    void deveRetornarCidadeProfessor()
    {
        cidade = new Cidade();
        professor.setCidade(cidade);
        professor.getCidade().setNome("Juiz de Fora");
        assertEquals("Juiz de Fora", professor.getCidadeProfessor());
    }
}