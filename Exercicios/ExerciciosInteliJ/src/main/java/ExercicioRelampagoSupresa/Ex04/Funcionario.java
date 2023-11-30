package ExercicioRelampagoSupresa.Ex04;

public class Funcionario
{
    private Filial coordenacao;
    private Escolaridade escolaridade;
    private Departamento alocado;
    private String nome;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisAlocacaoFuncionario()
    {
        return this.alocado.getEmpresa().getGrupo().getSede().getNome();
    }

    public String getEstadoFilialCoordenada()
    {
        return this.coordenacao.getCidade().getEstado().getNome();
    }
}
