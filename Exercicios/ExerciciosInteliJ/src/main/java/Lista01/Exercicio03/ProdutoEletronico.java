package Lista01.Exercicio03;

public class ProdutoEletronico extends Produto
{
    public float calculaPreco()
    {
        return this.getPrecoBase() * 0.9f;
    }
}
