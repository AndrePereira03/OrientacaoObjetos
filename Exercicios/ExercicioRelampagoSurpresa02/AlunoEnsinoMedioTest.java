import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoEnsinoMedioTest
{
    private AlunoEnsinoMedio alunoEnsinoMedio;
    
    @BeforeEach
    public void setUp()
    {
        alunoEnsinoMedio = new AlunoEnsinoMedio();
    }
    
    @Test
    public void testeDeveRetornarFalse()
    {
        alunoEnsinoMedio.setNota1(5.0f);
        alunoEnsinoMedio.setNota2(5.0f);
        alunoEnsinoMedio.calculamedia();
        assertEquals(false, alunoEnsinoMedio.aprovado());
    }

    @Test
    public void testeDeveRetornarTrue()
    {
        alunoEnsinoMedio.setNota1(6.0f);
        alunoEnsinoMedio.setNota2(8.0f);
        alunoEnsinoMedio.calculamedia();
        assertEquals(true, alunoEnsinoMedio.aprovado());
    }
}
