package Questao1.exemplos.encapsulamento;

public class User {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        if (this.password.length() >= 10) {
            System.out.println("Senha cadastrada com sucesso");
            System.out.println(getPassword());
        } else {
            System.out.println("A senha deve ter pelo menos 10 caracteres");
        }
    }
}
