

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
        this.aumentoPorcentual = aumentoPorcentual;
    }
    public float getAumentoPorcentual()
    {
        return this.aumentoPorcentual;
    }
    public float calcularValorAumento()
    {
        return this.salarioAtual*this.aumentoPorcentual/100.0f;
    }
     public float calcularNovoSalario()
    {
        return this.salarioAtual + this.calcularValorAumento();
    }
}
