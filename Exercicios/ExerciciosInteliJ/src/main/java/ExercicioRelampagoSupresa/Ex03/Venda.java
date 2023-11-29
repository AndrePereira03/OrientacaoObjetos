package ExercicioRelampagoSupresa.Ex03;

public class Venda extends Transacao {
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Venda(String dataVenda, Cliente cliente, Produto produto, int qtdeVendida) {
        super(dataVenda, produto, qtdeVendida);
        this.cliente = cliente;
    }

    /*public boolean vender(Produto produto, int qtdeVendida)
    {
        String mensagem;
        if(getProduto().verificarEstoqueInsuficiente(qtdeVendida))
        {
            mensagem = "Estoque insuficiente";//Não usei o throw new Illegal, pois o enunciado pede para retornar falso. O uso do Illegal proíbe o retorno de falso após sua execução
            //throw new IllegalArgumentException("Estoque insuficiente.");
            return false;
        }
        getProduto().debitarEstoque(qtdeVendida);
        mensagem = "Valor da venda: " + String.valueOf(qtdeVendida);//transforma qtdeVendida em String
        if(getProduto().verificarEstoqueBaixo())
        {
            mensagem = "Estoque baixo";
            //throw new IllegalArgumentException("Estoque baixo.");
        }
        return true;
    }*/

    public boolean vender(Produto produto, int qtdeVendida) {
        if (getProduto().verificarEstoqueInsuficiente(qtdeVendida)) {
            return false;
        }
        getProduto().debitarEstoque(qtdeVendida);
        if (getProduto().verificarEstoqueBaixo()) {
            return false;
        }
        return true;
    }
}
