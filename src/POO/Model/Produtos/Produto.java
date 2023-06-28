package POO.Model.Produtos;

public abstract class Produto {
    protected String nome;
    protected String dataFabr;
    protected String dataVal;
    protected double valorUnidade;
    protected int quantidade;

    public Produto(String nome, String dataFabr, String dataVal, double valorUnidade, int quantidade) {
        this.nome = nome;
        this.dataFabr = dataFabr;
        this.dataVal = dataVal;
        this.valorUnidade = valorUnidade;
        this.quantidade = quantidade;
    }
    public double valorTotal(){
        return this.valorUnidade * quantidade;
    }
    public void infProduto(){
        System.out.println("Nome => " + this.nome);
        System.out.println("Data Fabricação => " + this.dataFabr);
        System.out.println("Data Validade => " + this.dataVal);
        System.out.println("Valor 1 Unidade => $" + this.valorUnidade);
        System.out.println("Quantas Unidades => " + this.quantidade);
        System.out.println("Valor Total => "+this.valorTotal());
    }
}
