package Lista01.Exercicio05;

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
    void deveRetornarPrecoComDesc()
    {
        eletronico.setQtddEstoque(4);
        eletronico.setQtddComprada(4);
        eletronico.setPrecoUnitario(15.0f);
        assertEquals(54, eletronico.calculaPreco());
    }

    @Test
    void deveRetornarPrecoSemDesc()
    {
        eletronico.setQtddEstoque(3);
        eletronico.setQtddComprada(3);
        eletronico.setPrecoUnitario(15.0f);
        assertEquals(45, eletronico.calculaPreco());
    }
}