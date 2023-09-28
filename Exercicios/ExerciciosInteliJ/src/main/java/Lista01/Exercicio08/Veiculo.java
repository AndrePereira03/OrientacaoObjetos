package Lista01.Exercicio08;

public abstract class Veiculo
{
    private String marca;
    private String modelo;
    private float precoBase;
    protected float fatorPreco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public float getFatorPreco() {
        return fatorPreco;
    }

    public void setFatorPreco(float fatorPreco) {
        this.fatorPreco = fatorPreco/100.0F;
    }

    public abstract float calcularCusto();
}
