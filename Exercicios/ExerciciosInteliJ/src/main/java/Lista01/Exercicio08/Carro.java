package Lista01.Exercicio08;

public class Carro extends Veiculo
{
    public float calcularCusto()
    {
        return this.getPrecoBase() * (1 + super.getFatorPreco());
    }
}
