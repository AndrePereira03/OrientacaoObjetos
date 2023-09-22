package Lista01.Exercicio04;
import java.util.Date;

public abstract class Voo
{
    private String origem;
    private String destino;
    private Date data;
    private float distancia;


    public String getOrigem()
    {
        return origem;
    }

    public void setOrigem(String origem)
    {
        this.origem = origem;
    }

    public String getDestino()
    {
        return destino;
    }

    public void setDestino(String destino)
    {
        this.destino = destino;
    }

    public Date getData()
    {
        return data;
    }

    public void setData(Date data)
    {
        this.data = data;
    }

    public float getDistancia()
    {
        return distancia;
    }

    public void setDistancia(float distancia)
    {
        this.distancia = distancia;
    }
    public abstract float calculaPreco();
}
