package afternoon.lang.wrapper;
// 오보 박싱, 오토 언박싱
public class WrapperMain {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(args[0]);
        Integer b = 10;
        Long c = 100L; // L을 붙여줘야 함.
        Double d = 11.25;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
