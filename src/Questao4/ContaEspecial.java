package Questao4;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(PessoaFisica clienteFisico) {
        super(clienteFisico);
        this.limite = 500;
        this.numero += "S";
    }

    public ContaEspecial(PessoaFisica clienteFisico, double saldo) {
        this(clienteFisico);
        this.saldo = saldo;
    }

    public ContaEspecial(PessoaJuridica clienteJuridico) {
        super(clienteJuridico);
        this.limite = 500;
        this.numero += "S";
    }

    public ContaEspecial(PessoaJuridica clienteJuridico, double saldo) {
        this(clienteJuridico);
        this.saldo = saldo;
    }

    @Override
    public void debitar(double valor) {
        double saldoTotal = saldo + limite;
        if(valor <= saldoTotal) {
            this.saldo = this.saldo - valor;
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nLimite: "+this.limite+
                "\nStaldo Total: "+(this.limite + this.saldo)+
                "\n-----------------\n";
    }
}
