package afternoon.access.refactor;

public class AccountRefactor {

    public String bank;   // public
    String grade ;        // default
    private String name ; // private
    private int balance;  // private


    // 기본 클래스
    public AccountRefactor(String bank, String grade, String name, int balance){
        this.bank = bank;
        this.grade = grade;
        this.name = name;
        this.balance = balance;
    }





}
