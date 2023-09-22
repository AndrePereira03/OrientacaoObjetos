package Lista01.Exercicio03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    ProdutoEletronico eletronico;

    @BeforeEach
    void setUp()
    {
        eletronico = new ProdutoEletronico();
    }

    @Test
    void deveRetornarPrecoEletronicoComDesc()
    {
        eletronico.setPrecoBase(300.0f);
        assertEquals(270.0f, eletronico.calculaPreco());
    }
    @Test
    void deveRetornarPrecoEletronicoSemDesc()
    {
        eletronico.setPrecoBase(299.99f);
        assertEquals(299.99f, eletronico.calculaPreco());
    }
}