public class Aluno extends Pessoa
{
    private int matricula;
    private float nota1;
    private float nota2;
    
    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }
    public int getMatricula()
    {
        return this.matricula;
    }
    public void setNota1(float nota1)
    {
        this.nota1 = nota1;
    }
    public float getNota1()
    {
        return this.nota1;
    }
    public void setNota2(float nota2)
    {
        this.nota2 = nota2;
    }
    public float getNota2()
    {
        return this.nota2;
    }
    public float calculamedia()
    {
        return (this.nota1 + this.nota2) / 2.0f;
    }
}
