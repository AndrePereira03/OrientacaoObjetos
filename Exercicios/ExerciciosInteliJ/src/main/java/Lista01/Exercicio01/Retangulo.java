package Lista01.Exercicio01;

public class Retangulo
{
    private double base;
    private double altura;

    public double getBase()
    {
        return base;
    }
    public void setBase(double base)
    {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calculaArea()
    {
        return this.altura * this.base;
    }
    public double calculaPerimetro()
    {
        return 2.0f*(this.altura + this.base);
    }
}
