package Lista01.Exercicio04;

public class VooInternacional extends Voo
{
    float taxaInternacional = 1.67f;
    float taxaConversao = 1.32f;

    public float calculaPreco()
    {
        if(this.getDistancia() >= 750.0f)
        {
            return this.getDistancia() * taxaInternacional * taxaConversao;
        }
        return this.getDistancia() * taxaInternacional;
    }
}
