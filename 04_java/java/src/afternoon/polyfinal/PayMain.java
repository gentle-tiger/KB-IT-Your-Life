package afternoon.polyfinal;

import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        PaySystem paySystem = new PaySystem();
        Scanner sc = new Scanner(System.in);

        int option; // 사용자로부터 입력받은 결제 옵션
        int amount; // 사용자로부터 입력받은 결제 금액
//        int option, amount;


        System.out.print("결제 옵션을 입력하세요 : (1. KB페이 / 2. 카카오페이 / 3. 네이버페이): ");
        option = sc.nextInt();

        System.out.println("결제 금액을 입력하세요 : ");
        amount = sc.nextInt();

//       if 문의 코드는 동일한 코드이다.
//       옵션에 따라 다른 객체가 실행되는 것을 볼 수 있다.
        if(option == 1){
            KBPay kbPay = new KBPay();
            paySystem.setPay(kbPay);
        }else if(option == 2){
            paySystem.setPay(new KakaoPay());
        }else if(option == 3){
            paySystem.setPay(new NaverPay());
        }

        paySystem.payment(amount);

    }

}
