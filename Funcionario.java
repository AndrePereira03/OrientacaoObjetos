
public class Funcionario
{
  private String nome;
  private float salarioBruto;
  private float totalAcrescimos;
  private float totalDescontos;
  
  public void setNome(String nome)
  {
      this.nome = nome;
  }
  public String getNome()
  {
      return this.nome;
  }
  
  public void setSalarioBruto(float salarioBruto)
  {
      this.salarioBruto = salarioBruto;
  }
  public float getSalarioBruto()
  {
      return this.salarioBruto;
  }
  
  public void setTotalAcrescimos(float totalAcrescimos)
  {
      this.totalAcrescimos = totalAcrescimos;
  }
  public float getTotalAcrescimos()
  {
      return this.totalAcrescimos;
  }
  
  public void setTotalDescontos(float totalDescontos)
  {
      this.totalDescontos = totalDescontos;
  }
  public float getTotalDescontos()
  {
      return this.totalDescontos;
  }
  
  public float calcularSalarioLiquido()
  {
      return this.salarioBruto + this.totalAcrescimos - this.totalDescontos;
  }
}
