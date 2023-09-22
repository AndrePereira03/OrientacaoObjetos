package Lista01.Exercicio05;

public abstract class Produto
{
    private String nome;
    private float precoUnitario;
    private int qtddEstoque;
    private int qtddComprada;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public float getPrecoUnitario()
    {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario)
    {
        this.precoUnitario = precoUnitario;
    }

    public int getQtddEstoque()
    {
        return qtddEstoque;
    }

    public void setQtddEstoque(int qtddEstoque)
    {
        this.qtddEstoque = qtddEstoque;
    }

    public int getQtddComprada()
    {
        return qtddComprada;
    }

    public void setQtddComprada(int qtddComprada)
    {
        this.qtddComprada = qtddComprada;
        this.setQtddEstoque(this.getQtddEstoque() - this.qtddComprada);
    }

    public abstract float calculaPreco();
}
