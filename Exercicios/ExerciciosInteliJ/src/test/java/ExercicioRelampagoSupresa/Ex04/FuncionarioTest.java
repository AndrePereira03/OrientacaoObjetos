package ExercicioRelampagoSupresa.Ex04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest
{
    @Test
    void deveRetornarPaisAlocacaoFuncionario()
    {
        Funcionario funcionario = new Funcionario();
        Departamento alocado = new Departamento();
        Empresa empresa = new Empresa();
        Grupo grupo = new Grupo();
        Pais sede = new Pais();
        funcionario.setAlocado(alocado);
        funcionario.getAlocado().setEmpresa(empresa);
        funcionario.getAlocado().getEmpresa().setGrupo(grupo);
        funcionario.getAlocado().getEmpresa().getGrupo().setSede(sede);
        funcionario.getAlocado().getEmpresa().getGrupo().getSede().setNome("Brasil");
        assertEquals("Brasil", funcionario.getPaisAlocacaoFuncionario());
    }

    @Test
    void deveRetornarEstadoFilialFuncionarioCoordena()
    {
        Funcionario funcionario = new Funcionario();
        Filial coordenador = new Filial();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();
        funcionario.setCoordenacao(coordenador);
        funcionario.getCoordenacao().setCidade(cidade);
        funcionario.getCoordenacao().getCidade().setEstado(estado);
        funcionario.getCoordenacao().getCidade().getEstado().setNome("Minas Gerais");
        assertEquals("Minas Gerais", funcionario.getEstadoFilialCoordenada());
    }
}