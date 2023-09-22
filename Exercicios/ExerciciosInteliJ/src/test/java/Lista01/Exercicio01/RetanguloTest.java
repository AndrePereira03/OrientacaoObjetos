package Lista01.Exercicio01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    Retangulo retangulo;
    @BeforeEach
    void setUp()
    {
        retangulo = new Retangulo();
    }
    @Test
    void deveRetornarArea()
    {
        retangulo.setBase(8);
        retangulo.setAltura(3);
        assertEquals(24, retangulo.calculaArea());
    }

    @Test
    void deveRetornarPerimetro()
    {
        retangulo.setAltura(3);
        retangulo.setBase(4);
        assertEquals(14, retangulo.calculaPerimetro());
    }
}