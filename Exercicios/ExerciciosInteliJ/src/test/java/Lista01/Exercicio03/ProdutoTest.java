package Lista01.Exercicio03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    Produto produto;

    @BeforeEach
    void setUp()
    {
        produto = new ProdutoEletronico();
    }

    @Test
    void deveRetornarNome()
    {
        produto.setNome("notebook");
        assertEquals("notebook", produto.getNome());
    }
}