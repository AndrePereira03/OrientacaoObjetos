package ExercicioRelampagoSupresa.Ex04;

public class Grupo
{
    private Pais sede;
    private Funcionario presidente;

    public Pais getSede() {
        return sede;
    }

    public void setSede(Pais sede) {
        this.sede = sede;
    }

    public Funcionario getPresidente() {
        return presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }

    public String getEscolaridadePresidenteGrupo()
    {
        return this.presidente.getEscolaridade().getFormacao();
    }


}
