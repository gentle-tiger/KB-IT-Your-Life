package afternoon.lang.wrapper;
// wrapper 주요 메서드.
public class WrapperMethodMain {
    public static void main(String[] args) {
//        문자룰 숫자형으로 담는다. 
        int intValue = Integer.parseInt("100");
        System.out.println("intValue = " + intValue);

//      비교
        Integer a  = 10;
        System.out.println("compareTo : " +a.compareTo(20)); // 같으면 1, 다르면 -1

//      산술연산 Integer 클래스에 static이 붙어있기 떄문에 sum을 사용할 수 있는 것.
        System.out.println("sum : " + Integer.sum(10,20));
        System.out.println("min : " + Integer.min(10,20));
        System.out.println("max : " + Integer.max(10,20));

    }
}
