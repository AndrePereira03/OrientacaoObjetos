package Lista01.Exercicio04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooDomesticoTest {

    VooDomestico domestico;

    @BeforeEach
    void setUp()
    {
        domestico = new VooDomestico();
    }

    @Test
    void deveRetornarPrecoDomestico()
    {
        domestico.setDistancia(300.0f);
        domestico.setTaxa(27.0f);
        assertEquals(381.0f, domestico.calculaPreco());
    }
}