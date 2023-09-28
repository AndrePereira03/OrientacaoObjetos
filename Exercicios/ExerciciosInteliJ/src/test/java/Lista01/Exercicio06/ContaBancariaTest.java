package Lista01.Exercicio06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    ContaBancaria conta;

    @BeforeEach
    void setUp()
    {
        conta = new ContaPoupanca();
    }

    @Test
    void deveRetornarNumeroConta()
    {
        conta.setNumeroConta(1224);
        assertEquals(1224, conta.getNumeroConta());
    }

    @Test
    VOID
}