package ExercicioRelampagoSupresa.Ex03;

public class Transacao
{
    private Produto produto;
    private String dataTransacao;
    private int qtd;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Transacao(String dataTransacao, Produto produto, int qtd)
    {
        this.dataTransacao = dataTransacao;
        this.produto = produto;
        this.qtd = qtd;
    }
}
