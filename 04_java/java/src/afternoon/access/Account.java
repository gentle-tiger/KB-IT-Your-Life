package afternoon.access;

public class Account {

    // 필드
    int balance;
    // 생성자
    Account(int balance) {
        this.balance = balance;
    }
    // 메서드
    void deposit(double amount) {
        this.balance += amount;
    }
    void withdraw(double amount) {
        this.balance -= amount;
        this.balance -= amount;
        this.balance -= amount;
    }


}
