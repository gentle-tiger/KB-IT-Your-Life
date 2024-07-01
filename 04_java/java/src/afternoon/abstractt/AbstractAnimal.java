package afternoon.abstractt;

abstract class AbstractAnimal {

    // 추상 클래스 , 누군가에게 상속하기위해 만들어진 클래스
    // 메서드 이름만 작성하고 자식에게 상속함
    // 추상클래스는 중괄호가 없음
    // 추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩해서 사용해야한다.
    // 제약의 유뮤가 중요한 포인트임 (강제성)
    public abstract void sound();

    // overriding 하지 않아도 될 메서드. 해야될 메서드였다면 추상메서드로 작성했을 것임.
    public abstract void eat();

    // 순수 추상 메서드
    // 순수 추상 메서드는 실행되는 코드가 전혀 없으며 다형성을 위한 부모 클래스의 틀 역할만 한다.
}
