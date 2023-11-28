package ExercicioRelampagoSupresa.Ex02;

public class Cidade
{
    private Estado estado;

    private String nome;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        if(estado == null)
        {
            throw new IllegalArgumentException("estado nao definidp");
        }
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
