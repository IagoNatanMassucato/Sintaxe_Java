package POO.Enum;

public enum TipoCliente {

    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);
    int tipoCliente;

    TipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
