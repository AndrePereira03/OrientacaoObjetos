package AtividadeAvaliativa01;

public class Investimento extends CarteiraInvestimento
{
    private float taxa; //prezando pelo reaproveitamento do codigo, usei metodos de get/set para definir a taxa, mas, perceba que, nos casos de teste, usei 50 como valor de referencia.

    public float getTaxa()
    {
        return taxa;
    }

    public void setTaxa(float taxa)
    {
        this.taxa = taxa/100.0f;
    }

    public void investir(float investimento)
    {
        if(investimento <= 0.0f)
        {
            throw new IllegalArgumentException("valor invalido");
        }
        else
        {
            this.setSaldo(this.getSaldo() + investimento);
        }
    }
    public void resgatar(float retirada)
    {
        if(retirada <= 0.0f)
        {
            throw new IllegalArgumentException("valor invalido");
        }
        else if(retirada * (1 + getTaxa()) > getSaldo())//você não pode sacar tudo, pois tem que pagar a taxa
        {
            throw new IllegalArgumentException("Valor insuficiente");
        }
        else
        {
            setSaldo(getSaldo() - retirada * (1 + taxa));
        }
    }
}
