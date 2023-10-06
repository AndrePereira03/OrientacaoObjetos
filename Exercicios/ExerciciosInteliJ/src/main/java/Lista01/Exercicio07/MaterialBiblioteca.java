/*package Lista01.Exercicio07;
import java.util.Date;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class MaterialBiblioteca
{
    private String titulo;
    private Date publicacao;
    private float taxa;
    protected Date retirada;
    protected Date devolucao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Date publicacao) {
        this.publicacao = publicacao;
    }

    public float getTaxa() {
        return this.taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa/100.0f;
    }

    public Date getRetirada()
    {
        return this.retirada;
    }

    public void setData(String dataString) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse(dataString);
        this.data = data;
    }

    public Date getDevolucao() {
        return this.devolucao;
    }

    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }

    public abstract float calcularDevolucao(Date retirada, Date devolucao);
}*/
