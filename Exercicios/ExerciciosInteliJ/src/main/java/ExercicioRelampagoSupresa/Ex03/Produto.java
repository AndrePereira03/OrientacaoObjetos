package ExercicioRelampagoSupresa.Ex03;

import ExercicioRelampagoSupresa.Ex02.Professor;

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
        if(qtdeEstoque > estoqueMaximo)
        {
            throw new IllegalArgumentException("Estoque acima do permitido.");
        }
        if(qtdeEstoque < estoqueMinimo)
        {
            throw new IllegalArgumentException("Estoque abaixo do permitido.");
        }
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

    public Produto(String nome, int qtdeEstoque, int precoUnit, int estoqueMinimo, int estoqueMaximo)
    {
        this.nome = nome;
        this.qtdeEstoque = qtdeEstoque;
        this.precoUnit = precoUnit;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.historico = new ArrayList<>();
    }

    public int debitarEstoque(int qtdeDebitada)
    {
        if(qtdeDebitada > this.qtdeEstoque)
        {
            throw new IllegalArgumentException("Estoque insuficiente.");
        }
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
    public boolean verificarEstoqueExcedente(int qtdeExcedente)
    {
        return (qtdeExcedente + this.qtdeEstoque) > this.estoqueMaximo;
    }
    public int calcularValorVenda(int qtdeVendida)
    {
        if(qtdeVendida > this.qtdeEstoque)
        {
            throw new IllegalArgumentException("Estoque insuficiente.");
        }
        return qtdeVendida * this.precoUnit;
    }

    public void vender(String dataVenda, Cliente cliente, int qtdeVendida)
    {
        Venda venda = new Venda(dataVenda, cliente, this,qtdeVendida);
        if(venda.vender(this, qtdeVendida))
        {
            this.historico.add("Venda realizada: " + qtdeVendida + " unidades");
        }
    }

    public void comprar(String dataCompra, Fornecedor fornecedor, int qtdeCompra, int precoUnit)
    {
        Compra compra = new Compra(dataCompra, this, fornecedor, qtdeCompra, precoUnit);
        if(compra.comprar(this, qtdeCompra))
        {
            this.historico.add("Compra realizada: " + qtdeCompra + " unidades");
        }
    }

    public void registrarHistorico(String transacao)
    {
        if(this.historico == null)
        {
            this.historico = new ArrayList<>();
        }
        this.historico.add(transacao);
    }

    public String obterHistorico() {
        StringBuilder historicoString = new StringBuilder();

        if (this.historico == null || this.historico.isEmpty()) {
            historicoString.append("Histórico vazio");
        } else {
            historicoString.append("Histórico do Produto:\n");
            for (String transacao : this.historico) {
                historicoString.append(transacao).append("\n");
            }
        }
        return historicoString.toString();
    }
}
