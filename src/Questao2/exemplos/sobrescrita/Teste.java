package Questao2.exemplos.sobrescrita;

public class Teste {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();

        funcionario.setSalario(100);
        funcionario.bonusSalario();
        System.out.println("Seu salário com o bônus é: " + funcionario.getSalario());

        gerente.setSalario(100);
        gerente.bonusSalario();
        System.out.println("Seu salário com o bônus é: " + gerente.getSalario());

    }
}
