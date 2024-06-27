package afternoon.polyfinal;

public class PaySystem {
    private Pay pay;

//    매개변수를 받아 자신의 매개변수를 변경한다
    public void setPay(Pay pay){
        this.pay = pay;
    }

    public void payment(int amount){
        System.out.println("결제를 시작합니다.");
//      pay로 들어오는 타입의 값은 KBPay, KakaoPay 가 된다.
        pay.pay(amount);
    }
}
