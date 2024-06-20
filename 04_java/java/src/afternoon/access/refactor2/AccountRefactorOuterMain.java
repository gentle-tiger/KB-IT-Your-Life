package afternoon.access.refactor2;

import afternoon.access.refactor.AccountRefactor;

public class AccountRefactorOuterMain {
    public static void main(String[] args) {
//         package 가 다른 상황임.
        AccountRefactor account = new AccountRefactor("국민은행", "브론즈", "이효석", 1000);

//        public 요소 접근
        System.out.println(account.bank);

//         패키지가 달라서 접근이 안 됨.
//        System.out.println(account.grade);

    }
}
