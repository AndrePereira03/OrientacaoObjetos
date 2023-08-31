import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaTest
{
    private Pessoa pessoa;
    
    @BeforeEach
    public void setUp()
    {
        pessoa = new Pessoa();
    }
    
    @Test
    public void testeDeveRetornarHomemAbaixoPeso()
    {
        pessoa.setGenero('h');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(20.6f);
        assertEquals("homem abaixo do peso", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarHomemPesoNormal()
    {
        pessoa.setGenero('h');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(26.3f);
        pessoa.calcularIMC();
        assertEquals("homem no peso normal", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarHomemMarginalmenteAcimaPeso()
    {
        pessoa.setGenero('h');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.7f);
        pessoa.calcularIMC();
        assertEquals("homem marginalmente acima do peso", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarHomemAcimaPesoIdeal()
    {
        pessoa.setGenero('h');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.0f);
        pessoa.calcularIMC();
        assertEquals("homem acima do peso ideal", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarHomemObeso()
    {
        pessoa.setGenero('h');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.2f);
        pessoa.calcularIMC();
        assertEquals("homem obeso", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarMulherAbaixoPeso()
    {
        pessoa.setGenero('m');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(19.0f);
        pessoa.calcularIMC();
        assertEquals("mulher abaixo do peso", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarMulherPesoNormal()
    {
        pessoa.setGenero('m');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(25.7f);
        pessoa.calcularIMC();
        assertEquals("mulher no peso normal", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarMulherMarginalmenteAcimaPeso()
    {
        pessoa.setGenero('m');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.2f);
        pessoa.calcularIMC();
        assertEquals("mulher marginalmente acima do peso", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarMulherAcimaPesoIdeal()
    {
        pessoa.setGenero('m');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.2f);
        pessoa.calcularIMC();
        assertEquals("mulher acima do peso ideal", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarMulherObesa()
    {
        pessoa.setGenero('m');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.4f);
        pessoa.calcularIMC();
        assertEquals("mulher obesa", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void deveRetornarGeneroInvalido()
    {
        try
        {
            pessoa.setGenero('A');
            fail();
        }
        catch(IllegalArgumentException e)
        {
            assertEquals("Sexo invalido", e.getMessage());
        }
    }
}
