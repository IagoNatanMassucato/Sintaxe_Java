package POO.Model.Pessoas;

import POO.Enum.TipoCliente;

public class Cliente extends Pessoa {
    private TipoCliente tipoCliente;

    public Cliente(String nome, long cpf, long rg, String cidadeNatal, String dataNsc, TipoCliente tipoCliente) {
        super(nome, cpf, rg, cidadeNatal, dataNsc);
        this.tipoCliente = tipoCliente;
    }

    @Override
    public void infPessoa() {
        super.infPessoa();
        System.out.println("Tipo Cliente => "+this.getTipoCliente());
        System.out.println();
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
