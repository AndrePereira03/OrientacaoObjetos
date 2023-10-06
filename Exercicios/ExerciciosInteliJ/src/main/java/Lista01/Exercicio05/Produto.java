package Lista01.Exercicio05;

public abstract class Produto
{
    private String nome;
    private float precoUnitario;
    private int qtddEstoque;
    private int qtddComprada;

    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public float getPrecoUnitario()
    {
        return this.precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario)
    {
        this.precoUnitario = precoUnitario;
    }

    public int getQtddEstoque()
    {
        return this.qtddEstoque;
    }

    public void setQtddEstoque(int qtddEstoque)
    {
        this.qtddEstoque = qtddEstoque;
    }

    public int getQtddComprada()
    {
        return this.qtddComprada;
    }

    public void setQtddComprada(int qtddComprada)
    {
        if(qtddComprada > this.qtddEstoque)
        {
            throw new IllegalArgumentException("estoque insuficiente");
        }
        this.qtddComprada = qtddComprada;
        this.setQtddEstoque(this.getQtddEstoque() - this.qtddComprada);
    }

    public abstract float calculaPreco();
}
