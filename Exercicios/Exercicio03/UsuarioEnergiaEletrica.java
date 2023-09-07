public class UsuarioEnergiaEletrica
{
     private float valorQuilowattHora = 0.12f;
     private float qtdKwH; //quantidade de QuilowattHora
     
     public void setQtdKwH(float qtdKwH)
     {
         this.qtdKwH = qtdKwH;
     }
     public float getQtdKwH()
     {
         return this.qtdKwH;
     }
     public float calculaValorTotal()
     {
         float valorSemICMS = valorQuilowattHora * qtdKwH;
         return valorSemICMS * 1.18f;
     }
     
}
