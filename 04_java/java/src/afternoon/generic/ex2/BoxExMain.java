package afternoon.generic.ex2;

public class BoxExMain {
    public static void main(String[] args) {

        // StrictGenericBox 클래스의 T 타입 파라미터를 통해 다양한 타입을 지원하고 있으며,
        // BoxExMain 클래스에서 이를 확인할 수 있습니다.

        //StrictGenericBox<String>는 String 타입의 값을 저장합니다.
        //StrictGenericBox<Integer>는 Integer 타입의 값을 저장합니다.
        //StrictGenericBox<Double>는 Double 타입의 값을 저장합니다. 이런 느낌이다...
        StrictGenericBox<String> strictGenericBox1 = new StrictGenericBox<>();
        strictGenericBox1.setValue("hello");
        System.out.println("strictGenericBox1's value = " + strictGenericBox1.getValue());

        StrictGenericBox<Integer> strictGenericBox2 = new StrictGenericBox<>();
        strictGenericBox2.setValue(100);
        System.out.println("strictGenericBox2's value = " + strictGenericBox2.getValue());

        StrictGenericBox<Double> strictGenericBox3 = new StrictGenericBox<>();
        strictGenericBox3.setValue(3.0);
        System.out.println("strictGenericBox3's value = " + strictGenericBox3.getValue());

    }
}
