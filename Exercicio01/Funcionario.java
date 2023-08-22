

public class Funcionario
{
    private float salarioAtual;
    private float aumentoPorcentual;

    public void setSalarioAtual(float salarioAtual)
    {
        this.salarioAtual = salarioAtual;
    }
    public float getSalarioAtual()
    {
        return this.salarioAtual;
    }
    public void setAumentoPorcentual(float aumentoPorcentual)
    {
        this.aumentoPorcentual = aumentoPorcentual/100;
    }
    public float getAumentoPorcentual()
    {
        return this.aumentoPorcentual;
    }
    public float calcularNovoSalario()
    {
        return this.salarioAtual*(1+this.aumentoPorcentual);
    }
    public float calcularValorAumento()
    {
        return this.salarioAtual*this.aumentoPorcentual;
    }
}
