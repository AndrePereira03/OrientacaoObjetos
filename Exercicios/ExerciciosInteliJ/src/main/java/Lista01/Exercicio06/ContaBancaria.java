package Lista01.Exercicio06;

public abstract class ContaBancaria
{
    private float numeroConta;
    private float saldo;
    private String titular;
    protected float taxa;

    public float getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(float numeroConta)
    {
        this.numeroConta = numeroConta;
    }

    public float getSaldo()
    {
        return this.saldo;
    }

    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }

    public String getTitular()
    {
        return this.titular;
    }

    public void setTitular(String titular)
    {
        this.titular = titular;
    }

    public float getTaxa()
    {
        return this.taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa/100.0f;
    }

    public abstract void depositar(float valorDepositado);
    public abstract void sacar(float valorSacado);
    public abstract float calcularJuros();
}
