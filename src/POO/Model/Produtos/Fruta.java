package POO.Model.Produtos;

import POO.Interface.Imposto;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Fruta extends Produto implements Imposto {
    private int imposto;

    public Fruta(String nome, String dataFabr, String dataVal, double valorUnidade, int quantidade, int imposto) {
        super(nome, dataFabr, dataVal, valorUnidade, quantidade);
        this.imposto = imposto;
    }
    @Override
    public double calcularImposto() {
        return valorTotal() + (valorTotal() * this.imposto / 100);
    }

    public double cacularLucro(){
        return calcularImposto() + (calcularImposto() * 35 / 100);
    }

    public double lucro(){
        return cacularLucro() - calcularImposto();
    }
    public int getImposto() {
        return imposto;
    }

    String padraoReais = "###,###.##";
    DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt","Brazil"));
    DecimalFormat df = new DecimalFormat(padraoReais, dfs);

    @Override
    public void infProduto() {
        super.infProduto();
        System.out.println("Valor Total + "+this.getImposto()+"% de Imposto => $"+df.format(calcularImposto()));
        System.out.println("Investimento + 25% de Lucro => $"+df.format(cacularLucro())+" Lucro => $"+df.format(lucro()));
        System.out.println();
    }
}
