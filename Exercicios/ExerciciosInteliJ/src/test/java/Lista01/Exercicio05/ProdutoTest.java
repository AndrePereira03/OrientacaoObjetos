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
    void deveRetornarNome()
    {
        produto.setNome("Notebook");
        assertEquals("Notebook", produto.getNome());
    }
}