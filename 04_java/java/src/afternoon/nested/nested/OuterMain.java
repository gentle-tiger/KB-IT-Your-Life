package afternoon.nested.nested;

public class OuterMain {
    public static void main(String[] args) {

        Outer outer = new Outer();

        // 무엇을 인스턴스시킨 것인가??
        Outer.Nested nested = new Outer.Nested();

        // 중첩클래스에 대한 설명 (with. 내부 클래스)
        // 특정 클래스 내부에서만 사용이 되어 외부 노출이 굳이 필요 없을 떄!
        // 특정 클래스 내부의 private 멤버에 대한 접근이 필요할 때!
        nested.print();

    }
}
