package ExercicioRelampagoSupresa.Ex02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    Professor coordenador;
    Escolaridade escolaridade;

    @BeforeEach
    void setUp()
    {
        coordenador = new Professor();
        escolaridade = new Escolaridade();
    }

    @Test
    void deveRetornarEscolaridadeCoordenador()
    {
        coordenador.setEscolaridade(escolaridade);
        coordenador.getEscolaridade().setTitulacao("Doutorado");
        assertEquals("Doutorado", coordenador.getTitulacaoProfessor());
    }
}