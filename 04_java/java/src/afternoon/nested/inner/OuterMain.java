package afternoon.nested.inner;

// 내부 클래스
public class OuterMain {
    public static void main(String[] args) {

        Outer outer = new Outer();

//        Outer.Inner inner = new Outer.Inner();
//       inner 클래스는 실체가 없는 클래스이기 때문에 outer 클래스를 따라서 해야한다.
        Outer.Inner inner = outer.new Inner(); // 내부 클래스 인스턴스화

        // 내부 클래스
        // Nested ppt 64p
        inner.print();

    }
}
