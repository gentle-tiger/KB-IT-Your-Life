package afternoon.polyfinal;

import java.util.Scanner;

public class PaySystem2 {
    private Pay pay;
    Scanner sc = new Scanner(System.in);

    //    매개변수를 받아 자신의 매개변수를 변경한다
    public void setPay(Pay pay) {
        this.pay = pay;
    }



    public void selectPay() {
        System.out.print("결제 옵션을 입력하세요 : (1. KB페이 / 2. 카카오페이 / 3. 네이버페이): ");
        int option = sc.nextInt();
        this.findPay(option);
    }

    public void selectAmount(){
        System.out.println("결제 금액을 입력하세요 : ");
        int amount = sc.nextInt();
        this.payment(amount);
    }

    public void findPay(int option){
//       if 문의 코드는 동일한 코드이다.
//       옵션에 따라 다른 객체가 실행되는 것을 볼 수 있다.
        if(option == 1){
            KBPay kbPay = new KBPay();
            this.setPay(kbPay);
        }else if(option == 2){
            this.setPay(new KakaoPay());
        }else if(option == 3){
            this.setPay(new NaverPay());
        }
    }




    public void payment(int amount) {
        System.out.println("결제를 시작합니다.");
//      pay로 들어오는 타입의 값은 KBPay, KakaoPay 가 된다.
        pay.pay(amount);
    }
}
