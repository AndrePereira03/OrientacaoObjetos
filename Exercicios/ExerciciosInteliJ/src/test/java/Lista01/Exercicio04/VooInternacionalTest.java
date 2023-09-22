package Lista01.Exercicio04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooInternacionalTest
{
    VooInternacional internacional;

    @BeforeEach
    void setUp()
    {
        internacional = new VooInternacional();
    }

    @Test
    void deveRetornarPrecoTaxado()
    {
        internacional.setDistancia(750.0f);
        assertEquals(1653.3f, internacional.calculaPreco());
    }

    @Test
    void deveRetornarPrecoSemTaxa()
    {
        internacional.setDistancia(749.99f);
        assertEquals(1252.4833f, internacional.calculaPreco());
    }
}