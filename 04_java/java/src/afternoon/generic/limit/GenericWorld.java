package afternoon.generic.limit;

public class GenericWorld <T>{
    private T value;

    public T getNumber() {
        return value;
    }

    public void setNumber(T value) {
        this.value = value;
    }

    // doubleValue() 메서드는 Java의 모든 숫자 타입을 상속하는 Number 클래스에서 제공하는 메서드이다.
    // doubleValue() 메서드는 숫자 타입의 값을 double 타입으로 변환해주는 유용한 메서드입니다.
    // 이 메서드는 해당 숫자 타입의 값을 double 타입으로 변환하여 반환한다.
    // Integer, Double, Long 등의 숫자 타입에서 이 메서드를 호출하면 각각의 값이 double로 변환됩니다.

    //
    // 현재 GenericWorld 클래스에서는 제네릭 타입 T를 사용하고 있습니다.
    // 제네릭 타입 T에는 상위 클래스인 Object 클래스의 메서드만 접근할 수 있습니다.
    // 따라서 value.doubleValue()를 호출할 수 없는 것입니다.
    //
    // doubleValue() 메서드를 사용하기 위해서는
    // 명시적으로 제네릭 타입 T를 Number 클래스나 그 하위 클래스로 제한해야 합니다.
    // 이렇게 하면 Number 클래스의 메서드인 doubleValue()를 사용할 수 있습니다.

    //
    // doubleValue() 메서드는 Number 클래스의 메서드로, 모든 숫자 타입(Integer, Double, Long 등)에서 사용할 수 있습니다.
    // 하지만 제네릭 타입 T는 Number일 수도 있고 다른 클래스일 수도 있기 때문에,
    // 컴파일러는 T가 어떤 클래스인지 확신할 수 없습니다.
    // 따라서 T에 직접적으로 doubleValue() 메서드를 호출할 수는 없습니다.
    @Override
    public String toString() {
        return "GenericWorld{" +
                "value=" + value +
                '}';
    }

    public double transDouble(){
        return ((Number) value).doubleValue();
    }
}
