package afternoon.access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(100);
        account.deposit(100);
        account.getBalance();

        //
        account.deposit(-100);
        account.withdraw(100);
        account.withdraw(-30);
        account.withdraw(-30);
        account.withdraw(1000); // balance에 문제가 생기는지 안 생기는지 확인.
        account.getBalance();
    }
}
