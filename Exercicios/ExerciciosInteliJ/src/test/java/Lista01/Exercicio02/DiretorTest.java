package Lista01.Exercicio02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    Diretor diretor;

    @BeforeEach
    void setUp()
    {
        diretor = new Diretor();
    }

    @Test
    void deveRetornarPagamentoDiretor()
    {
        diretor.setLucro(200000);
        diretor.setSalarioMensal(43000);
        assertEquals(63000, diretor.calculaPagamento());
    }
}