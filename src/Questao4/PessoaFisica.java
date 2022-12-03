package Questao4;

public class PessoaFisica extends Pessoa {

    protected String sobrenome;
    protected int idade;

    public PessoaFisica(String nome, String sobrenome, int idade) {
        super(nome);
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String fullName() {
        return super.nome + " " + sobrenome;
    }

    @Override
    public String toString() {
        return fullName()+ ", com "+ idade+ " anos.";
    }
}
