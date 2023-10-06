package Lista01.Exercicio06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    ContaCorrente corrente;

    @BeforeEach
    void setUp()
    {
        corrente = new ContaCorrente();
    }

    @Test
    void deveRetornarSaldoAposDeposito()
    {
        corrente.setSaldo(1000.0f);
        corrente.depositar(100.0f);
        assertEquals(1100.0f, corrente.getSaldo());
    }

    @Test
    void deveRetornarDepositoInvalido()
    {
        corrente.setSaldo(1000.0f);
        try
        {
            corrente.depositar(0.0f);
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
        corrente.setSaldo(1000.0f);
        corrente.sacar(1000.0f);
        assertEquals(0.0f, corrente.getSaldo());
    }

    @Test
    void deveRetornarSaldoInsuficiente()
    {
        corrente.setSaldo(1000.0f);
        try
        {
            corrente.sacar(1000.1f);
            fail();
        }
        catch(IllegalArgumentException e)
        {
            assertEquals("Saldo insuficiente", e.getMessage());
        }
    }

    @Test
    void deveRetornarJuros()
    {
        corrente.setSaldo(1000.0f);
        corrente.setTaxa(5.0f);
        assertEquals(-50.0f, corrente.calcularJuros());
    }
}