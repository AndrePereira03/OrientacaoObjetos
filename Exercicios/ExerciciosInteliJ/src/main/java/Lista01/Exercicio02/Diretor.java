package Lista01.Exercicio02;

public class Diretor extends Funcionario
{
private float lucro;

    public float getLucro()
    {
        return this.lucro;
    }
    public void setLucro(float lucro)
    {
        this.lucro = lucro * 0.10f;
    }
    public float calculaPagamento()
    {
        return this.getSalarioMensal() + this.getLucro();
    }
}
