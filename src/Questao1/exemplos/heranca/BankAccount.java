package Questao1.exemplos.heranca;

public class BankAccount {

    private String clientName;
    private int accountNumber;
    private double balance;

    protected void deposit(double value) {
        this.balance += value;
    }

    protected void draw(double value) {
        if (this.balance == 0) {
            System.out.println("Saldo insuficiente");
        } else {
            this.balance -= value;
        }
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}

