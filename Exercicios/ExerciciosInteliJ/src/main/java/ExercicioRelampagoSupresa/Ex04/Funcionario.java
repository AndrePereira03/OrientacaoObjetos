package ExercicioRelampagoSupresa.Ex04;

public class Funcionario
{
    private Filial coordenacao;
    private Escolaridade escolaridade;
    private Departamento alocado;

    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Departamento getAlocado() {
        return alocado;
    }

    public void setAlocado(Departamento alocado) {
        this.alocado = alocado;
    }

    public String getPaisAlocacaoFuncionario()
    {
        return getAlocado().getEmpresa().getGrupo().getSede().getNome();
    }

    public String getEstadoFilialCoordenada()
    {
        return getCoordenacao().getCidade().getEstado().getNome();
    }
}
