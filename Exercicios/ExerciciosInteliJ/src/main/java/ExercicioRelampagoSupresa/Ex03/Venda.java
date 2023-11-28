package ExercicioRelampagoSupresa.Ex03;

public class Venda extends Transacao
{
private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Venda(String dataVenda, Cliente cliente, Produto produto, int qtdeVendida)
    {
        super(dataVenda, produto, qtdeVendida);
        this.cliente = cliente;
    }

    public boolean vender(Produto produto, int qtdeVendida)
    {
        //String mensagem;
        if(getProduto().verificarEstoqueInsuficiente(qtdeVendida))
        {
            throw new IllegalArgumentException("Estoque insuficiente");
            return false;
        }


    }
}
