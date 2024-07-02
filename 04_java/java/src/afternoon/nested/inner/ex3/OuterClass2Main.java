package afternoon.nested.inner.ex3;

public class OuterClass2Main {
    public static void main(String[] args) {

        // 2번으로 인스턴스화할 경우 객체가 생성되지 않는다.
        // 비정적 내부 클래스는 외부 클래스의 인스턴스가 필요하기 때문에
        // 반드시 외부 클래스의 인스턴스를 통해 내부 클래스의 인스턴스를 생성해야 한다.

        // 외부 클래스 인스턴스 생성
        OuterClass2 outerClass2 = new OuterClass2();

        // 비정적 내부 클래스 인스턴스 생성 (올바른 방법)
        OuterClass2.InnerClass innerClass = outerClass2.new InnerClass(); // 1번
//        OuterClass2.InnerClass innerClass = OuterClass2.new InnerClass(); // 2번 (컴파일 오류 발생)
//        OuterClass2.InnerClass innerClass = new outerClass2.new InnerClass(); // 외부 클래스를 바로 생성할 수도 있다.

        innerClass.hello();
    }
}
