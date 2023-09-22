package Lista01.Exercicio02;

public abstract class Funcionario
{
    private float salarioMensal;

    public float getSalarioMensal()
    {
        return salarioMensal;
    }
    public void setSalarioMensal(float salarioMensal)
    {
        this.salarioMensal = salarioMensal;
    }
    public abstract float calculaPagamento();

}