package Questao1.exemplos.polimorfismo;

public class Pessoa {

    private String nome;

    public String definirNome(String curso) {
        if (curso.equals("Sistemas")) {
            this.nome = "Samuel";
        } else {
            this.nome = "Outro";
        }
        return this.nome;
    }

    public String definirNome(int idade) {
        if (idade == 21) {
            this.nome = "Ana";
        } else {
            this.nome = "Outro";
        }
        return this.nome;
    }

}