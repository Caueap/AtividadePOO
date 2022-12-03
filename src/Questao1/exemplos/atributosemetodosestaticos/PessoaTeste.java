package Questao1.exemplos.atributosemetodosestaticos;



public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        System.out.println("A pessoa1 tem " + pessoa1.getIdade() + " anos");
        System.out.println("A pessoa2 também tem " + pessoa2.getIdade() + " anos");

        System.out.println(Pessoa.somarDoisNumeros(3, 5));
        System.out.println(pessoa1.multiplicarDoisNumeros(4, 3));
    }
}

