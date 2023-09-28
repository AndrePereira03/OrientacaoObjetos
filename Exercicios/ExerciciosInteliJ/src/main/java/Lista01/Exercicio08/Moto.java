package Lista01.Exercicio08;

public class Moto extends Veiculo
{
    public float calcularCusto()
    {
        return this.getPrecoBase() * (1 + super.getFatorPreco());
    }
}
