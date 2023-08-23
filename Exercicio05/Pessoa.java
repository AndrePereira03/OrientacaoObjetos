public class Pessoa
{
   private float peso;
   private float altura;
   private char genero;
   
   public void setPeso(float peso)
   {
       this.peso = peso;
   }
   public float getPeso()
   {
       return this.peso;
   }
   public void setAltura(float altura)
   {
       this.altura = altura;
   }
   public float getAltura()
   {
       return this.altura;
   }
   public void setGenero(char genero)
   {
       this.genero = genero;
   }
   public char getGenero()
   {
       return this.genero;
   }
   public float calcularIndiceMassaCorporal()
   {
       float imc = peso/(altura*altura);
       return imc;
   }
   
}