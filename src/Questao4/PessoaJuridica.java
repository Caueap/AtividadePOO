package Questao4;

public class PessoaJuridica extends Pessoa {

    protected int cnpj;
    protected String razaoSocial;

    public PessoaJuridica(int cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public int getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
}
