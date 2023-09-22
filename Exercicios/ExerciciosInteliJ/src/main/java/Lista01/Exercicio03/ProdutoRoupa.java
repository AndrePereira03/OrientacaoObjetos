package Lista01.Exercicio03;

public class ProdutoRoupa extends Produto
{
    public float calculaPreco()
    {
        if(this.getPrecoBase() >= 200.0f)
        {
            return this.getPrecoBase() * 0.8f;
        }
        return this.getPrecoBase();
    }
}
