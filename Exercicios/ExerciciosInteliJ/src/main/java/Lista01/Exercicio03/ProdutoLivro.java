package Lista01.Exercicio03;

public class ProdutoLivro extends Produto
{
    public float calculaPreco()
    {
        if(this.getPrecoBase() >= 50.0f)
        {
            return this.getPrecoBase() * 0.95f;
        }
        return this.getPrecoBase();
    }
}
