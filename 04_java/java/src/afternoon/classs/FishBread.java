package afternoon.classs;

import java.util.Date;
// psvm이 없어야 함.
public class FishBread {

    String taste = "팥";
    String shape = "붕어";
    int price = 500;
    Date makeTime = new Date();

    //  기본 생성자
    FishBread(){}

    // 모든 값을 받는 생성자
    FishBread(String taste, String shape, int price){
        this.taste  = taste;
        this.shape = shape;
        this.price = price;
    }

    // 리턴 타입 void
    // printFishBread 메서드 내의 this.는 매개변수로 들어오는 값을 지칭한다.
    void printFishBread(){
        System.out.println("붕어빵의 맛은!? : " + this.taste);
        System.out.println("붕어빵의 모양은!? : " + this.shape);
        System.out.println("붕어빵의 가격은!? : " + this.price);
        System.out.println("붕어빵의 제조 시간은!? : " + this.makeTime);


    }








}
