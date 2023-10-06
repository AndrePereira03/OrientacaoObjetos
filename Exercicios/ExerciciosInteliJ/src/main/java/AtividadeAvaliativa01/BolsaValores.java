package AtividadeAvaliativa01;

public class BolsaValores extends CarteiraInvestimento
{
    private float taxa;
    public float getTaxa()
    {
        return taxa;
    }

    public void setTaxa(float taxa)
    {
        this.taxa = taxa;
    }
    public void investir(float investimento)
    {
        if(investimento <= 0.0f)
        {
            throw new IllegalArgumentException("valor invalido");
        }
        else if(this.getSaldo() + investimento < this.taxa)//a soma do saldo + investimento deve ser maior que a taxa
        {
            throw new IllegalArgumentException("saldo insuficiente");
        }
        else
        {
            setSaldo(this.getSaldo() + investimento - this.taxa);
        }
    }

    public void resgatar(float retirada)
    {
        if(retirada > getSaldo())
        {
            throw new IllegalArgumentException("saldo insuficiente");
        }
        else if(retirada <= 0.0f)
        {
            throw new IllegalArgumentException("valor invalido");
        }
        else
        {
            setSaldo(this.getSaldo() - retirada);
        }
    }
}
