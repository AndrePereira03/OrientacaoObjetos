package ExercicioRelampagoSupresa.Ex03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest
{
    @Test
    void deveRetornarVenderEstoqueInsuficiente()
    {
        Cliente cliente = new Cliente("Valdecir", "000.000.000-00");
        Produto produto = new Produto("Cadeira", 80, 80, 20, 100);
        Venda venda = new Venda("26/07/2023", cliente, produto, 4);
        assertTrue(venda.getProduto().verificarEstoqueInsuficiente(81));
    }

}