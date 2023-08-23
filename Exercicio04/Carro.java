public class Carro
{
    private float kmRodados;
    private float qtdCombustivelConsumido;
    
    public void setKmRodados(float kmRodados)
    {
        this.kmRodados = kmRodados;
    }
    public float getKmRodados()
    {
        return this.kmRodados;
    }
    public void setQtdCombustivelConsumido(float qtdCombustivelConsumido)
    {
        this.qtdCombustivelConsumido = qtdCombustivelConsumido;
    }
    public float getQtdCombustivelConsumido()
    {
        return this.qtdCombustivelConsumido;
    }
    public float calculaMediaCombustivelPorKm()
    {    
        if (kmRodados > 0 && qtdCombustivelConsumido > 0)
        {
            return kmRodados / qtdCombustivelConsumido;
        } else
        {
            return 0;
        }
    }
}