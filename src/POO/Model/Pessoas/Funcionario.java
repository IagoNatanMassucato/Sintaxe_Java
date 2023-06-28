package POO.Model.Pessoas;

import POO.Enum.Cargos;

public class Funcionario extends Pessoa {
    private Cargos cagos;
    private String dataContrato;

    public Funcionario(String nome, long cpf, long rg, String localNsc, String dataNsc, Cargos cagos, String dataContrato) {
        super(nome, cpf, rg, localNsc, dataNsc);
        this.cagos = cagos;
        this.dataContrato = dataContrato;
    }

    public Cargos getCagos() {
        return cagos;
    }

    public void setCagos(Cargos cagos) {
        this.cagos = cagos;
    }

    public String getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(String dataContrato) {
        this.dataContrato = dataContrato;
    }

    @Override
    public void infPessoa() {
        super.infPessoa();
        System.out.println("Cargo => "+this.getCagos());
        System.out.println("Data do Contrato => "+this.getDataContrato());
        System.out.println();
    }
}
