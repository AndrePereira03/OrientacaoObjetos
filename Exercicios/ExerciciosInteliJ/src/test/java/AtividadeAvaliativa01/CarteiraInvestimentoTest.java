package AtividadeAvaliativa01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarteiraInvestimentoTest {

    CarteiraInvestimento carteira;

    @BeforeEach
    void setUp()
    {
        carteira = new Investimento();
    }

    @Test
    void deveRetornarNumeroCarteira()
    {
        carteira.setNumeroCarteira(1);
        assertEquals(1, carteira.getNumeroCarteira());
    }

    @Test
    void deveRetornarSaldo()
    {
        carteira.setSaldo(100.0f);
        assertEquals(100.0f, carteira.getSaldo());
    }
}