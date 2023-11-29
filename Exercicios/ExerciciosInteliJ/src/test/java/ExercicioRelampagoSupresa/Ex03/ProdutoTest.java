package ExercicioRelampagoSupresa.Ex03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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


}