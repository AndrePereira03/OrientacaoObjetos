package AtividadeAvaliativa01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BolsaValoresTest
{

    BolsaValores bolsa;

    @BeforeEach
    void setUp()
    {
        bolsa = new BolsaValores();
    }

    @Test
    void deveRetornarTaxa()
    {
        bolsa.setTaxa(50.0f);
        assertEquals(50.0f, bolsa.getTaxa());
    }

    @Test
    void deveRetornarSaldoAposInvestimentoInvalido()
    {
        try
        {
            bolsa.investir(0.0f);
            fail();
        }
        catch(IllegalArgumentException e)
        {
            assertEquals("valor invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarSaldoAposInvestimentoInsuficiente()
    {
        bolsa.setTaxa(50.0f);
        bolsa.setSaldo(30.0f);
        try
        {
            bolsa.investir(19.9f);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("saldo insuficiente", e.getMessage());
        }
    }

    @Test
    void deveRetornarSaldoAposInvestimentoValido()
    {
        bolsa.setTaxa(50.0f);
        bolsa.setSaldo(30.0f);
        bolsa.investir(20.0f);
        assertEquals(0.0f, bolsa.getSaldo());
    }

    @Test
    void deveRetornarSaldoInsuficienteResgate()
    {
        bolsa.setSaldo(100.0f);
        try
        {
            bolsa.resgatar(100.01f);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("saldo insuficiente", e.getMessage());
        }
    }

    @Test
    void deveRetornarResgateInvalido()
    {
        bolsa.setSaldo(100.0f);
        try
        {
            bolsa.resgatar(0.0f);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("valor invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarSaldoAposResgateValido()
    {
        bolsa.setSaldo(100.0f);
        bolsa.resgatar(100.0f);
        assertEquals(0.0f, bolsa.getSaldo());
    }
}