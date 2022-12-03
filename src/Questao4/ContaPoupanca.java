package Questao4;

public class ContaPoupanca extends Conta {

	private static double taxa = 0.1;

	public ContaPoupanca(PessoaFisica clienteFisico, double saldo) {
		super(clienteFisico);
		creditar(saldo);
	}

	public ContaPoupanca(PessoaJuridica clienteJuridico, double saldo) {
		super(clienteJuridico);
		creditar(saldo);
	}
	
	public void rendeJuros() {
		creditar(taxa*this.saldo);
	}
}
