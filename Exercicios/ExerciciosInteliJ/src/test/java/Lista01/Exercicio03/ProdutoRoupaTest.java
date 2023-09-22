package Lista01.Exercicio03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest
{
    ProdutoRoupa roupa;

    @BeforeEach
    void setUp()
    {
        roupa = new ProdutoRoupa();
    }

    @Test
    public void deveRetornarPrecoRoupaComDesc()
    {
        roupa.setPrecoBase(200.0f);
        assertEquals(160.0f, roupa.calculaPreco());
    }
    @Test
    public void deveRetornarPrecoRoupaSemDesc()
    {
        roupa.setPrecoBase(199.99f);
        assertEquals(199.99f, roupa.calculaPreco());
    }
}