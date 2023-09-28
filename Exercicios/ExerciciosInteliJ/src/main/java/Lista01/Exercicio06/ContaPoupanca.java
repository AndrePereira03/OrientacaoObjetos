package Lista01.Exercicio06;

public class ContaPoupanca extends ContaBancaria
{
    public void depositar(float valorDepositado)
    {
        this.setSaldo(this.getSaldo() + valorDepositado);
    }

    public void sacar(float valorSacado)
    {
        if(valorSacado <= this.getSaldo())
        {
            this.setSaldo(this.getSaldo() - valorSacado);
        }
        else
        {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }

    public float calcularJuros()
    {
        float temp = this.getSaldo();
        this.setSaldo(this.getSaldo()* (1 + super.getTaxa()));
        return this.getSaldo() - temp;
    }
}
