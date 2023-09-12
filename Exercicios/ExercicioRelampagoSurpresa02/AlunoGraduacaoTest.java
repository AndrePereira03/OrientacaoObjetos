import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoGraduacaoTest
{
    private AlunoGraduacao alunoGrad;
    
    @BeforeEach
    public void setUp()
    {
        alunoGrad = new AlunoGraduacao();
    }
    
    @Test
    public void testeDeveRetornarFalse()
    {
        alunoGrad.setNota1(6.0f);
        alunoGrad.setNota2(6.0f);
        alunoGrad.calculamedia();
        assertEquals(false, alunoGrad.aprovado());
    }

    @Test
    public void testeDeveRetornarTrue()
    {
        alunoGrad.setNota1(7.0f);
        alunoGrad.setNota2(7.0f);
        alunoGrad.calculamedia();
        assertEquals(true, alunoGrad.aprovado());
    }
}
