package afternoon.nested.inner.ex3;

public class OuterClass2 {

    // [비정적 내부 클래스(non-static inner class)의 특성]

    // 내부 클래스는 외부 클래스의 인스턴스에 종속된다. (종속성)
    // 내부 클래스는 자신만의 주소값을 가지지만, 해당 주소는 외부 클래스의 인스턴스와 연관되어 있다. (주소값)
    // 외부 클래스가 내부 클래스의 인스턴스 없이 존재할 수 없는 이유는
    // 내부 클래스가 외부 클래스의 인스턴스 맥락(content)을 필요로 하기 때문이다. (맥락 필요성)
    // 따라서, 내부 클래스의 인스턴스는 외부 클래스의 인스턴스와 함께 존재해야 한다. (공존)
    public class InnerClass {
        public void hello(){
            System.out.println("안녕하세요 내부 클래스의 hello 입니다.");
        }
    }
}
