package Lista01.Exercicio02;

public class Gerente extends Funcionario
{
    public float calculaPagamento()
    {
        return this.getSalarioMensal()*1.27f;
    }
}
