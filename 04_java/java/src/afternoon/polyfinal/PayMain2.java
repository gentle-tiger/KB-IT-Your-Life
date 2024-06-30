package afternoon.polyfinal;

import java.util.Scanner;
// PayMain 캡슐화
public class PayMain2 {
    public static void main(String[] args) {
        PaySystem2 paySystem2 = new PaySystem2();

        paySystem2.selectPay();
        paySystem2.selectAmount();

    }
}
