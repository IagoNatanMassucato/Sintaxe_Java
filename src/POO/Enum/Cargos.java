package POO.Enum;

public enum Cargos {
    ADMINISTRADOR(1), CONTADOR(2), RH(3), ALMOXARIFADO(4), HIGENIZACAO(5), MANUTENCAO(6), TEC_INFORMATICA(7);
    private int cargo;

    Cargos(int cargo) {
        this.cargo = cargo;
    }
}
