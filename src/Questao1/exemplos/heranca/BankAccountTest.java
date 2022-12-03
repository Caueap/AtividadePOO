package Questao1.exemplos.heranca;

public class BankAccountTest {

    public static void main(String[] args) {

        SimpleBankAccount account = new SimpleBankAccount();
        SpecialBankAccount specialaccount = new SpecialBankAccount();

        account.setClientName("Rodrigo");
        account.setAccountNumber(123);
        account.setPhoneNumber("8888-8888");

        specialaccount.setClientName("André");
        specialaccount.setAccountNumber(1234);
        specialaccount.setSpecialNumber(1111);

        System.out.println("O nome do cliente é: " + account.getClientName());
        System.out.println("O número da conta é: " + account.getAccountNumber());
        System.out.println("O número de telefone do cliente é: " + account.getPhoneNumber());
        account.deposit(500);
        System.out.println("Seu saldo atual é: " + account.getBalance());
        account.draw(300);
        System.out.println("Seu saldo atual é: " + account.getBalance());

        System.out.println("\n-------------------------------------------------\n");

        System.out.println("O nome do cliente é: " + specialaccount.getClientName());
        System.out.println("O número da conta é: " + specialaccount.getAccountNumber());
        System.out.println("O número especial da conta é: " + specialaccount.getSpecialNumber());
        specialaccount.deposit(1000);
        System.out.println("Seu saldo atual é: " + specialaccount.getBalance());
        specialaccount.draw(200);
        System.out.println("Seu saldo atual é: " + specialaccount.getBalance());






    }
}
