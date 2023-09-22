package Lista01.Exercicio03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    ProdutoLivro livro;

    @BeforeEach
    void setUp()
    {
        livro = new ProdutoLivro();
    }

    @Test
    void deveRetornarPrecoLivro()
    {
        livro.setPrecoBase(100);
        assertEquals(95.0f, livro.calculaPreco());
    }
}