package afternoon.access.refactor;


public class AccountRefactorMain {
    public static void main(String[] args) {

        // public , default , private , private
        // 이론상 접근 가능한 것과 가능하지 않은 것이 있을 것이다.
        // 하지만,
        AccountRefactor account = new AccountRefactor("국민은행", "골드", "최호진", 100000);

        //public
        System.out.println("public : " + account.bank);
        // default -> 같은 패키지에서는 접근 가능
        System.out.println("defalut : " + account.grade);
        // private
//        System.out.println("private : " + account.name);


    }
}
