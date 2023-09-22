package Lista01.Exercicio02;

public class Diretor extends Funcionario
{
private float lucro;

    public float getLucro()
    {
        return lucro;
    }
    public void setLucro(float lucro)
    {
        this.lucro = lucro;
    }
    public float calculaPagamento()
    {
        return this.getSalarioMensal() + 0.10f * this.lucro;
    }
}
