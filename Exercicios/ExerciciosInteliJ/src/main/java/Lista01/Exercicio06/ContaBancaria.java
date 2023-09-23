package Lista01.Exercicio06;

public abstract class ContaBancaria
{
    private float numeroConta;
    private float saldo;
    private String titular;

    public float getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(float numeroConta)
    {
        this.numeroConta = numeroConta;
    }

    public float getSaldo()
    {
        return saldo;
    }

    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }

    public String getTitular()
    {
        return titular;
    }

    public void setTitular(String titular)
    {
        this.titular = titular;
    }

    public abstract float deposita();
    public abstract float saca();
    public abstract float calculaJuros();
}
