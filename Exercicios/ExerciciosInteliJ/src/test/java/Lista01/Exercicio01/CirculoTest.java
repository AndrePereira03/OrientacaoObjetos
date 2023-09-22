package Lista01.Exercicio01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest
{
    Circulo circulo;

    @BeforeEach
    void setUP()
    {
        circulo = new Circulo();
    }

    @Test
    void deveRetornarAreaCirculo()
    {
        circulo.setRaio(1.0f);
        assertEquals(Math.PI, circulo.calculaArea());
    }
    @Test
    void deveRetornarPerimetroCirculo()
    {
        circulo.setRaio(1.0f);
        assertEquals(2.0f * Math.PI, circulo.calculaPerimetro());
    }
}