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
        conta.setNumeroConta(1224.0f);
        assertEquals(1224.0f, conta.getNumeroConta());
    }

    @Test
    void deveRetornarNomeTitular()
    {
        conta.setTitular("Jose");
        assertEquals("Jose", conta.getTitular());
    }

    @Test
    void deveRetornarSaldo()
    {
        conta.setSaldo(1000.0f);
        assertEquals(1000.0f, conta.getSaldo());
    }

    @Test
    void deveRetornarTaxa()
    {
        conta.setTaxa(30.0f);
        assertEquals(0.3f, conta.getTaxa());
    }

}