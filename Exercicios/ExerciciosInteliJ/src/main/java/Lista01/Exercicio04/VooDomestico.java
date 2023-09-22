package Lista01.Exercicio04;

public class VooDomestico extends Voo
{
    private float taxaDomestica = 1.38f;
    public float calculaPreco()
    {
        return this.getDistancia() * taxaDomestica;
    }
}
