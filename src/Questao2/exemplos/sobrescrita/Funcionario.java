package Questao2.exemplos.sobrescrita;

public class Funcionario {

    protected String nome;
    protected double salario;


    protected double bonusSalario() {
        double bonus = this.salario * 0.1;
        this.salario += bonus;
        return this.salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
