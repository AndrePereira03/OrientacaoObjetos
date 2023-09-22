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
    void deveRetornarPrecoEletronico()
    {
        eletronico.setPrecoBase(1000);
        assertEquals(900.0f, eletronico.calculaPreco());
    }
}