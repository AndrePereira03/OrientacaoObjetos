public class AlunoEnsinoMedio extends Aluno
{
    public boolean aprovado()
    {
       return this.calculamedia() >= 6;
    }
}
