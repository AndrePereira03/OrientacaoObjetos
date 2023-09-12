public class AlunoGraduacao extends Aluno
{
    public boolean aprovado()
    {
       return this.calculamedia() >= 7;
    }
}
