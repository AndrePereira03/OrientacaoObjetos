package Lista01.Exercicio02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    Gerente gerente;

    @BeforeEach
    void setUp()
    {
        gerente = new Gerente();
    }

    @Test
    void deveRetornarPagamentoGerente()
    {
        gerente.setSalarioMensal(5000);
        assertEquals(6350, gerente.calculaPagamento());
    }
}