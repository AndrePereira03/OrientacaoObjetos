package ExercicioRelampagoSupresa.Ex04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest
{
    @Test
    void DeveRetornarEscolaridadeChefeDepartamento()
    {
        Funcionario chefia = new Funcionario();
        Escolaridade escolaridade = new Escolaridade();
        Departamento departamento = new Departamento();
        departamento.setChefia(chefia);
        departamento.getChefia().setEscolaridade(escolaridade);
        departamento.getChefia().getEscolaridade().setFormacao("Mestrado");
        assertEquals("Mestrado",departamento.getEscolaridadeChefeDepartamento());
    }
}