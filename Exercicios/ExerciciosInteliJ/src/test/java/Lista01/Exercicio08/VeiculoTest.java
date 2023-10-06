package Lista01.Exercicio08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    Veiculo veiculo;

    @BeforeEach
    void setUp()
    {
        veiculo = new Carro();
    }

    @Test
    void deveRetornarMarca()
    {
        veiculo.setMarca("toyota");
        assertEquals("toyota", veiculo.getMarca());
    }

    @Test
    void deveRetornarModelo()
    {
        veiculo.setModelo("hilux branca 2021");
        assertEquals("hilux branca 2021", veiculo.getModelo());
    }


}