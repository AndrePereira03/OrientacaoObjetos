package ExercicioRelampagoSupresa.Ex04;

public class Departamento
{
    private Funcionario chefia;
    private Empresa empresa;

    public Funcionario getChefia() {
        return chefia;
    }

    public void setChefia(Funcionario chefia) {
        this.chefia = chefia;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getEscolaridadeChefeDepartamento()
    {
        return this.chefia.getEscolaridade().getFormacao();
    }
}
