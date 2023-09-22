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
    public void deveRetornarPrecoRoupa()
    {
        roupa.setPrecoBase(100);
        assertEquals(80.0f, roupa.calculaPreco());
    }
}