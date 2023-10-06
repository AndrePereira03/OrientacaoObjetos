package Lista01.Exercicio06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    ContaPoupanca poupanca;

    @BeforeEach
    void setUp()
    {
        poupanca = new ContaPoupanca();
    }

    @Test
    void deveRetornarSaldoAposDepositao()
    {
        poupanca.setSaldo(1000.0f);
        poupanca.depositar(300.0f);
        assertEquals(1300.0f, poupanca.getSaldo());
    }

    @Test
    void deveRetornarDepositoInvalido()
    {
        poupanca.setSaldo(1000.0f);
        try
        {
            poupanca.depositar(0.0f);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("valor invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarSaldoAposSaque()
    {
        poupanca.setSaldo(1000.0f);
        poupanca.sacar(1000.0f);
        assertEquals(0.0f, poupanca.getSaldo());
    }

    @Test
    void deveRetornarSaldoInsuficiente()
    {
        poupanca.setSaldo(1000.0f);
        try
        {
            poupanca.sacar(1000.01f);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("Saldo insuficiente", e.getMessage());
        }
    }

    @Test
    void deveRetornarJuros()
    {
        poupanca.setSaldo(1000.0f);
        poupanca.setTaxa(1.0f);
        assertEquals(10.0f, poupanca.calcularJuros());
    }
}