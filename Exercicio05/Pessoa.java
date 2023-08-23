public class Pessoa
{
   private float peso;
   private float altura;
   private float imc;
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
   public float calcularIMC()
   {
       imc = peso/(altura*altura);
       return imc;
   }
   public String classificarIndiceMassaCorporal()
   {
       String mensagemCondicional;
       
       if(this.genero == 'm' || this.genero == 'M')
       {
           if(imc < 19.1)
           {
               mensagemCondicional = "mulher abaixo do peso";
           }
           else if(19.1 <= imc && imc < 25.8)
           {
               mensagemCondicional = "mulher no peso normal";
           }
           else if(25.8 <= imc && imc < 27.3)
           {
               mensagemCondicional = "mulher marginalmente acima do peso";
           }
           else if(27.3 <= imc && imc < 32.3)
           {
               mensagemCondicional = "mulher acima do peso ideal";
           }
           else
           {
               mensagemCondicional = "mulher obesa";
           }
       }
       else if(this.genero == 'h' || this.genero == 'H')
       {
           if(imc < 20.7)
           {
               mensagemCondicional = "homem abaixo do peso";
           }
           else if(20.7 <= imc && imc <26.4)
           {
               mensagemCondicional = "homem no peso normal";
           }
           else if(26.4 <= imc && imc < 27.8)
           {
               mensagemCondicional = "homem marginalmente acima do peso";
           }
           else if(27.8 <= imc && imc < 31.1)
           {
               mensagemCondicional = "homem acima do peso ideal";
           }
           else
           {
               mensagemCondicional = "homem obeso";
           }
       }
       else
       {
           mensagemCondicional = "valores invalidos";
       }
       return mensagemCondicional;
   }  
}