package Lista01.Exercicio08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    Carro carro;

    @BeforeEach
    void setUp()
    {
        carro = new Carro();
    }

    @Test
    void deveRetornarCustoCarro()
    {
        carro.setPrecoBase(20000.0f);
        carro.setFatorPreco(73.0f);
        assertEquals(34600.0f, carro.calcularCusto());
    }
}