package afternoon.access;

public class Account {

    int balance;

    Account(int balance) {
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        balance -= amount;
    }


}
