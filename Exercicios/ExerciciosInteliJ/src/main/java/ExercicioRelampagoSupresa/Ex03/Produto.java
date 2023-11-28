package ExercicioRelampagoSupresa.Ex03;

import java.util.ArrayList;

public class Produto
{
    private String nome;
    private int qtdeEstoque;//o que podemos usar
    private int precoUnit;
    private int estoqueMinimo;//nao podemos deixar abaixar dele
    private int estoqueMaximo;//nao pode passar dele
    private ArrayList<String> historico;//registra o que aconteceu; exemplo: venda realizada; estoque insuficiente, as transações são compra e venda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public int getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(int precoUnit) {
        this.precoUnit = precoUnit;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }

    public int debitarEstoque(int qtdeDebitada)
    {
        return this.qtdeEstoque -= qtdeDebitada;
    }

    public int creditarEstoque(int qtdeCreditada)
    {
        return this.qtdeEstoque += qtdeCreditada;
    }
    public boolean verificarEstoqueBaixo()
    {
        return this.qtdeEstoque < this.estoqueMinimo;
    }
    public boolean verificarEstoqueInsuficiente(int qtdePretendida)
    {
        return qtdePretendida > this.qtdeEstoque;
    }


}
