package afternoon.generic.limit;

public class World1 {
    public static void main(String[] args) {

        // 이건 자바 컴파일러가 해주는 것이다.
        IntegerWorld integerWorld = new IntegerWorld();
        integerWorld.setNumber(10);
        System.out.println("integerWorld.getNumber(10) = " + integerWorld.getNumber());

        IntegerWorld integerWorld2 = new IntegerWorld();
//        integerWorld.setNumber(10.3); // type은 Integer만 가능.
        System.out.println("integerWorld2 = " + integerWorld2);
        System.out.println("integerWorld2 = " + integerWorld.getNumber());

    LongWorld longWorld = new LongWorld();
    longWorld.setNumber(10L); // 10 이 아닌 10L
        System.out.println(longWorld.getNumber());


    }
}
