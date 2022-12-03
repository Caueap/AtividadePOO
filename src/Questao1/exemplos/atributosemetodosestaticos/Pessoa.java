package Questao1.exemplos.atributosemetodosestaticos;

public class Pessoa {

    private String nome;
    private static int idade = 25;
    private int cpf;

    public static double somarDoisNumeros(double a, double b) {
        return a + b;
    }

    public double multiplicarDoisNumeros(int a, int b) {
        return a * b;
    }

    public int getIdade() {
        return idade;
    }

}