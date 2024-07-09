package afternoon.generic.method;

public class GenericMethod {

    // 타입은 <T> 지정하고 바로 return 타입으로 T로 지정한다.
    // 이후 매개변수로 들어오는 값을 T타입의 t로 받겠다.
    public static <T> T genericMethod(T t) {
        return t;
    }

    // 제네릭 타입 제한자
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("t = " + t);
        return t;
    }


}
