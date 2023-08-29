import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FuncionarioTest
{
    @Test
    public void testeDeveRetornarSalarioLiquido()
    {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalarioBruto(1000.0f);
        funcionario.setTotalAcrescimos(1000.0f);
        funcionario.setTotalDescontos(500.0f);
        funcionario.calcularSalarioLiquido();
        assertEquals(1500.0f, funcionario.calcularSalarioLiquido());
    }
}
