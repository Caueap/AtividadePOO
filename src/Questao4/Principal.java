package Questao4;

public class Principal {
	public static void main(String[] args) {
		PessoaFisica jeova = new PessoaFisica("Jeová", "Tavares", 37);
		Conta c = new Conta(jeova);
		c.creditar(2000.0);
		c.debitar(100);
		
		PessoaFisica samuel = new PessoaFisica("Samuel", "Rodrigues", 37);
		ContaEspecial c2 = new ContaEspecial(samuel, 200);

		c2.debitar(500);

		ContaPoupanca c3 = new ContaPoupanca
				(new PessoaFisica("Agamenon", "Quinderé", 25), 10000);

		c3.rendeJuros();
				
		System.out.println(c);

		System.out.println(c2);

		System.out.println(c3);

		PessoaJuridica empresaX = new PessoaJuridica(12345, "razaoSocial1");
		Conta cj = new Conta(empresaX);
		cj.creditar(2000.0);
		cj.debitar(100);

		System.out.println(cj);

		PessoaJuridica empresaY = new PessoaJuridica(123, "razaoSocial2");
		ContaEspecial cj2 = new ContaEspecial(empresaY, 200);

		c2.debitar(500);

		System.out.println(cj2);

		ContaPoupanca cj3 = new ContaPoupanca
				(new PessoaJuridica(1234, "razaoSocial3"), 10000);

		c3.rendeJuros();

		System.out.println(cj3);
	}
}
