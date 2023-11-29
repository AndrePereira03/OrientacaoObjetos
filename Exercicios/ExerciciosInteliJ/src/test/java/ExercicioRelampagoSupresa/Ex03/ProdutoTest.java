package ExercicioRelampagoSupresa.Ex03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveVerificarEstoqueMaximo()
    {
        Produto produto = new Produto("Vassoura", 80, 20, 20, 100);
        try
        {
            produto.setQtdeEstoque(101);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("Estoque acima do permitido.", e.getMessage());
        }
    }

   @Test
    void deveVerificarEstoqueMinimo()
   {
       Produto produto = new Produto("Vassoura", 80, 20, 20, 100);
       try
       {
           produto.setQtdeEstoque(19);
           fail();
       }
       catch (IllegalArgumentException e)
       {
           assertEquals("Estoque abaixo do permitido.", e.getMessage());
       }
   }

   @Test
    void deveVerificarEstoqueIdeal()
   {
       Produto produto1 = new Produto("Vassoura", 80, 20, 80, 100);
       assertEquals(80, produto1.getQtdeEstoque());
       Produto produto2 = new Produto("Vassoura", 100, 20, 80, 100);
       assertEquals(100, produto2.getQtdeEstoque());
   }

   @Test
    void deveRetornarDebitoEstoqueInsuficiente()
    {
        Produto produto = new Produto("Celular", 30, 5000, 8, 40);
        try
        {
            produto.debitarEstoque(31);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("Estoque insuficiente.", e.getMessage());
        }
    }

    @Test
    void deveRetornarDebitoEstoque()
    {
        Produto produto = new Produto("Celular", 30, 5000, 10, 40);
        produto.debitarEstoque(21);
        assertEquals(9, produto.getQtdeEstoque());
        produto.debitarEstoque(9);
        assertEquals(0, produto.getQtdeEstoque());
    }

    @Test
    void deveCreditarEstoque()
    {
        Produto produto = new Produto("Chinelo", 50, 40, 10, 60);
        produto.creditarEstoque(10);
        assertEquals(60, produto.getQtdeEstoque());
    }

    @Test
    void deveVerificarEstoqueBaixo()
    {
        Produto produto = new Produto("Jornal", 200, 1, 30, 500);
        produto.debitarEstoque(171);
        assertTrue(produto.verificarEstoqueBaixo());
    }

    @Test
    void deveVerificarEstoqueInsuficiente()
    {
        Produto produto = new Produto("Notebook", 50, 7500, 10, 80);
        assertTrue(produto.verificarEstoqueInsuficiente(51));
    }

    @Test
    void deveVerificarEstoqueExcedente()
    {
        Produto produto = new Produto("Cama", 8, 2300, 7, 13);
        assertTrue(produto.verificarEstoqueExcedente(6));
    }

    @Test
    void deveCalcularValorVendaSemEstoque()
    {
        Produto produto = new Produto("Fogao", 27, 839, 10, 43);
        try
        {
            produto.calcularValorVenda(28);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("Estoque insuficiente.", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorVenda()
    {
        Produto produto = new Produto("Fogao", 27, 839, 10, 43);
        assertEquals(22653, produto.calcularValorVenda(27));
    }

    @Test
    void deveVenderRegistrarHistorico()
    {
        Cliente cliente = new Cliente("Jose", "000.000.000-00");
        Produto produto = new Produto("Geladeira", 80, 2900, 10, 100);
        produto.vender("25/05/2023", cliente, 6);
      //   List<String> historico = produto.getHistorico();
        assertTrue(produto.getHistorico().contains("Venda realizada: " + 6 + " unidades"));
    }

    @Test
    void deveComprarRegistrarHistorico()
    {
        Fornecedor fornecedor = new Fornecedor("Magalu", "000.000.000-00");
        Produto produto = new Produto("Notebook", 10, 4230, 4, 20);
        produto.comprar("20/03/2022", fornecedor, 10, 4230);
        assertTrue(produto.getHistorico().contains("Compra realizada: " + 10 + " unidades"));
    }

    @Test
    void deveRetornarAcrescimoTransacao()
    {
        Produto produto = new Produto("Bombom", 200, 2, 20, 500);
        produto.registrarHistorico("Abertura da loja!");
        assertTrue(produto.getHistorico().contains("Abertura da loja!"));
    }


    @Test
    void deveRetornarHistoricoVazio()
    {
        Produto produto = new Produto("Cenoura", 100, 1, 20, 200);
        assertEquals("Histórico vazio", produto.obterHistorico());
    }

    @Test
    void deveRetornarHistorico()
    {
        Produto produto = new Produto("Cenoura", 100, 1, 20, 200);
        Cliente cliente = new Cliente("Joseval", "000.000.000-00");
        Fornecedor fornecedor = new Fornecedor("Casas Bahia", "000.000.000-00");
        produto.vender("20/08/2023", cliente, 34);
        produto.comprar("20/03/2023", fornecedor, 23, 5500);
        assertTrue(produto.obterHistorico().contains("Histórico do Produto:\n"));
        assertTrue(produto.obterHistorico().contains("Venda realizada: " + 34 + " unidades"));
        assertTrue(produto.obterHistorico().contains("Compra realizada: " + 23 + " unidades"));
        ;
    }
}