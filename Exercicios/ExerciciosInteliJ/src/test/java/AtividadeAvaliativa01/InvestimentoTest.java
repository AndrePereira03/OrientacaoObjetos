package AtividadeAvaliativa01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestimentoTest {

    Investimento investimento;

    @BeforeEach
    void setUp()
    {
        investimento = new Investimento();
    }

    @Test
    void deveRetornarTaxaPorcentual()
    {
        investimento.setTaxa(1.0f);
        assertEquals(0.01f, investimento.getTaxa());
    }

    @Test
    void deveRetornarInvestimentoInvalido()
    {
        investimento.setSaldo(100.0f);
        try
        {
            investimento.investir(0.0f);
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("valor invalido", e.getMessage());
        }
    }
    @Test
    void deveRetornarInvestimentoValido()
    {
        investimento.setSaldo(100.0f);
        investimento.investir(100.0f);
        assertEquals(200.0f, investimento.getSaldo());
    }

    @Test
    void deveRetornarResgateInvalido()
    {
        investimento.setSaldo(100.0f);
    }

    @Test
    void deveRetornarValorInsuficienteResgate()
    {
        investimento.setSaldo(100.0f);
        investimento.setTaxa(1);
        try
        {
            investimento.resgatar(100.0f);
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("Valor insuficiente", e.getMessage());
        }
    }

    @Test
    void deveRetornarResgateValido()
    {
        investimento.setSaldo(100.0f);
        investimento.setTaxa(1.0f);
        investimento.resgatar(99.0f);
        assertEquals(0.1f, investimento.getSaldo(), 0.1f);
    }
}