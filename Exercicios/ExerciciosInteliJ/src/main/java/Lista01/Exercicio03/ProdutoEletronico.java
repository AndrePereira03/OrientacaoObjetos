package Lista01.Exercicio03;

public class ProdutoEletronico extends Produto
{
    public float calculaPreco()
    {
        if(this.getPrecoBase() >= 300.0f)
        {
            return this.getPrecoBase() * 0.9f;
        }
        return this.getPrecoBase();
    }
}
