package Lista01.Exercicio05;

public class ProdutoAlimento extends Produto
{
    float desconto = 0.15f;

    public float calculaPreco()
    {
        if(this.getQtddComprada() >= 6 && this.getPrecoUnitario() >= 5.0f)
        {
            return this.getQtddComprada() * this.getPrecoUnitario() * (1 - desconto);
        }
        return this.getQtddComprada() * this.getPrecoUnitario();
    }

}
