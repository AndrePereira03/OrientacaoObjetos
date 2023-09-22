package Lista01.Exercicio05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    ProdutoRoupa roupa;

    @BeforeEach
    void setUp()
    {
        roupa = new ProdutoRoupa();
    }

    @Test
    void deveRetornarPrecoComDesc()
    {
        roupa.setPrecoUnitario(25.0f);
        roupa.setQtddComprada(3);
        assertEquals(63.75f, roupa.calculaPreco());
    }

    void deveRetornarPrecoSemDesc()
    {
        roupa.setPrecoUnitario(25.0f);
        roupa.setQtddComprada(2);
        assertEquals(50.0f, roupa.calculaPreco());
    }
}