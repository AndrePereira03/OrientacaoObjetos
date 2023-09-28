package Lista01.Exercicio05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    Produto produto;

    @BeforeEach
    void setUp()
    {
        produto = new ProdutoAlimento();
    }

    @Test
    void deveRetornarQtddEstoqueAposCompra()
    {
        produto.setQtddEstoque(100);
        produto.setQtddComprada(8);
        assertEquals(92, produto.getQtddEstoque());
    }

    @Test
    void deveRetornarQtddCompradaCorreta()
    {
        produto.setQtddEstoque(200);
        produto.setQtddComprada(200);
        assertEquals(0, produto.getQtddEstoque());
    }

    @Test
    void deveRetornarQtddCompradaErro()
    {
        produto.setQtddEstoque(200);
        try
        {
            produto.setQtddComprada(201);
            fail();
        }
        catch(IllegalArgumentException e)
        {
            assertEquals("estoque insuficiente", e.getMessage());
        }
    }


    @Test
    void deveRetornarNome()
    {
        produto.setNome("Notebook");
        assertEquals("Notebook", produto.getNome());
    }
}