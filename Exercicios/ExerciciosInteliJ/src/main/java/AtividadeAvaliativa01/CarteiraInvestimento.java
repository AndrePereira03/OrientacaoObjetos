package AtividadeAvaliativa01;

public abstract class CarteiraInvestimento
{
    private int numeroCarteira;
    private float saldo;

    public int getNumeroCarteira()
    {
        return numeroCarteira;
    }

    public void setNumeroCarteira(int numeroCarteira)
    {
        this.numeroCarteira = numeroCarteira;
    }

    public float getSaldo()
    {
        return saldo;
    }

    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }

    //nao implementei os metodos abaixo "desabstraidos", pois percebi algumas exceções que complicariam
    // o codigo e seria dificil implementar no presente tempo de prova.

    public abstract void investir(float investimento);
    public abstract void resgatar(float retirada);
}
