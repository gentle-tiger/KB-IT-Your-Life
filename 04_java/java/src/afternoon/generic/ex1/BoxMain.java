package afternoon.generic.ex1;

// ObjectBox 클래스를 사용하는 경우
public class BoxMain {
    public static void main(String[] args) {

        // 중복되는 것을 다시 만들 필요가 없어졌다. 
        ObjectBox integerBox = new ObjectBox();
        integerBox.setObj(10);
        // 다운캐스팅 하는 이유는?? Integer가 Object를 하지 않기 떄문..?
        Integer integer = (Integer) integerBox.getObj(); // 값을 꺼내서 대입한다. 
        System.out.println("Integer = " + integer);

        //다만 이렇게 했을 경우 다운캐스팅의 문제가 생긴다. 
        integerBox.setObj("100"); // 실수 한 부분, 숫자에 문자열 대입. 
        Integer integer2 = (Integer) integerBox.getObj();
        System.out.println("integer2 = " + integer2); // ClassCastException 발생하는 것을 볼 수 있다. 런타입 예외가 발생한다.(가장 안 좋은 예외)

        // 1. 타입이 바뀔 떄마다 새로운 코드를 작성해야한다.
        // 2. 타입을 바꿔주지 않으면 ClassCastException 발생한다.

        ObjectBox stringBox = new ObjectBox();
        stringBox.setObj("hello");
        String string = (String) stringBox.getObj(); // 값을 꺼내서 대입한다.
        System.out.println("String = " + string);


    }
}
