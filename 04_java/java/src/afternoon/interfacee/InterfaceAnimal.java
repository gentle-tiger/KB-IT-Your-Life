package afternoon.interfacee;

public interface InterfaceAnimal {
//     인터페이스는 순수 추상 클래스에 약간의 제약과 편의 기능이 추가됨.
//     추가 기능 1. 메서드에 자동으로 public abstract 를 추가한다. 생략 가능.
//     추가 기능 2. 인터페이스는 다중 상속을 지원한다.
//     추가 기능 3. 메서드에 실제 구현 코드를 절대 가질 수 없음.
//     (제약이 많을수록 좋은 코드)
//    public abstract void eat();
//    public abstract void sound();
    void eat();
    void sound();

}
