package ExercicioRelampagoSupresa.Ex02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    Escolaridade escolaridade;
    Professor diretor;

    @BeforeEach
    void setUp()
    {
        diretor = new Professor();
        escolaridade = new Escolaridade();
    }

    @Test
    void deveRetornarEscolaridadeDiretor()
    {
        diretor.setEscolaridade(escolaridade);
        diretor.getEscolaridade().setTitulacao("PosDoutorado");
        assertEquals("PosDoutorado", diretor.getTitulacaoProfessor());
    }
}