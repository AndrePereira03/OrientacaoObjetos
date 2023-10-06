package Lista01.Exercicio05;

public class ProdutoRoupa extends Produto
{
    private float desconto = 0.15f;

    public float calculaPreco()
    {
        if(this.getQtddComprada() >= 3 && this.getPrecoUnitario() >= 25)
        {
            return this.getQtddComprada() * this.getPrecoUnitario() * (1-desconto);
        }
        return this.getQtddComprada() * this.getPrecoUnitario();
    }
}
