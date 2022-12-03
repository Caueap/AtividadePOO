package Questao1.exemplos.polimorfismo;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Pessoa pessoa4 = new Pessoa();

        System.out.println(pessoa1.definirNome("Sistemas"));
        System.out.println(pessoa2.definirNome("Direito"));
        System.out.println(pessoa3.definirNome(21));
        System.out.println(pessoa4.definirNome(22));

    }
}
