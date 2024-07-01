package afternoon.lang.math;

import java.util.Random; // util 패키지 import

public class RandomMain {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println(random.nextInt()); // int 범위의 +- 정수값.
        System.out.println(random.nextDouble()); // 0 ~ 1.0 소수
        System.out.println(random.nextBoolean()); // T, F

        System.out.println(random.nextInt(100)); // 0 ~ 99


    }
}
