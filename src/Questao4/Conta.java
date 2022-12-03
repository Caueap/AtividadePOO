package Questao4;

public class Conta {

    protected String numero;
    protected PessoaFisica clienteFisico;
    protected PessoaJuridica clienteJuridico;
    protected double saldo;
    private int index;
    private String estado;

    public Conta() {
        int n = (int) (Math.random() * 10000 + 1);
        String numConta = "c" + n;
        this.numero = numConta;
    }

    public Conta(PessoaFisica clienteFisico) {
        this();
        this.index = 1;
        this.clienteFisico = clienteFisico;
    }

    public Conta(PessoaJuridica clienteJuridico) {
        this();
        this.index = 2;
        this.clienteJuridico = clienteJuridico;
    }

    private String mostraFisico() {
        String saida = "--------------";
        saida += "\nNome: " + this.clienteFisico.toString();
        saida += "\nNumero: " + this.numero;
        saida = saida + "\nSaldo :" + this.saldo;
        saida += "\n-------------";
        return saida;
    }

    private String mostraJuridico() {
        String saida = "--------------";
        saida += "\ncnpj: " + this.clienteJuridico.getCnpj();
        saida += "\nrazaoSocial: " + this.clienteJuridico.getRazaoSocial();
        saida += "\nNumero: " + this.numero;
        saida = saida + "\nSaldo :" + this.saldo;
        saida += "\n-------------";
        return saida;
    }

    @Override
    public String toString() {
        if (this.index == 1) {
            this.estado = "\n" + mostraFisico();
        } else if (this.index == 2) {
            this.estado = "\n" + mostraJuridico();
        }
        return estado;
    }

    public void creditar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
        }
    }

    public void debitar(double valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        }
    }

}
