package Lista01.Exercicio01;
import java.lang.Math;

public class Circulo extends FormaGeometrica
{
    private double raio;
    private double area;
    private double perimetro;

    public double getRaio()
    {
        return this.raio;
    }

    public void setRaio(double raio)
    {
        this.raio = raio;
    }

    public double calculaArea()
    {
        return Math.PI * Math.pow(this.getRaio(), 2.0f);
    }
    public double calculaPerimetro()
    {
        return 2.0f * Math.PI * this.getRaio();
    }

}
