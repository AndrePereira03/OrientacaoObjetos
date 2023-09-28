package Lista01.Exercicio01;

public class Retangulo
{
    private double base;
    private double altura;

    public double getBase()
    {
        return this.base;
    }
    public void setBase(double base)
    {
        this.base = base;
    }
    public double getAltura()
    {
        return this.altura;
    }
    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    public double calculaArea()
    {
        return this.getAltura() * this.getBase();
    }
    public double calculaPerimetro()
    {
        return 2.0f*(this.getAltura() + this.getBase());
    }

}
