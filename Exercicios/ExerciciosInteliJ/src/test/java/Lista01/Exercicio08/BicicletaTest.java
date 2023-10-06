package Lista01.Exercicio08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicicletaTest {

    Bicicleta bicicleta;

    @BeforeEach
    void setUp()
    {
        bicicleta = new Bicicleta();
    }

    @Test
    void deveRetornarCustoBicicleta()
    {
        bicicleta.setPrecoBase(2000.0f);
        bicicleta.setFatorPreco(9);
        assertEquals(2180.0f, bicicleta.calcularCusto());
    }
}