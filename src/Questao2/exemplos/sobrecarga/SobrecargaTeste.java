package Questao2.exemplos.sobrecarga;

public class SobrecargaTeste {

    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        double c = 3.5;
        double d = 4.2;

        System.out.println(Sobrecarga.soma(a, b));
        System.out.println(Sobrecarga.soma(b, c, d));
    }
}
