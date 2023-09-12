import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProfessorTest
{
    private Professor professor;
    
    @BeforeEach
    public void setUp()
    {
        professor = new Professor();
    }
    
    @Test
    public void deveRetornarNome()
    {
        professor.setNome("Joao");
        assertEquals("Joao", professor.getNome());
    }
    
    @Test
    public void deveRetornarTitulacaoMaxima()
    {
        professor.setTitulacaoMaxima("Doutorado");
        assertEquals("Doutorado", professor.getTitulacaoMaxima());
    }  
}