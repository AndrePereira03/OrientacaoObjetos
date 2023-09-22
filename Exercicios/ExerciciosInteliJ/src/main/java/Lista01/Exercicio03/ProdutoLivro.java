package Lista01.Exercicio03;

public class ProdutoLivro extends Produto
{
    public float calculaPreco()
    {
        return this.getPrecoBase() * 0.95f;
    }
}
