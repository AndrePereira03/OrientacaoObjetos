package ExercicioRelampagoSupresa.Ex03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest
{
    @Test
    void deveRetornarVenderEstoqueInsuficiente()
    {
        Cliente cliente = new Cliente("Valdecir", "000.000.000-00");
        Produto produto = new Produto("Cadeira", 30, 80, 20, 100);
        Venda venda = new Venda("26/07/2023", cliente, produto, 40);
        //venda.getProduto().setQtdeEstoque(30);
        assertFalse(venda.vender(produto,31));
    }

    @Test
    void deveRetornarVenderEstoqueBaixo()
    {
        Cliente cliente = new Cliente("Valdecir", "000.000.000-00");
        Produto produto = new Produto("Cadeira", 30, 80, 20, 100);
        Venda venda = new Venda("26/07/2023", cliente, produto, 40);
        assertFalse(venda.vender(produto,11));
    }

    @Test
    void deveRetornarVender()
    {
        Cliente cliente = new Cliente("Valdecir", "000.000.000-00");
        Produto produto = new Produto("Cadeira", 30, 80, 20, 100);
        produto.vender("26/07/2023", cliente, 10);
        assertTrue(produto.getHistorico().contains("Venda realizada: " + 10 + " unidades"));
    }

}