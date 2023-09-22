package Lista01.Exercicio05;

public class ProdutoEletronico extends Produto
{
    float desconto = 0.1f;

    public float calculaPreco()
    {
        if(this.getQtddComprada() >= 4.0f && this.getPrecoUnitario() >= 15.0f)
        {
            return this.getQtddComprada() * this.getPrecoUnitario() *(1 - desconto);
        }
        return this.getQtddComprada() * this.getPrecoUnitario();
    }
}
