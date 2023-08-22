public class Funcionario
{
    private int qtdHorasExtras;
    private float valorHorasExtras;
    private float salarioBruto;
    
    public void setQtdHorasExtras(int qtdHorasExtras)
    {
        this.qtdHorasExtras = qtdHorasExtras;
    }
    public int getQtdHorasExtras()
    {
        return qtdHorasExtras;
    }
    public void setValorHorasExtras(float valorHorasExtras)
    {
        this.valorHorasExtras = valorHorasExtras;
    }
    public float getValorHorasExtras()
    {
        return this.valorHorasExtras;
    }
    public void setSalarioBruto(float salarioBruto)
    {
        this.salarioBruto = salarioBruto;
    }
    public float getSalarioBruto()
    {
        return this.salarioBruto;
    }
    public float calcularSalarioLiquido()
    {
        float salarioSemDesc = salarioBruto + qtdHorasExtras * valorHorasExtras;
        return salarioSemDesc * 0.92f;
    }
}
