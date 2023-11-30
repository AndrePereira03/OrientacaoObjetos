package ExercicioRelampagoSupresa.Ex04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest
{
    @Test
    void deveRetornarEscolaridadePresidenteGrupo()
    {
        Escolaridade escolaridade = new Escolaridade();
        Grupo grupo = new Grupo();
        Funcionario presidente = new Funcionario();
        grupo.setPresidente(presidente);
        grupo.getPresidente().setEscolaridade(escolaridade);
        grupo.getPresidente().getEscolaridade().setFormacao("Doutor");
        assertEquals("Doutor", grupo.getEscolaridadePresidenteGrupo());
    }
}