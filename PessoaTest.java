

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaTest
{
    @Test
    public void testeDeveRetornarHomemAbaixoPeso()
    {
        Pessoa pessoa = new Pessoa();
        pessoa.setGenero('h');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(20.6f);
        assertEquals("homem abaixo do peso", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarHomemPesoNormal()
    {
        Pessoa pessoa = new Pessoa();
        pessoa.setGenero('h');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(26.3f);
        pessoa.calcularIMC();
        assertEquals("homem no peso normal", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarHomemMarginalmenteAcimaPeso()
    {
        Pessoa pessoa = new Pessoa();
        pessoa.setGenero('h');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.7f);
        pessoa.calcularIMC();
        assertEquals("homem marginalmente acima do peso", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarHomemAcimaPesoIdeal()
    {
        Pessoa pessoa = new Pessoa();
        pessoa.setGenero('h');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.0f);
        pessoa.calcularIMC();
        assertEquals("homem acima do peso ideal", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarHomemObeso()
    {
        Pessoa pessoa = new Pessoa();
        pessoa.setGenero('h');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.2f);
        pessoa.calcularIMC();
        assertEquals("homem obeso", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarMulherAbaixoPeso()
    {
        Pessoa pessoa = new Pessoa();
        pessoa.setGenero('m');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(19.0f);
        pessoa.calcularIMC();
        assertEquals("mulher abaixo do peso", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarMulherPesoNormal()
    {
        Pessoa pessoa = new Pessoa();
        pessoa.setGenero('m');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(25.7f);
        pessoa.calcularIMC();
        assertEquals("mulher no peso normal", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarMulherMarginalmenteAcimaPeso()
    {
        Pessoa pessoa = new Pessoa();
        pessoa.setGenero('m');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.2f);
        pessoa.calcularIMC();
        assertEquals("mulher marginalmente acima do peso", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarMulherAcimaPesoIdeal()
    {
        Pessoa pessoa = new Pessoa();
        pessoa.setGenero('m');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.2f);
        pessoa.calcularIMC();
        assertEquals("mulher acima do peso ideal", pessoa.classificarIndiceMassaCorporal());
    }
    
    @Test
    public void testeDeveRetornarMulherObesa()
    {
        Pessoa pessoa = new Pessoa();
        pessoa.setGenero('m');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.4f);
        pessoa.calcularIMC();
        assertEquals("mulher obesa", pessoa.classificarIndiceMassaCorporal());
    }
}
