package afternoon.classs;

import java.util.Arrays;

public class FIshBreadMain {
    public static void main(String[] args) {
        // 데이터 타입이 FishBread 이다.
        FishBread fish1 = new FishBread("마라맛","상어", 3000);
        fish1.printFishBread();

//        fish1.taste = "슈크림";
//        fish1.shape = "잉어";
//        fish1.price = 1000;

//        System.out.println("붕어빵의 맛은? " + fish1.taste);
//        System.out.println("붕어빵의 모양은? " + fish1.shape);
//        System.out.println("붕어빵의 가격은? " + fish1.price);
//        System.out.println("붕어빵이 만들어진 시간은? " + fish1.makeTime);

        FishBread fish2 = new FishBread();
        fish2.printFishBread();
        // 오버로딩 : 같은 이름이라도 매개변수의 유형 또는 개수가 다른 경우 다른 방법을 적용
//        System.out.println("붕어빵(2)의 맛은? " + fish2.taste);
//        System.out.println("붕어빵(2)의 모양은? " + fish2.shape);
//        System.out.println("붕어빵(2)의 가격은? " + fish2.price);
//        System.out.println("붕어빵(2)이 만들어진 시간은? " + fish2.makeTime);




    }
}
