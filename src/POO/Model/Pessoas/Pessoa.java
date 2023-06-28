package POO.Model.Pessoas;

public abstract class Pessoa {
    protected String nome;
    protected long cpf;
    protected long rg;
    protected String cidadeNatal;
    protected String dataNsc;

    public Pessoa(String nome, long cpf, long rg, String cidadeNatal, String dataNsc) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.cidadeNatal = cidadeNatal;
        this.dataNsc = dataNsc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public String getCidadeNatal() {
        return cidadeNatal;
    }

    public void setCidadeNatal(String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }

    public String getDataNsc() {
        return dataNsc;
    }

    public void setDataNsc(String dataNsc) {
        this.dataNsc = dataNsc;
    }

    public void infPessoa(){
        System.out.println("Nome => "+this.getNome());
        System.out.println("CPF => "+this.getCpf());
        System.out.println("RG => "+this.getRg());
        System.out.println("Cidade Natal => "+this.getCidadeNatal());
        System.out.println("Data de Nascimento => "+this.getDataNsc());
    }
}
