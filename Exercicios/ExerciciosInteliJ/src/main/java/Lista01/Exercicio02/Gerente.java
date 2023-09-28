package Lista01.Exercicio02;

public class Gerente extends Funcionario
{
    private float bonus;

    public float getBonus()
    {
        return this.bonus;
    }
    public void setBonus(float bonus)
    {
        this.bonus = bonus/100.0f;
    }
    public float calculaPagamento()
    {
        return this.getSalarioMensal() * (1 + this.getBonus());
    }
}
