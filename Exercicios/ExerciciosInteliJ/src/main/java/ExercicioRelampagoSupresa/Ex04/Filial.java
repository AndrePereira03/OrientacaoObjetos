package ExercicioRelampagoSupresa.Ex04;

public class Filial
{
    private Cidade cidade;
    private Empresa empresa;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    /*public Filial(Cidade cidade, Empresa empresa)
    {
        this.cidade = cidade;
        this.empresa = empresa;
    }*/

    public String getNomeDiretorEmpresaFilial()
    {
        return this.empresa.getDiretor().getNome();
    }
}
