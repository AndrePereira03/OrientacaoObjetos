package Lista01.Exercicio08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    Moto moto;

    @BeforeEach
    void setUp()
    {
        moto = new Moto();
    }

    @Test
    void deveRetornarCustoMoto()
    {
        moto.setPrecoBase(4000.0f);
        moto.setFatorPreco(32.0f);
        assertEquals(5280.0f, moto.calcularCusto(), 0.01f);
    }
}