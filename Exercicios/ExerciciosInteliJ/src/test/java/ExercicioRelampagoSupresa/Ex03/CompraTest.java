package ExercicioRelampagoSupresa.Ex03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest
{
    @Test
    void deveRetornarCompraEstoqueExcedente()
    {
        Fornecedor fornecedor = new Fornecedor("Magalu", "000.000.000-00");
        Produto produto = new Produto("Televisao", 30, 2340, 5, 40);
        Compra compra = new Compra("24/03/2022", produto, fornecedor, 10000, 4300);
        assertFalse(compra.comprar(produto, 11));
    }

    @Test
    void deveRetornarCompraEstoqueAdequado()
    {
        Fornecedor fornecedor = new Fornecedor("Magalu", "000.000.000-00");
        Produto produto = new Produto("Televisao", 30, 2340, 5, 40);
        Compra compra = new Compra("24/03/2022", produto, fornecedor, 10000, 4300);
        assertTrue(compra.comprar(produto, 10));
    }


}