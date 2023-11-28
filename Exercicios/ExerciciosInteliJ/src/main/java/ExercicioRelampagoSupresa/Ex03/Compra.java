package ExercicioRelampagoSupresa.Ex03;

public class Compra extends Transacao
{
private Fornecedor fornecedor;
private int precoUnit;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(int precoUnit) {
        this.precoUnit = precoUnit;
    }

    public Compra(String dataCompra, Produto produto, Fornecedor fornecedor, int qtdeCompra, int precoUnit)
    {
        super(dataCompra, produto, qtdeCompra);
        this.fornecedor = fornecedor;
        this.precoUnit = precoUnit;
    }
}
