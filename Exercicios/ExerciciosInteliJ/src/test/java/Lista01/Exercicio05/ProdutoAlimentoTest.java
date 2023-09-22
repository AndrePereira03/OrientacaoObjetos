package Lista01.Exercicio05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoAlimentoTest {

    ProdutoAlimento alimento;

    @BeforeEach
    void setUp()
    {
        alimento = new ProdutoAlimento();
    }

    @Test
    void deveRetornarPrecoComDesc()
    {
        alimento.setQtddComprada(6);
        alimento.setPrecoUnitario(5.0f);
        assertEquals(25.5f, alimento.calculaPreco());
    }

    @Test
    void deveRetornarPrecoSemDesc()
    {
        alimento.setQtddComprada(5);
        alimento.setPrecoUnitario(5.0f);
        assertEquals(25.0f, alimento.calculaPreco());
    }


}