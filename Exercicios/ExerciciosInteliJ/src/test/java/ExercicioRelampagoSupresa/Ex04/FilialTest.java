package ExercicioRelampagoSupresa.Ex04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest
{
    @Test
    void deveRetornarNomeDiretorEmpresaFilial()
    {
        Filial filial = new Filial();
        Empresa empresa = new Empresa();
        Funcionario diretor = new Funcionario();
        filial.setEmpresa(empresa);
        filial.getEmpresa().setDiretor(diretor);
        filial.getEmpresa().getDiretor().setNome("Andre");
        assertEquals("Andre", filial.getNomeDiretorEmpresaFilial());
    }
}