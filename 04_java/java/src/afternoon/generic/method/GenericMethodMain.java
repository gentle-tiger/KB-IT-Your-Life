package afternoon.generic.method;

public class GenericMethodMain {
    public static void main(String[] args) {

        // 메서드의 호출 시점에 해당 메서드의 리턴 타입을 <> 으로 전달한다.
        // Integer를 제네릭에 전달한 것이다.

        Integer integer = GenericMethod.<Integer>genericMethod(70);
        Integer integer1 = GenericMethod.genericMethod(70); // 70을 통해 타입 추론 가능.
//      Integer double = GenericMethod.<Double>genericMethod(70); Integer 가 아닌 타입을 에러를 발생.
//      Integer integer2 = GenericMethod.<String>genericMethod(70);

        System.out.println(integer);


    }
}
