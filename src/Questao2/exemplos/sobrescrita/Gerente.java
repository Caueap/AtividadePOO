package Questao2.exemplos.sobrescrita;

public class Gerente extends Funcionario {

    protected String categoria;

    @Override
    protected double bonusSalario() {
        double bonus = this.salario * 0.2;
        this.salario += bonus;
        return this.salario;
    }



}
