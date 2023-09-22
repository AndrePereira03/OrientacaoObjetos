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
    void deveRetornarPrecoLivroComDesc()
    {
        livro.setPrecoBase(50.0f);
        assertEquals(47.5f, livro.calculaPreco());
    }
    @Test
    void deveRetornarPrecoLivroSemDesc()
    {
        livro.setPrecoBase(49.99f);
        assertEquals(49.99f, livro.calculaPreco());
    }
}